package com.company.project.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "u_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 密码盐
     */
    @Column(name = "passwd_salt")
    private String passwdSalt;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 性别,1:男,2:女
     */
    private Integer sex;

    /**
     * 用户状态，1：正常，2：锁定，3：注销
     */
    @Column(name = "mem_status")
    private Integer memStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return passwd - 密码
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置密码
     *
     * @param passwd 密码
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 获取密码盐
     *
     * @return passwd_salt - 密码盐
     */
    public String getPasswdSalt() {
        return passwdSalt;
    }

    /**
     * 设置密码盐
     *
     * @param passwdSalt 密码盐
     */
    public void setPasswdSalt(String passwdSalt) {
        this.passwdSalt = passwdSalt;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取性别,1:男,2:女
     *
     * @return sex - 性别,1:男,2:女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别,1:男,2:女
     *
     * @param sex 性别,1:男,2:女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取用户状态，1：正常，2：锁定，3：注销
     *
     * @return mem_status - 用户状态，1：正常，2：锁定，3：注销
     */
    public Integer getMemStatus() {
        return memStatus;
    }

    /**
     * 设置用户状态，1：正常，2：锁定，3：注销
     *
     * @param memStatus 用户状态，1：正常，2：锁定，3：注销
     */
    public void setMemStatus(Integer memStatus) {
        this.memStatus = memStatus;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}