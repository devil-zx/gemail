package com.example.gUser.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "gemail", catalog = "")
public class Usermodel {
    private int id;
    private String accessCode;
    private String accessToken;
    private Timestamp birthday;
    private String city;
    private Timestamp createTime;
    private Integer gender;
    private Integer growth;
    private Integer historyIntegration;
    private String icon;
    private Integer integration;
    private String job;
    private Integer luckeyCount;
    private Integer memberLevelId;
    private String nickname;
    private String password;
    private String personalizedSignature;
    private String phone;
    private Integer sourceType;
    private Integer sourceUid;
    private Integer status;
    private String username;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "access_code")
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    @Basic
    @Column(name = "access_token")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Basic
    @Column(name = "birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "growth")
    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    @Basic
    @Column(name = "history_integration")
    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "integration")
    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    @Basic
    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "luckey_count")
    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    @Basic
    @Column(name = "member_level_id")
    public Integer getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Integer memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "personalized_signature")
    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "source_type")
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "source_uid")
    public Integer getSourceUid() {
        return sourceUid;
    }

    public void setSourceUid(Integer sourceUid) {
        this.sourceUid = sourceUid;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usermodel usermodel = (Usermodel) o;
        return id == usermodel.id &&
                Objects.equals(accessCode, usermodel.accessCode) &&
                Objects.equals(accessToken, usermodel.accessToken) &&
                Objects.equals(birthday, usermodel.birthday) &&
                Objects.equals(city, usermodel.city) &&
                Objects.equals(createTime, usermodel.createTime) &&
                Objects.equals(gender, usermodel.gender) &&
                Objects.equals(growth, usermodel.growth) &&
                Objects.equals(historyIntegration, usermodel.historyIntegration) &&
                Objects.equals(icon, usermodel.icon) &&
                Objects.equals(integration, usermodel.integration) &&
                Objects.equals(job, usermodel.job) &&
                Objects.equals(luckeyCount, usermodel.luckeyCount) &&
                Objects.equals(memberLevelId, usermodel.memberLevelId) &&
                Objects.equals(nickname, usermodel.nickname) &&
                Objects.equals(password, usermodel.password) &&
                Objects.equals(personalizedSignature, usermodel.personalizedSignature) &&
                Objects.equals(phone, usermodel.phone) &&
                Objects.equals(sourceType, usermodel.sourceType) &&
                Objects.equals(sourceUid, usermodel.sourceUid) &&
                Objects.equals(status, usermodel.status) &&
                Objects.equals(username, usermodel.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accessCode, accessToken, birthday, city, createTime, gender, growth, historyIntegration, icon, integration, job, luckeyCount, memberLevelId, nickname, password, personalizedSignature, phone, sourceType, sourceUid, status, username);
    }
}
