package com.tencent.wxcloudrun.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 街天
 *
 * @author LiuMin
 * @email alanmax@qq.com
 * @date 2024-03-24 17:58:27
 */
@Data
@TableName("jietian")
public class JietianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId
    private Integer id;
    /**
     * 街天名称
     */
    private String title;
    /**
     * 时间
     */
    private Date time;
    /**
     * 地点
     */
    private String addr;
    /**
     * 地图坐标
     */
    private String map;
    /**
     * 距离街天时间
     */
    private String gap;
    /**
     * 地图
     */
    private String pic;

}
