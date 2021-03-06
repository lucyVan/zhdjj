package com.zhdjj.demo.pojo;

import java.io.Serializable;

public class Shoppingchart implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingchart.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingchart.shop_id
     *
     * @mbggenerated
     */
    private Integer shopId;
    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shoppingchart
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingchart.user_id
     *
     * @return the value of shoppingchart.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingchart.user_id
     *
     * @param userId the value for shoppingchart.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingchart.shop_id
     *
     * @return the value of shoppingchart.shop_id
     *
     * @mbggenerated
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingchart.shop_id
     *
     * @param shopId the value for shoppingchart.shop_id
     *
     * @mbggenerated
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingchart
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", shopId=").append(shopId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}