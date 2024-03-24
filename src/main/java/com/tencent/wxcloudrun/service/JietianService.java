package com.tencent.wxcloudrun.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.tencent.wxcloudrun.entity.JietianEntity;
import com.tencent.wxcloudrun.utils.PageUtils;

import java.util.Map;

/**
 * 街天
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:58:27
 */
public interface JietianService extends IService<JietianEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

