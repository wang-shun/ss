package com.sstc.hmis.permission.dbaccess.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sstc.hmis.permission.dbaccess.data.PermsTStaff;
import com.sstc.hmis.permission.dbaccess.data.TUsedLinkman;
import com.sstc.hmis.permission.dbaccess.data.TUsedLinkmanExample;

@Mapper
public interface TUsedLinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int countByExample(TUsedLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int deleteByExample(TUsedLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int deleteByPrimaryKey(String clId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int insert(TUsedLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int insertSelective(TUsedLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    List<TUsedLinkman> selectByExample(TUsedLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    TUsedLinkman selectByPrimaryKey(String clId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") TUsedLinkman record, @Param("example") TUsedLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int updateByExample(@Param("record") TUsedLinkman record, @Param("example") TUsedLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int updateByPrimaryKeySelective(TUsedLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perms.t_used_linkman
     *
     * @mbggenerated Thu Aug 24 09:49:04 CST 2017
     */
    int updateByPrimaryKey(TUsedLinkman record);
    
	/**
	 * 查询是否已经添加常用联系人
	 * @param paramMap 参数Map
	 * @return 查询结果
	 */
	int getOftenLinkman(Map<String, Object> paramMap);
	
	/**
	 * 删除常用联系人
	 * @param paramMap 参数Map
	 */
	void delOften(Map<String, Object> paramMap);
	
	/**
	 * 获取常用联系人
	 * @param paramMap 参数Map
	 * @return 查询结果
	 */
	List<PermsTStaff> getLinkmanInfoList(Map<String, Object> paramMap);
	
	/**
	 * 联系人列表获取常用联系人
	 * @param paramMap 参数Map
	 * @return 查询结果
	 */
	List<PermsTStaff> getLinkmanListForOften(Map<String, Object> paramMap);
}