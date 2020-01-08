package com.zhdjj.demo.dao;

import com.zhdjj.demo.pojo.Author;
import com.zhdjj.demo.pojo.AuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int countByExample(AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int deleteByExample(AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer authorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int insert(Author record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int insertSelective(Author record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    List<Author> selectByExample(AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    Author selectByPrimaryKey(Integer authorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Author record, @Param("example") AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Author record, @Param("example") AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Author record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Author record);
}