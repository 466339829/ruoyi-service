package com.ruoyi.product.entity;

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
 * 首页-轮播图表
 * </p>
 *
 * @author yong
 * @since 2025-02-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("pms_banner")
public class Banner implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 三级分类id
     */
    private String categoryId;

    /**
     * 图片
     */
    private String imgUrl;

    /**
     * 是否显示
     */
    private String status;

    /**
     * 排序
     */
    private String sort;

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
