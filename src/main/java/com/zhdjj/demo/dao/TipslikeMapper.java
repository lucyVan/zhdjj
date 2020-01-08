package com.zhdjj.demo.dao;

import com.zhdjj.demo.pojo.Tipslike;
import com.zhdjj.demo.pojo.TipslikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TipslikeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipslike
     *
     * @mbggenerated
     */
    int countByExample(TipslikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipslike
     *
     * @mbggenerated
     */
    int deleteByExample(TipslikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipslike
     *
     * @mbggenerated
     */
    int insert(Tipslike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipslike
     *
     * @mbggenerated
     */
    int insertSelective(Tipslike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipslike
     *
     * @mbggenerated
     */
    List<Tipslike> selectByExample(TipslikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipslike
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tipslike record, @Param("example") TipslikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipslike
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tipslike record, @Param("example") TipslikeExample example);
}