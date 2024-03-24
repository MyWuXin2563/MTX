package com.tencent.wxcloudrun.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.HotDao;
import com.tencent.wxcloudrun.entity.HotEntity;
import com.tencent.wxcloudrun.service.HotService;
import com.tencent.wxcloudrun.utils.PageUtils;
import com.tencent.wxcloudrun.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("hotService")
public class HotServiceImpl extends ServiceImpl<HotDao, HotEntity> implements HotService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HotEntity> page = this.page(
                new Query<HotEntity>().getPage(params),
                new QueryWrapper<HotEntity>()
        );

        return new PageUtils(page);
    }

}