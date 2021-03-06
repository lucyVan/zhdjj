package com.zhdjj.demo.pojo;

import java.io.Serializable;

public class Articlecomment implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column articlecomment.comment_id
     *
     * @mbggenerated
     */
    private Integer commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column articlecomment.user_id
     *
     * @mbggenerated
     */
    private Integer userId;
    private Users users;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column articlecomment.article_id
     *
     * @mbggenerated
     */
    private Integer articleId;
    private Article article;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column articlecomment.comment_content
     *
     * @mbggenerated
     */
    private String commentContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table articlecomment
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column articlecomment.comment_id
     *
     * @return the value of articlecomment.comment_id
     *
     * @mbggenerated
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column articlecomment.comment_id
     *
     * @param commentId the value for articlecomment.comment_id
     *
     * @mbggenerated
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column articlecomment.user_id
     *
     * @return the value of articlecomment.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column articlecomment.user_id
     *
     * @param userId the value for articlecomment.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column articlecomment.article_id
     *
     * @return the value of articlecomment.article_id
     *
     * @mbggenerated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column articlecomment.article_id
     *
     * @param articleId the value for articlecomment.article_id
     *
     * @mbggenerated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column articlecomment.comment_content
     *
     * @return the value of articlecomment.comment_content
     *
     * @mbggenerated
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column articlecomment.comment_content
     *
     * @param commentContent the value for articlecomment.comment_content
     *
     * @mbggenerated
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articlecomment
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", userId=").append(userId);
        sb.append(", articleId=").append(articleId);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}