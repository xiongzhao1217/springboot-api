package com.company.project.model.system;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_config")
public class SystemConfig {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 配置名称
     */
    private String title;

    /**
     * 配置编码
     */
    @Column(name = "config_code")
    private String configCode;

    /**
     * 配置详情
     */
    @Column(name = "config_value")
    private String configValue;

    /**
     * 配置描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取配置名称
     *
     * @return title - 配置名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置配置名称
     *
     * @param title 配置名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取配置编码
     *
     * @return config_code - 配置编码
     */
    public String getConfigCode() {
        return configCode;
    }

    /**
     * 设置配置编码
     *
     * @param configCode 配置编码
     */
    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    /**
     * 获取配置详情
     *
     * @return config_value - 配置详情
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 设置配置详情
     *
     * @param configValue 配置详情
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * 获取配置描述
     *
     * @return description - 配置描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置配置描述
     *
     * @param description 配置描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}