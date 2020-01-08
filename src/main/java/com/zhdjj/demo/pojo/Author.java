package com.zhdjj.demo.pojo;

import java.io.Serializable;

public class Author implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author.author_id
     *
     * @mbggenerated
     */
    private Integer authorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author.author_name
     *
     * @mbggenerated
     */
    private String authorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table author
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author.author_id
     *
     * @return the value of author.author_id
     *
     * @mbggenerated
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author.author_id
     *
     * @param authorId the value for author.author_id
     *
     * @mbggenerated
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author.author_name
     *
     * @return the value of author.author_name
     *
     * @mbggenerated
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author.author_name
     *
     * @param authorName the value for author.author_name
     *
     * @mbggenerated
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authorId=").append(authorId);
        sb.append(", authorName=").append(authorName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}