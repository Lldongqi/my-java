package com.demo.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 游戏版本(GameVersion)实体类
 *
 * @author makejava
 * @since 2022-09-01 17:40:31
 */
@Data
public class GameVersion implements Serializable {
    private static final long serialVersionUID = 200096575665536989L;
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 游戏版本名称
     */
    private String name;
    /**
     * 游戏名字
     */
    private String gameName;
    /**
     * 游戏版本的父级版本
     */
    private Integer parentId;
    /**
     * 游戏code
     */
    private String gameCode;
    /**
     * 游戏ID
     */
    private Integer gameId;
    /**
     * 游戏CDN地址
     */
    private String url;
    /**
     * 发布的目标课件M_code
     */
    private String mCode;
    /**
     * 发布的目标课件名称
     */
    private String coursewareName;
    /**
     * 更新的用户名称
     */
    private String updatedUserName;
    /**
     * 更新的用户ID
     */
    private Integer updatedUserId;
    /**
     * 创建的用户名称
     */
    private String createdUserName;
    /**
     * 创建的用户ID
     */
    private Integer createdUserId;
    /**
     * 发布的用户ID
     */
    private String publishedUserName;
    /**
     * 发布的用户名称
     */
    private Integer publishedUserId;
    /**
     * 修改时间
     */
    private Date modifiedTime;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 发布时间
     */
    private Date publishedTime;
    /**
     * 错误信息
     */
    private String errorMessage;
    /**
     * 推送hash值
     */
    private String pushHash;
    /**
     * 推送uuid
     */
    private String pushUuid;
    /**
     * 推送地址
     */
    private String pushUrl;
    /**
     * 推送cdn包地址
     */
    private String pushPackageCdn;
    /**
     * 推送缩略图地址
     */
    private String pushThumbnail;
    /**
     * pipeline id
     */
    private Integer pipelineId;
    /**
     * pipeline url
     */
    private String pipelineUrl;

}

