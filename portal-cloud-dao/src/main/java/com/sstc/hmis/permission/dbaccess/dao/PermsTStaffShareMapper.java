package com.sstc.hmis.permission.dbaccess.dao;

import com.sstc.hmis.permission.dbaccess.data.PermsTStaffShare;
import com.sstc.hmis.permission.dbaccess.data.PermsTStaffShareExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PermsTStaffShareMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int countByExample(PermsTStaffShareExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int deleteByExample(PermsTStaffShareExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int deleteByPrimaryKey(String clId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int insert(PermsTStaffShare record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int insertSelective(PermsTStaffShare record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	List<PermsTStaffShare> selectByExample(PermsTStaffShareExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	PermsTStaffShare selectByPrimaryKey(String clId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int updateByExampleSelective(@Param("record") PermsTStaffShare record,
			@Param("example") PermsTStaffShareExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int updateByExample(@Param("record") PermsTStaffShare record, @Param("example") PermsTStaffShareExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int updateByPrimaryKeySelective(PermsTStaffShare record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_staff_share
	 * @mbggenerated  Wed Apr 05 13:58:26 CST 2017
	 */
	int updateByPrimaryKey(PermsTStaffShare record);
}