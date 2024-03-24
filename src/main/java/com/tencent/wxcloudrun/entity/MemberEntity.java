package com.tencent.wxcloudrun.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表,会员表
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:04:45
 */
@Data
@TableName("member")
public class MemberEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Integer id;
    /**
     *
     */
    private String username;
    /**
     *
     */
    private String password;
    /**
     *
     */
    private Integer gender;
    /**
     *
     */
    private String phone;
    /**
     *
     */
    private String idcard;
    /**
     *
     */
    private Date regTime;
    /**
     *
     */
    private String nickName;
    /**
     *
     */
    private String addr;

}
