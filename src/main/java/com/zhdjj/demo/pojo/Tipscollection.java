package com.zhdjj.demo.pojo;

import java.io.Serializable;

public class Tipscollection implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tipscollection.tip_id
     *
     * @mbggenerated
     */
    private Integer tipId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tipscollection.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tipscollection
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tipscollection.tip_id
     *
     * @return the value of tipscollection.tip_id
     *
     * @mbggenerated
     */
    public Integer getTipId() {
        return tipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tipscollection.tip_id
     *
     * @param tipId the value for tipscollection.tip_id
     *
     * @mbggenerated
     */
    public void setTipId(Integer tipId) {
        this.tipId = tipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tipscollection.user_id
     *
     * @return the value of tipscollection.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tipscollection.user_id
     *
     * @param userId the value for tipscollection.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipscollection
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tipId=").append(tipId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}