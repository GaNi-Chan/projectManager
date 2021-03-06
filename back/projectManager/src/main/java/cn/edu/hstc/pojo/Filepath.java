package cn.edu.hstc.pojo;

import java.io.Serializable;
import java.util.Date;

public class Filepath implements Serializable {
    private Integer fileId;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private String url;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDelete() {
        return deleted;
    }

    public void setDelete(Integer deleted) {
        this.deleted = deleted;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Filepath(Date createTime,String url, Integer userId) {
        this.createTime = createTime;
        this.url = url;
        this.userId = userId;
    }

    public Filepath() {
    }
}