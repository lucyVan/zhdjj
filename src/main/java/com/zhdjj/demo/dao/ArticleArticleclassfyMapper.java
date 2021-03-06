package com.zhdjj.demo.dao;

import com.zhdjj.demo.pojo.ArticleArticleclassfy;
import com.zhdjj.demo.pojo.ArticleArticleclassfyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleArticleclassfyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_articleclassfy
     *
     * @mbggenerated
     */
    int countByExample(ArticleArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_articleclassfy
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_articleclassfy
     *
     * @mbggenerated
     */
    int insert(ArticleArticleclassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_articleclassfy
     *
     * @mbggenerated
     */
    int insertSelective(ArticleArticleclassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_articleclassfy
     *
     * @mbggenerated
     */
    List<ArticleArticleclassfy> selectByExample(ArticleArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_articleclassfy
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleArticleclassfy record, @Param("example") ArticleArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_articleclassfy
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleArticleclassfy record, @Param("example") ArticleArticleclassfyExample example);
}