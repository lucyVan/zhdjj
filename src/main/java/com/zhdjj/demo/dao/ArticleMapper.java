package com.zhdjj.demo.dao;

import com.zhdjj.demo.pojo.Article;
import com.zhdjj.demo.pojo.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int countByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer articleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int insertSelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    List<Article> selectByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    Article selectByPrimaryKey(Integer articleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Article record);
}