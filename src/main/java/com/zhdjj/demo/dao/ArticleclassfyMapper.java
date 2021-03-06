package com.zhdjj.demo.dao;

import com.zhdjj.demo.pojo.Articleclassfy;
import com.zhdjj.demo.pojo.ArticleclassfyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleclassfyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int countByExample(ArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer articleClassfyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int insert(Articleclassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int insertSelective(Articleclassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    List<Articleclassfy> selectByExample(ArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    Articleclassfy selectByPrimaryKey(Integer articleClassfyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Articleclassfy record, @Param("example") ArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Articleclassfy record, @Param("example") ArticleclassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Articleclassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Articleclassfy record);
}