package com.ruoyi.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ruoyi.common.core.SnowFlakeUtil;
import com.ruoyi.common.core.utils.StringUtils;
import com.ruoyi.member.entity.MemberLevel;
import com.ruoyi.member.mapper.MemberLevelMapper;
import com.ruoyi.member.service.MemberLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 会员等级 服务实现类
 * </p>
 *
 * @author yong
 * @since 2025-01-13
 */
@Service
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements MemberLevelService {

    @Override
    public List<MemberLevel> selectList(MemberLevel memberLeve) {
        QueryWrapper<MemberLevel> wrapper = new QueryWrapper<>();
        String name = memberLeve.getName();
        if (StringUtils.isNotEmpty(name)){
            wrapper.like("name", name);
        }
        return baseMapper.selectList(wrapper);
    }

    @Override
    public boolean add(MemberLevel memberLeve) {
        memberLeve.setId(String.valueOf(SnowFlakeUtil.getSnowFlakeId()));
        baseMapper.insert(memberLeve);
        return true;
    }
}
