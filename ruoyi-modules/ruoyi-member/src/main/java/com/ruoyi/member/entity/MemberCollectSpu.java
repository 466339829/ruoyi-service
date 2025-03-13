package com.ruoyi.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员收藏的商品
 * </p>
 *
 * @author yong
 * @since 2025-01-15
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("ums_member_collect_spu")
public class MemberCollectSpu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * spu_id
     */
    private String spuId;

    /**
     * spu_name
     */
    private String spuName;

    /**
     * spu_img
     */
    private String spuImg;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    private String remark;


}
