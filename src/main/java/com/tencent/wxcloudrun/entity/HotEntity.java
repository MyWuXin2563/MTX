package com.tencent.wxcloudrun.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 热点信息
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:58:27
 */
@Data
@TableName("hot")
public class HotEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 逐渐id
     */
    @TableId
    private Integer id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文本信息
     */
    private String text;
    /**
     * 图片路径
     */
    private String pic;

}
