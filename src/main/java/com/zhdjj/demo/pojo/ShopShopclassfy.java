package com.zhdjj.demo.pojo;

import java.io.Serializable;

public class ShopShopclassfy implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_shopclassfy.shop_id
     *
     * @mbggenerated
     */
    private Integer shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_shopclassfy.shopclassfy_id
     *
     * @mbggenerated
     */
    private Integer shopclassfyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shop_shopclassfy
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_shopclassfy.shop_id
     *
     * @return the value of shop_shopclassfy.shop_id
     *
     * @mbggenerated
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_shopclassfy.shop_id
     *
     * @param shopId the value for shop_shopclassfy.shop_id
     *
     * @mbggenerated
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_shopclassfy.shopclassfy_id
     *
     * @return the value of shop_shopclassfy.shopclassfy_id
     *
     * @mbggenerated
     */
    public Integer getShopclassfyId() {
        return shopclassfyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_shopclassfy.shopclassfy_id
     *
     * @param shopclassfyId the value for shop_shopclassfy.shopclassfy_id
     *
     * @mbggenerated
     */
    public void setShopclassfyId(Integer shopclassfyId) {
        this.shopclassfyId = shopclassfyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_shopclassfy
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", shopclassfyId=").append(shopclassfyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}