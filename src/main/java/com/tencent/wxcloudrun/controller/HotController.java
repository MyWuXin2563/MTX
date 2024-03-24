package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.entity.HotEntity;
import com.tencent.wxcloudrun.service.HotService;
import com.tencent.wxcloudrun.utils.PageUtils;
import com.tencent.wxcloudrun.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 热点信息
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:58:27
 */
@RestController
@RequestMapping("hot")
public class HotController {
    @Autowired
    private HotService hotService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("wxcloudrun:hot:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = hotService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("wxcloudrun:hot:info")
    public R info(@PathVariable("id") Integer id) {
        HotEntity hot = hotService.getById(id);

        return R.ok().put("hot", hot);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("wxcloudrun:hot:save")
    public R save(@RequestBody HotEntity hot) {
        hotService.save(hot);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("wxcloudrun:hot:update")
    public R update(@RequestBody HotEntity hot) {
        hotService.updateById(hot);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("wxcloudrun:hot:delete")
    public R delete(@RequestBody Integer[] ids) {
        hotService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
