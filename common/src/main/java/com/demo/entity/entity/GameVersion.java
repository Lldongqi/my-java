package com.demo.entity.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 游戏版本(GameVersion)实体类
 *
 * @author makejava
 * @since 2022-09-01 17:39:48
 */
public class GameVersion implements Serializable {
    private static final long serialVersionUID = -40697491120756736L;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMCode() {
        return mCode;
    }

    public void setMCode(String mCode) {
        this.mCode = mCode;
    }

    public String getCoursewareName() {
        return coursewareName;
    }

    public void setCoursewareName(String coursewareName) {
        this.coursewareName = coursewareName;
    }

    public String getUpdatedUserName() {
        return updatedUserName;
    }

    public void setUpdatedUserName(String updatedUserName) {
        this.updatedUserName = updatedUserName;
    }

    public Integer getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(Integer updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public Integer getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getPublishedUserName() {
        return publishedUserName;
    }

    public void setPublishedUserName(String publishedUserName) {
        this.publishedUserName = publishedUserName;
    }

    public Integer getPublishedUserId() {
        return publishedUserId;
    }

    public void setPublishedUserId(Integer publishedUserId) {
        this.publishedUserId = publishedUserId;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getPushHash() {
        return pushHash;
    }

    public void setPushHash(String pushHash) {
        this.pushHash = pushHash;
    }

    public String getPushUuid() {
        return pushUuid;
    }

    public void setPushUuid(String pushUuid) {
        this.pushUuid = pushUuid;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public String getPushPackageCdn() {
        return pushPackageCdn;
    }

    public void setPushPackageCdn(String pushPackageCdn) {
        this.pushPackageCdn = pushPackageCdn;
    }

    public String getPushThumbnail() {
        return pushThumbnail;
    }

    public void setPushThumbnail(String pushThumbnail) {
        this.pushThumbnail = pushThumbnail;
    }

    public Integer getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public String getPipelineUrl() {
        return pipelineUrl;
    }

    public void setPipelineUrl(String pipelineUrl) {
        this.pipelineUrl = pipelineUrl;
    }

}

