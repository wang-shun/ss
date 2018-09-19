package com.sstc.hmis.permission.dbaccess.dao;

import com.sstc.hmis.permission.dbaccess.data.PermsTPwdQuestion;
import com.sstc.hmis.permission.dbaccess.data.PermsTPwdQuestionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PermsTPwdQuestionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int countByExample(PermsTPwdQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int deleteByExample(PermsTPwdQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int deleteByPrimaryKey(String clId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int insert(PermsTPwdQuestion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int insertSelective(PermsTPwdQuestion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	List<PermsTPwdQuestion> selectByExample(PermsTPwdQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	PermsTPwdQuestion selectByPrimaryKey(String clId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int updateByExampleSelective(@Param("record") PermsTPwdQuestion record,
			@Param("example") PermsTPwdQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int updateByExample(@Param("record") PermsTPwdQuestion record, @Param("example") PermsTPwdQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int updateByPrimaryKeySelective(PermsTPwdQuestion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_pwd_question
	 * @mbggenerated  Fri Mar 31 19:04:40 CST 2017
	 */
	int updateByPrimaryKey(PermsTPwdQuestion record);
}