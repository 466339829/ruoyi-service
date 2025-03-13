package com.ruoyi.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ruoyi.common.core.web.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员等级
 * </p>
 *
 * @author yong
 * @since 2025-01-15
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("ums_member_level")
public class MemberLevel extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 等级名称
     */
    private String name;

    /**
     * 等级需要的成长值
     */
    private BigDecimal growthPoint;

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    private String defaultStatus;

    /**
     * 免运费标准
     */
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    private BigDecimal commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    private String priviledgeFreeFreight;

    /**
     * 是否有会员价格特权
     */
    private String priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    private String priviledgeBirthday;

    /**
     * 备注
     */
    private String note;

}
