package com.zhdjj.demo.pojo;

import java.io.Serializable;

public class Shop implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_id
     *
     * @mbggenerated
     */
    private Integer shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_name
     *
     * @mbggenerated
     */
    private String shopName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shopclassfy_id
     *
     * @mbggenerated
     */
    private Integer shopclassfyId;

    private Shopclassfy shopclassfy;

    public Shopclassfy getShopclassfy() {
        return shopclassfy;
    }

    public void setShopclassfy(Shopclassfy shopclassfy) {
        this.shopclassfy = shopclassfy;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_price
     *
     * @mbggenerated
     */
    private Integer shopPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_content
     *
     * @mbggenerated
     */
    private String shopContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shop
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_id
     *
     * @return the value of shop.shop_id
     *
     * @mbggenerated
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_id
     *
     * @param shopId the value for shop.shop_id
     *
     * @mbggenerated
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_name
     *
     * @return the value of shop.shop_name
     *
     * @mbggenerated
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_name
     *
     * @param shopName the value for shop.shop_name
     *
     * @mbggenerated
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shopclassfy_id
     *
     * @return the value of shop.shopclassfy_id
     *
     * @mbggenerated
     */
    public Integer getShopclassfyId() {
        return shopclassfyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shopclassfy_id
     *
     * @param shopclassfyId the value for shop.shopclassfy_id
     *
     * @mbggenerated
     */
    public void setShopclassfyId(Integer shopclassfyId) {
        this.shopclassfyId = shopclassfyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_price
     *
     * @return the value of shop.shop_price
     *
     * @mbggenerated
     */
    public Integer getShopPrice() {
        return shopPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_price
     *
     * @param shopPrice the value for shop.shop_price
     *
     * @mbggenerated
     */
    public void setShopPrice(Integer shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_content
     *
     * @return the value of shop.shop_content
     *
     * @mbggenerated
     */
    public String getShopContent() {
        return shopContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_content
     *
     * @param shopContent the value for shop.shop_content
     *
     * @mbggenerated
     */
    public void setShopContent(String shopContent) {
        this.shopContent = shopContent == null ? null : shopContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
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
        sb.append(", shopName=").append(shopName);
        sb.append(", shopclassfyId=").append(shopclassfyId);
        sb.append(", shopPrice=").append(shopPrice);
        sb.append(", shopContent=").append(shopContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}