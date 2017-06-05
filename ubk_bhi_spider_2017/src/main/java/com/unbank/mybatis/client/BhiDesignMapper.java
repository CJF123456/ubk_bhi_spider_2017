package com.unbank.mybatis.client;

import com.unbank.mybatis.vo.BhiDesign;
import com.unbank.mybatis.vo.BhiDesignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BhiDesignMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_design
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	int countByExample(BhiDesignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_design
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	int deleteByExample(BhiDesignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_design
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	int insert(BhiDesign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_design
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	int insertSelective(BhiDesign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_design
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	List<BhiDesign> selectByExample(BhiDesignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_design
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	int updateByExampleSelective(@Param("record") BhiDesign record,
			@Param("example") BhiDesignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_design
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	int updateByExample(@Param("record") BhiDesign record,
			@Param("example") BhiDesignExample example);
}