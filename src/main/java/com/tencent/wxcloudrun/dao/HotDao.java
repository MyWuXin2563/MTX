package com.tencent.wxcloudrun.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.wxcloudrun.entity.HotEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 热点信息
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:58:27
 */
@Mapper
public interface HotDao extends BaseMapper<HotEntity> {

}
