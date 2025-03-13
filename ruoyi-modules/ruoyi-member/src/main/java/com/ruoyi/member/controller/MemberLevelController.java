package com.ruoyi.member.controller;


import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.member.entity.MemberLevel;
import com.ruoyi.member.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 会员等级 前端控制器
 * </p>
 *
 * @author yong
 * @since 2025-01-13
 */
@RestController
@RequestMapping("/memberLevel")
public class MemberLevelController extends BaseController {

    @Autowired
    private MemberLevelService memberLevelService;

    @GetMapping("/list")
    public TableDataInfo list(MemberLevel memberLeve)
    {
        startPage();
        List<MemberLevel> list = memberLevelService.selectList(memberLeve);
        return getDataTable(list);
    }

    @GetMapping(value = "/selectById/{brandId}")
    public AjaxResult getInfo(@PathVariable String brandId)
    {
        return success(memberLevelService.getById(brandId));
    }

    @PostMapping("/add")
    public AjaxResult add(@Validated @RequestBody MemberLevel memberLeve)
    {
        memberLeve.setCreateBy(SecurityUtils.getUsername());
        return toAjax(memberLevelService.add(memberLeve));
    }

    @PostMapping("/edit")
    public AjaxResult update(@Validated @RequestBody MemberLevel memberLeve)
    {
        memberLeve.setCreateBy(SecurityUtils.getUsername());
        return toAjax(memberLevelService.updateById(memberLeve));
    }

    @GetMapping("/delete/{memberLeveIds}")
    public AjaxResult remove(@PathVariable String[] memberLeveIds)
    {
        return toAjax(memberLevelService.removeByIds(Arrays.asList(memberLeveIds)));
    }
}

