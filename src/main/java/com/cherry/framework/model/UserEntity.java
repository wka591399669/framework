package com.cherry.framework.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class UserEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.login_name
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "登录名")
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.user_name
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.password
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "用户密码")
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.head_img_url
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "用户头像url链接地址")
    private String headImgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.gender
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "性别")
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.phone_number
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "手机号")
    private String phoneNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.email
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "电子邮箱")
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.status
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "用户状态：1 - 启用；其他 - 停用")
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.type
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "用户类型：1 - 后台；2 - 钉钉")
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.bind_type
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "登录绑定方式")
    private Integer bindType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.ip_or_mac
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "IP/MAC地址")
    private String ipOrMac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.item1
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "备用信息1")
    private String item1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.item2
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "备用信息2")
    private String item2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.item3
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "备用信息3")
    private String item3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.item4
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "备用信息4")
    private String item4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.item5
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "备用信息5")
    private String item5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.create_user
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "创建人id")
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.create_user_name
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "创建人")
    private String createUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.create_date
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.update_user
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "修改人id")
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.update_user_name
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "修改人")
    private String updateUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.update_date
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "修改人时间")
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_user.remark
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fr_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.id
     *
     * @return the value of fr_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.id
     *
     * @param id the value for fr_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.login_name
     *
     * @return the value of fr_user.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.login_name
     *
     * @param loginName the value for fr_user.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.user_name
     *
     * @return the value of fr_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.user_name
     *
     * @param userName the value for fr_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.password
     *
     * @return the value of fr_user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.password
     *
     * @param password the value for fr_user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.head_img_url
     *
     * @return the value of fr_user.head_img_url
     *
     * @mbggenerated
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.head_img_url
     *
     * @param headImgUrl the value for fr_user.head_img_url
     *
     * @mbggenerated
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.gender
     *
     * @return the value of fr_user.gender
     *
     * @mbggenerated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.gender
     *
     * @param gender the value for fr_user.gender
     *
     * @mbggenerated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.phone_number
     *
     * @return the value of fr_user.phone_number
     *
     * @mbggenerated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.phone_number
     *
     * @param phoneNumber the value for fr_user.phone_number
     *
     * @mbggenerated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.email
     *
     * @return the value of fr_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.email
     *
     * @param email the value for fr_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.status
     *
     * @return the value of fr_user.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.status
     *
     * @param status the value for fr_user.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.type
     *
     * @return the value of fr_user.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.type
     *
     * @param type the value for fr_user.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.bind_type
     *
     * @return the value of fr_user.bind_type
     *
     * @mbggenerated
     */
    public Integer getBindType() {
        return bindType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.bind_type
     *
     * @param bindType the value for fr_user.bind_type
     *
     * @mbggenerated
     */
    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.ip_or_mac
     *
     * @return the value of fr_user.ip_or_mac
     *
     * @mbggenerated
     */
    public String getIpOrMac() {
        return ipOrMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.ip_or_mac
     *
     * @param ipOrMac the value for fr_user.ip_or_mac
     *
     * @mbggenerated
     */
    public void setIpOrMac(String ipOrMac) {
        this.ipOrMac = ipOrMac == null ? null : ipOrMac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.item1
     *
     * @return the value of fr_user.item1
     *
     * @mbggenerated
     */
    public String getItem1() {
        return item1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.item1
     *
     * @param item1 the value for fr_user.item1
     *
     * @mbggenerated
     */
    public void setItem1(String item1) {
        this.item1 = item1 == null ? null : item1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.item2
     *
     * @return the value of fr_user.item2
     *
     * @mbggenerated
     */
    public String getItem2() {
        return item2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.item2
     *
     * @param item2 the value for fr_user.item2
     *
     * @mbggenerated
     */
    public void setItem2(String item2) {
        this.item2 = item2 == null ? null : item2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.item3
     *
     * @return the value of fr_user.item3
     *
     * @mbggenerated
     */
    public String getItem3() {
        return item3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.item3
     *
     * @param item3 the value for fr_user.item3
     *
     * @mbggenerated
     */
    public void setItem3(String item3) {
        this.item3 = item3 == null ? null : item3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.item4
     *
     * @return the value of fr_user.item4
     *
     * @mbggenerated
     */
    public String getItem4() {
        return item4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.item4
     *
     * @param item4 the value for fr_user.item4
     *
     * @mbggenerated
     */
    public void setItem4(String item4) {
        this.item4 = item4 == null ? null : item4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.item5
     *
     * @return the value of fr_user.item5
     *
     * @mbggenerated
     */
    public String getItem5() {
        return item5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.item5
     *
     * @param item5 the value for fr_user.item5
     *
     * @mbggenerated
     */
    public void setItem5(String item5) {
        this.item5 = item5 == null ? null : item5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.create_user
     *
     * @return the value of fr_user.create_user
     *
     * @mbggenerated
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.create_user
     *
     * @param createUser the value for fr_user.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.create_user_name
     *
     * @return the value of fr_user.create_user_name
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.create_user_name
     *
     * @param createUserName the value for fr_user.create_user_name
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.create_date
     *
     * @return the value of fr_user.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.create_date
     *
     * @param createDate the value for fr_user.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.update_user
     *
     * @return the value of fr_user.update_user
     *
     * @mbggenerated
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.update_user
     *
     * @param updateUser the value for fr_user.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.update_user_name
     *
     * @return the value of fr_user.update_user_name
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.update_user_name
     *
     * @param updateUserName the value for fr_user.update_user_name
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.update_date
     *
     * @return the value of fr_user.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.update_date
     *
     * @param updateDate the value for fr_user.update_date
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_user.remark
     *
     * @return the value of fr_user.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_user.remark
     *
     * @param remark the value for fr_user.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", headImgUrl=").append(headImgUrl);
        sb.append(", gender=").append(gender);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", email=").append(email);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", bindType=").append(bindType);
        sb.append(", ipOrMac=").append(ipOrMac);
        sb.append(", item1=").append(item1);
        sb.append(", item2=").append(item2);
        sb.append(", item3=").append(item3);
        sb.append(", item4=").append(item4);
        sb.append(", item5=").append(item5);
        sb.append(", createUser=").append(createUser);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}