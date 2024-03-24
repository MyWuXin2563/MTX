package com.tencent.wxcloudrun.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.JietianDao;
import com.tencent.wxcloudrun.entity.JietianEntity;
import com.tencent.wxcloudrun.service.JietianService;
import com.tencent.wxcloudrun.utils.PageUtils;
import com.tencent.wxcloudrun.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("jietianService")
public class JietianServiceImpl extends ServiceImpl<JietianDao, JietianEntity> implements JietianService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<JietianEntity> page = this.page(
                new Query<JietianEntity>().getPage(params),
                new QueryWrapper<JietianEntity>()
        );

        return new PageUtils(page);
    }

}