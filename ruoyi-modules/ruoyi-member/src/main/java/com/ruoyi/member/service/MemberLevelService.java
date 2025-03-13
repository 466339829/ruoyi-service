package com.ruoyi.member.service;

import com.ruoyi.member.entity.MemberLevel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 会员等级 服务类
 * </p>
 *
 * @author yong
 * @since 2025-01-13
 */
public interface MemberLevelService extends IService<MemberLevel> {

    List<MemberLevel> selectList(MemberLevel memberLeve);

    boolean add(MemberLevel memberLeve);
}
