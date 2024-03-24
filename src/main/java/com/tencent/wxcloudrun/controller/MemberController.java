package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.entity.MemberEntity;
import com.tencent.wxcloudrun.service.MemberService;
import com.tencent.wxcloudrun.utils.PageUtils;
import com.tencent.wxcloudrun.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 用户表,会员表
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:04:45
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions(":member:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions(":member:info")
    public R info(@PathVariable("id") Integer id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions(":member:save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions(":member:update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions(":member:delete")
    public R delete(@RequestBody Integer[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
