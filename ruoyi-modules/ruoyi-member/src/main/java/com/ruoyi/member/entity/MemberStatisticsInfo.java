package com.ruoyi.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员统计信息
 * </p>
 *
 * @author yong
 * @since 2025-01-15
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfo implements Serializable {

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
     * 累计消费金额
     */
    private BigDecimal consumeAmount;

    /**
     * 累计优惠金额
     */
    private BigDecimal couponAmount;

    /**
     * 订单数量
     */
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    private Integer couponCount;

    /**
     * 评价数
     */
    private Integer commentCount;

    /**
     * 退货数量
     */
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 关注数量
     */
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    private Integer fansCount;

    /**
     * 收藏的商品数量
     */
    private Integer collectProductCount;

    /**
     * 收藏的专题活动数量
     */
    private Integer collectSubjectCount;

    /**
     * 收藏的评论数量
     */
    private Integer collectCommentCount;

    /**
     * 邀请的朋友数量
     */
    private Integer inviteFriendCount;

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
