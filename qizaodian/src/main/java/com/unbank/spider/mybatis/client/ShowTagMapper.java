package com.unbank.spider.mybatis.client;

import com.unbank.spider.mybatis.vo.ShowTag;
import com.unbank.spider.mybatis.vo.ShowTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShowTagMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int countByExample(ShowTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int deleteByExample(ShowTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int insert(ShowTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int insertSelective(ShowTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	List<ShowTag> selectByExample(ShowTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	ShowTag selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int updateByExampleSelective(@Param("record") ShowTag record, @Param("example") ShowTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int updateByExample(@Param("record") ShowTag record, @Param("example") ShowTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int updateByPrimaryKeySelective(ShowTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table show_tag
	 * @mbggenerated  Wed May 31 17:14:13 CST 2017
	 */
	int updateByPrimaryKey(ShowTag record);
}