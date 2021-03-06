package cn.edu.hstc.pojo;

import javax.validation.constraints.Digits;
import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {
    private Integer proId;

    private String projectName;

    private String projectNumber;

    private String projectSource;

    private Date beginTime;

    private Date overTime;

    @Digits(integer = 12,fraction = 4,message = "请输入小数位最大精度为4位的数字！")
    private Double funds;

    private String level;

    private Integer isTeamwork;

    private String state;

    private String projectDirector;

    private Integer fileId;

    private Integer userId;

    private Date creatTime;

    private Integer deleted;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    private Filepath filepath;

    public Filepath getFilepath() {
        return filepath;
    }

    public void setFilepath(Filepath filepath) {
        this.filepath = filepath;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectSource() {
        return projectSource;
    }

    public void setProjectSource(String projectSource) {
        this.projectSource = projectSource == null ? null : projectSource.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public Double getFunds() {
        return funds;
    }

    public void setFunds(Double funds) {
        this.funds = funds;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getIsTeamwork() {
        return isTeamwork;
    }

    public void setIsTeamwork(Integer isTeamwork) {
        this.isTeamwork = isTeamwork;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProjectDirector() {
        return projectDirector;
    }

    public void setProjectDirector(String projectDirector) {
        this.projectDirector = projectDirector == null ? null : projectDirector.trim();
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}