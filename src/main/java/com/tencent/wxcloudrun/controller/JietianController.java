package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.entity.JietianEntity;
import com.tencent.wxcloudrun.service.JietianService;
import com.tencent.wxcloudrun.utils.PageUtils;
import com.tencent.wxcloudrun.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 街天
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:58:27
 */
@RestController
@RequestMapping("jietian")
public class JietianController {
    @Autowired
    private JietianService jietianService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("wxcloudrun:jietian:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = jietianService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("wxcloudrun:jietian:info")
    public R info(@PathVariable("id") Integer id) {
        JietianEntity jietian = jietianService.getById(id);

        return R.ok().put("jietian", jietian);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("wxcloudrun:jietian:save")
    public R save(@RequestBody JietianEntity jietian) {
        jietianService.save(jietian);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("wxcloudrun:jietian:update")
    public R update(@RequestBody JietianEntity jietian) {
        jietianService.updateById(jietian);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("wxcloudrun:jietian:delete")
    public R delete(@RequestBody Integer[] ids) {
        jietianService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
