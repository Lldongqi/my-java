package com.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 游戏(Game)实体类
 *
 * @author makejava
 * @since 2022-08-12 18:09:09
 */

@Data
public class Game implements Serializable {
    private static final long serialVersionUID = -16601436594880327L;
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 游戏ID
     */
    private String code;
    /**
     * 游戏名称
     */
    private String name;
    /**
     * 复制游戏来源游戏
     */
    private Integer sourceGameVersionId;
    /**
     * 复合模板类型的模板id
     */
    private Integer customTemplateVersionId;
    /**
     * 关联任务ID
     */
    private Integer taskId;
    /**
     * 更新人名称
     */
    private String updatedUserName;
    /**
     * 更新人ID
     */
    private Integer updatedUserId;
    /**
     * 创建人名称
     */
    private String createdUserName;
    /**
     * 创建人ID
     */
    private Integer createdUserId;
    /**
     * 是否标记删除
     */
    private Integer isDel;
    /**
     * 稳定版本
     */
    private Integer stableVersionId;
    /**
     * 发布状态
     */
    private Integer status;
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
     * 能否复制
     */
    private Integer canCopy;
    /**
     * 能否保存为模板
     */
    private Integer canSaveTemplate;
    /**
     * 是否有模板
     */
    private Integer hasTemplate;
    /**
     * 游戏类型 0：cocos创建游戏。1：ige创建游戏
     */
    private Integer editorType;

//    private List<GameVersion> gameVersionVo;


}

