package com.company.project.model;

import javax.persistence.*;

@Table(name = "user_account")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer type;

    /**
     * 用户id
     */
    @Column(name = "mem_id")
    private Integer memId;

    /**
     * 金额
     */
    private Double amount;

    private Double fee;

    @Column(name = "acc_desc")
    private String accDesc;

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
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取用户id
     *
     * @return mem_id - 用户id
     */
    public Integer getMemId() {
        return memId;
    }

    /**
     * 设置用户id
     *
     * @param memId 用户id
     */
    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return fee
     */
    public Double getFee() {
        return fee;
    }

    /**
     * @param fee
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * @return acc_desc
     */
    public String getAccDesc() {
        return accDesc;
    }

    /**
     * @param accDesc
     */
    public void setAccDesc(String accDesc) {
        this.accDesc = accDesc;
    }
}