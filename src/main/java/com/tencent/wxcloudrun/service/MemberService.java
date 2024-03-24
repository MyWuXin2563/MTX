package com.tencent.wxcloudrun.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tencent.wxcloudrun.entity.MemberEntity;
import com.tencent.wxcloudrun.utils.PageUtils;

import java.util.Map;

/**
 * 用户表,会员表
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:04:45
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

