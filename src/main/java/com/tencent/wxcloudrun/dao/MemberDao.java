package com.tencent.wxcloudrun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.wxcloudrun.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表,会员表
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:04:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
