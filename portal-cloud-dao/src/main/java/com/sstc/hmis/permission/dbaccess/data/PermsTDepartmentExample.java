package com.sstc.hmis.permission.dbaccess.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class PermsTDepartmentExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public PermsTDepartmentExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andClIdIsNull() {
			addCriterion("cl_id is null");
			return (Criteria) this;
		}

		public Criteria andClIdIsNotNull() {
			addCriterion("cl_id is not null");
			return (Criteria) this;
		}

		public Criteria andClIdEqualTo(String value) {
			addCriterion("cl_id =", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdNotEqualTo(String value) {
			addCriterion("cl_id <>", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdGreaterThan(String value) {
			addCriterion("cl_id >", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdGreaterThanOrEqualTo(String value) {
			addCriterion("cl_id >=", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdLessThan(String value) {
			addCriterion("cl_id <", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdLessThanOrEqualTo(String value) {
			addCriterion("cl_id <=", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdLike(String value) {
			addCriterion("cl_id like", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdNotLike(String value) {
			addCriterion("cl_id not like", value, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdIn(List<String> values) {
			addCriterion("cl_id in", values, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdNotIn(List<String> values) {
			addCriterion("cl_id not in", values, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdBetween(String value1, String value2) {
			addCriterion("cl_id between", value1, value2, "clId");
			return (Criteria) this;
		}

		public Criteria andClIdNotBetween(String value1, String value2) {
			addCriterion("cl_id not between", value1, value2, "clId");
			return (Criteria) this;
		}

		public Criteria andClNameIsNull() {
			addCriterion("cl_name is null");
			return (Criteria) this;
		}

		public Criteria andClNameIsNotNull() {
			addCriterion("cl_name is not null");
			return (Criteria) this;
		}

		public Criteria andClNameEqualTo(String value) {
			addCriterion("cl_name =", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameNotEqualTo(String value) {
			addCriterion("cl_name <>", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameGreaterThan(String value) {
			addCriterion("cl_name >", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameGreaterThanOrEqualTo(String value) {
			addCriterion("cl_name >=", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameLessThan(String value) {
			addCriterion("cl_name <", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameLessThanOrEqualTo(String value) {
			addCriterion("cl_name <=", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameLike(String value) {
			addCriterion("cl_name like", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameNotLike(String value) {
			addCriterion("cl_name not like", value, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameIn(List<String> values) {
			addCriterion("cl_name in", values, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameNotIn(List<String> values) {
			addCriterion("cl_name not in", values, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameBetween(String value1, String value2) {
			addCriterion("cl_name between", value1, value2, "clName");
			return (Criteria) this;
		}

		public Criteria andClNameNotBetween(String value1, String value2) {
			addCriterion("cl_name not between", value1, value2, "clName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameIsNull() {
			addCriterion("cl_english_name is null");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameIsNotNull() {
			addCriterion("cl_english_name is not null");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameEqualTo(String value) {
			addCriterion("cl_english_name =", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameNotEqualTo(String value) {
			addCriterion("cl_english_name <>", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameGreaterThan(String value) {
			addCriterion("cl_english_name >", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameGreaterThanOrEqualTo(String value) {
			addCriterion("cl_english_name >=", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameLessThan(String value) {
			addCriterion("cl_english_name <", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameLessThanOrEqualTo(String value) {
			addCriterion("cl_english_name <=", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameLike(String value) {
			addCriterion("cl_english_name like", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameNotLike(String value) {
			addCriterion("cl_english_name not like", value, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameIn(List<String> values) {
			addCriterion("cl_english_name in", values, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameNotIn(List<String> values) {
			addCriterion("cl_english_name not in", values, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameBetween(String value1, String value2) {
			addCriterion("cl_english_name between", value1, value2, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClEnglishNameNotBetween(String value1, String value2) {
			addCriterion("cl_english_name not between", value1, value2, "clEnglishName");
			return (Criteria) this;
		}

		public Criteria andClCodeIsNull() {
			addCriterion("cl_code is null");
			return (Criteria) this;
		}

		public Criteria andClCodeIsNotNull() {
			addCriterion("cl_code is not null");
			return (Criteria) this;
		}

		public Criteria andClCodeEqualTo(String value) {
			addCriterion("cl_code =", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeNotEqualTo(String value) {
			addCriterion("cl_code <>", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeGreaterThan(String value) {
			addCriterion("cl_code >", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeGreaterThanOrEqualTo(String value) {
			addCriterion("cl_code >=", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeLessThan(String value) {
			addCriterion("cl_code <", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeLessThanOrEqualTo(String value) {
			addCriterion("cl_code <=", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeLike(String value) {
			addCriterion("cl_code like", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeNotLike(String value) {
			addCriterion("cl_code not like", value, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeIn(List<String> values) {
			addCriterion("cl_code in", values, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeNotIn(List<String> values) {
			addCriterion("cl_code not in", values, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeBetween(String value1, String value2) {
			addCriterion("cl_code between", value1, value2, "clCode");
			return (Criteria) this;
		}

		public Criteria andClCodeNotBetween(String value1, String value2) {
			addCriterion("cl_code not between", value1, value2, "clCode");
			return (Criteria) this;
		}

		public Criteria andClPidIsNull() {
			addCriterion("cl_pid is null");
			return (Criteria) this;
		}

		public Criteria andClPidIsNotNull() {
			addCriterion("cl_pid is not null");
			return (Criteria) this;
		}

		public Criteria andClPidEqualTo(String value) {
			addCriterion("cl_pid =", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidNotEqualTo(String value) {
			addCriterion("cl_pid <>", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidGreaterThan(String value) {
			addCriterion("cl_pid >", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidGreaterThanOrEqualTo(String value) {
			addCriterion("cl_pid >=", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidLessThan(String value) {
			addCriterion("cl_pid <", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidLessThanOrEqualTo(String value) {
			addCriterion("cl_pid <=", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidLike(String value) {
			addCriterion("cl_pid like", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidNotLike(String value) {
			addCriterion("cl_pid not like", value, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidIn(List<String> values) {
			addCriterion("cl_pid in", values, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidNotIn(List<String> values) {
			addCriterion("cl_pid not in", values, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidBetween(String value1, String value2) {
			addCriterion("cl_pid between", value1, value2, "clPid");
			return (Criteria) this;
		}

		public Criteria andClPidNotBetween(String value1, String value2) {
			addCriterion("cl_pid not between", value1, value2, "clPid");
			return (Criteria) this;
		}

		public Criteria andClGrpIdIsNull() {
			addCriterion("cl_grp_id is null");
			return (Criteria) this;
		}

		public Criteria andClGrpIdIsNotNull() {
			addCriterion("cl_grp_id is not null");
			return (Criteria) this;
		}

		public Criteria andClGrpIdEqualTo(String value) {
			addCriterion("cl_grp_id =", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdNotEqualTo(String value) {
			addCriterion("cl_grp_id <>", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdGreaterThan(String value) {
			addCriterion("cl_grp_id >", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdGreaterThanOrEqualTo(String value) {
			addCriterion("cl_grp_id >=", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdLessThan(String value) {
			addCriterion("cl_grp_id <", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdLessThanOrEqualTo(String value) {
			addCriterion("cl_grp_id <=", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdLike(String value) {
			addCriterion("cl_grp_id like", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdNotLike(String value) {
			addCriterion("cl_grp_id not like", value, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdIn(List<String> values) {
			addCriterion("cl_grp_id in", values, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdNotIn(List<String> values) {
			addCriterion("cl_grp_id not in", values, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdBetween(String value1, String value2) {
			addCriterion("cl_grp_id between", value1, value2, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClGrpIdNotBetween(String value1, String value2) {
			addCriterion("cl_grp_id not between", value1, value2, "clGrpId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdIsNull() {
			addCriterion("cl_hotel_id is null");
			return (Criteria) this;
		}

		public Criteria andClHotelIdIsNotNull() {
			addCriterion("cl_hotel_id is not null");
			return (Criteria) this;
		}

		public Criteria andClHotelIdEqualTo(String value) {
			addCriterion("cl_hotel_id =", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdNotEqualTo(String value) {
			addCriterion("cl_hotel_id <>", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdGreaterThan(String value) {
			addCriterion("cl_hotel_id >", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdGreaterThanOrEqualTo(String value) {
			addCriterion("cl_hotel_id >=", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdLessThan(String value) {
			addCriterion("cl_hotel_id <", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdLessThanOrEqualTo(String value) {
			addCriterion("cl_hotel_id <=", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdLike(String value) {
			addCriterion("cl_hotel_id like", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdNotLike(String value) {
			addCriterion("cl_hotel_id not like", value, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdIn(List<String> values) {
			addCriterion("cl_hotel_id in", values, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdNotIn(List<String> values) {
			addCriterion("cl_hotel_id not in", values, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdBetween(String value1, String value2) {
			addCriterion("cl_hotel_id between", value1, value2, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClHotelIdNotBetween(String value1, String value2) {
			addCriterion("cl_hotel_id not between", value1, value2, "clHotelId");
			return (Criteria) this;
		}

		public Criteria andClStatusIsNull() {
			addCriterion("cl_status is null");
			return (Criteria) this;
		}

		public Criteria andClStatusIsNotNull() {
			addCriterion("cl_status is not null");
			return (Criteria) this;
		}

		public Criteria andClStatusEqualTo(Short value) {
			addCriterion("cl_status =", value, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusNotEqualTo(Short value) {
			addCriterion("cl_status <>", value, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusGreaterThan(Short value) {
			addCriterion("cl_status >", value, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusGreaterThanOrEqualTo(Short value) {
			addCriterion("cl_status >=", value, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusLessThan(Short value) {
			addCriterion("cl_status <", value, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusLessThanOrEqualTo(Short value) {
			addCriterion("cl_status <=", value, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusIn(List<Short> values) {
			addCriterion("cl_status in", values, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusNotIn(List<Short> values) {
			addCriterion("cl_status not in", values, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusBetween(Short value1, Short value2) {
			addCriterion("cl_status between", value1, value2, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClStatusNotBetween(Short value1, Short value2) {
			addCriterion("cl_status not between", value1, value2, "clStatus");
			return (Criteria) this;
		}

		public Criteria andClBlockupIsNull() {
			addCriterion("cl_blockup is null");
			return (Criteria) this;
		}

		public Criteria andClBlockupIsNotNull() {
			addCriterion("cl_blockup is not null");
			return (Criteria) this;
		}

		public Criteria andClBlockupEqualTo(Short value) {
			addCriterion("cl_blockup =", value, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupNotEqualTo(Short value) {
			addCriterion("cl_blockup <>", value, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupGreaterThan(Short value) {
			addCriterion("cl_blockup >", value, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupGreaterThanOrEqualTo(Short value) {
			addCriterion("cl_blockup >=", value, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupLessThan(Short value) {
			addCriterion("cl_blockup <", value, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupLessThanOrEqualTo(Short value) {
			addCriterion("cl_blockup <=", value, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupIn(List<Short> values) {
			addCriterion("cl_blockup in", values, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupNotIn(List<Short> values) {
			addCriterion("cl_blockup not in", values, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupBetween(Short value1, Short value2) {
			addCriterion("cl_blockup between", value1, value2, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClBlockupNotBetween(Short value1, Short value2) {
			addCriterion("cl_blockup not between", value1, value2, "clBlockup");
			return (Criteria) this;
		}

		public Criteria andClTypeIsNull() {
			addCriterion("cl_type is null");
			return (Criteria) this;
		}

		public Criteria andClTypeIsNotNull() {
			addCriterion("cl_type is not null");
			return (Criteria) this;
		}

		public Criteria andClTypeEqualTo(Short value) {
			addCriterion("cl_type =", value, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeNotEqualTo(Short value) {
			addCriterion("cl_type <>", value, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeGreaterThan(Short value) {
			addCriterion("cl_type >", value, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeGreaterThanOrEqualTo(Short value) {
			addCriterion("cl_type >=", value, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeLessThan(Short value) {
			addCriterion("cl_type <", value, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeLessThanOrEqualTo(Short value) {
			addCriterion("cl_type <=", value, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeIn(List<Short> values) {
			addCriterion("cl_type in", values, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeNotIn(List<Short> values) {
			addCriterion("cl_type not in", values, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeBetween(Short value1, Short value2) {
			addCriterion("cl_type between", value1, value2, "clType");
			return (Criteria) this;
		}

		public Criteria andClTypeNotBetween(Short value1, Short value2) {
			addCriterion("cl_type not between", value1, value2, "clType");
			return (Criteria) this;
		}

		public Criteria andClShareFlagIsNull() {
			addCriterion("cl_share_flag is null");
			return (Criteria) this;
		}

		public Criteria andClShareFlagIsNotNull() {
			addCriterion("cl_share_flag is not null");
			return (Criteria) this;
		}

		public Criteria andClShareFlagEqualTo(Short value) {
			addCriterion("cl_share_flag =", value, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagNotEqualTo(Short value) {
			addCriterion("cl_share_flag <>", value, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagGreaterThan(Short value) {
			addCriterion("cl_share_flag >", value, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagGreaterThanOrEqualTo(Short value) {
			addCriterion("cl_share_flag >=", value, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagLessThan(Short value) {
			addCriterion("cl_share_flag <", value, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagLessThanOrEqualTo(Short value) {
			addCriterion("cl_share_flag <=", value, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagIn(List<Short> values) {
			addCriterion("cl_share_flag in", values, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagNotIn(List<Short> values) {
			addCriterion("cl_share_flag not in", values, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagBetween(Short value1, Short value2) {
			addCriterion("cl_share_flag between", value1, value2, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClShareFlagNotBetween(Short value1, Short value2) {
			addCriterion("cl_share_flag not between", value1, value2, "clShareFlag");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeIsNull() {
			addCriterion("cl_create_time is null");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeIsNotNull() {
			addCriterion("cl_create_time is not null");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeEqualTo(Date value) {
			addCriterion("cl_create_time =", value, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeNotEqualTo(Date value) {
			addCriterion("cl_create_time <>", value, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeGreaterThan(Date value) {
			addCriterion("cl_create_time >", value, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("cl_create_time >=", value, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeLessThan(Date value) {
			addCriterion("cl_create_time <", value, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("cl_create_time <=", value, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeIn(List<Date> values) {
			addCriterion("cl_create_time in", values, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeNotIn(List<Date> values) {
			addCriterion("cl_create_time not in", values, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeBetween(Date value1, Date value2) {
			addCriterion("cl_create_time between", value1, value2, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("cl_create_time not between", value1, value2, "clCreateTime");
			return (Criteria) this;
		}

		public Criteria andClCreateByIsNull() {
			addCriterion("cl_create_by is null");
			return (Criteria) this;
		}

		public Criteria andClCreateByIsNotNull() {
			addCriterion("cl_create_by is not null");
			return (Criteria) this;
		}

		public Criteria andClCreateByEqualTo(String value) {
			addCriterion("cl_create_by =", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByNotEqualTo(String value) {
			addCriterion("cl_create_by <>", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByGreaterThan(String value) {
			addCriterion("cl_create_by >", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByGreaterThanOrEqualTo(String value) {
			addCriterion("cl_create_by >=", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByLessThan(String value) {
			addCriterion("cl_create_by <", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByLessThanOrEqualTo(String value) {
			addCriterion("cl_create_by <=", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByLike(String value) {
			addCriterion("cl_create_by like", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByNotLike(String value) {
			addCriterion("cl_create_by not like", value, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByIn(List<String> values) {
			addCriterion("cl_create_by in", values, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByNotIn(List<String> values) {
			addCriterion("cl_create_by not in", values, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByBetween(String value1, String value2) {
			addCriterion("cl_create_by between", value1, value2, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClCreateByNotBetween(String value1, String value2) {
			addCriterion("cl_create_by not between", value1, value2, "clCreateBy");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeIsNull() {
			addCriterion("cl_modify_time is null");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeIsNotNull() {
			addCriterion("cl_modify_time is not null");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeEqualTo(Date value) {
			addCriterion("cl_modify_time =", value, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeNotEqualTo(Date value) {
			addCriterion("cl_modify_time <>", value, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeGreaterThan(Date value) {
			addCriterion("cl_modify_time >", value, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("cl_modify_time >=", value, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeLessThan(Date value) {
			addCriterion("cl_modify_time <", value, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeLessThanOrEqualTo(Date value) {
			addCriterion("cl_modify_time <=", value, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeIn(List<Date> values) {
			addCriterion("cl_modify_time in", values, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeNotIn(List<Date> values) {
			addCriterion("cl_modify_time not in", values, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeBetween(Date value1, Date value2) {
			addCriterion("cl_modify_time between", value1, value2, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyTimeNotBetween(Date value1, Date value2) {
			addCriterion("cl_modify_time not between", value1, value2, "clModifyTime");
			return (Criteria) this;
		}

		public Criteria andClModifyByIsNull() {
			addCriterion("cl_modify_by is null");
			return (Criteria) this;
		}

		public Criteria andClModifyByIsNotNull() {
			addCriterion("cl_modify_by is not null");
			return (Criteria) this;
		}

		public Criteria andClModifyByEqualTo(String value) {
			addCriterion("cl_modify_by =", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByNotEqualTo(String value) {
			addCriterion("cl_modify_by <>", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByGreaterThan(String value) {
			addCriterion("cl_modify_by >", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByGreaterThanOrEqualTo(String value) {
			addCriterion("cl_modify_by >=", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByLessThan(String value) {
			addCriterion("cl_modify_by <", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByLessThanOrEqualTo(String value) {
			addCriterion("cl_modify_by <=", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByLike(String value) {
			addCriterion("cl_modify_by like", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByNotLike(String value) {
			addCriterion("cl_modify_by not like", value, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByIn(List<String> values) {
			addCriterion("cl_modify_by in", values, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByNotIn(List<String> values) {
			addCriterion("cl_modify_by not in", values, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByBetween(String value1, String value2) {
			addCriterion("cl_modify_by between", value1, value2, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClModifyByNotBetween(String value1, String value2) {
			addCriterion("cl_modify_by not between", value1, value2, "clModifyBy");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdIsNull() {
			addCriterion("cl_work_team_id is null");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdIsNotNull() {
			addCriterion("cl_work_team_id is not null");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdEqualTo(String value) {
			addCriterion("cl_work_team_id =", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdNotEqualTo(String value) {
			addCriterion("cl_work_team_id <>", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdGreaterThan(String value) {
			addCriterion("cl_work_team_id >", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdGreaterThanOrEqualTo(String value) {
			addCriterion("cl_work_team_id >=", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdLessThan(String value) {
			addCriterion("cl_work_team_id <", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdLessThanOrEqualTo(String value) {
			addCriterion("cl_work_team_id <=", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdLike(String value) {
			addCriterion("cl_work_team_id like", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdNotLike(String value) {
			addCriterion("cl_work_team_id not like", value, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdIn(List<String> values) {
			addCriterion("cl_work_team_id in", values, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdNotIn(List<String> values) {
			addCriterion("cl_work_team_id not in", values, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdBetween(String value1, String value2) {
			addCriterion("cl_work_team_id between", value1, value2, "clWorkTeamId");
			return (Criteria) this;
		}

		public Criteria andClWorkTeamIdNotBetween(String value1, String value2) {
			addCriterion("cl_work_team_id not between", value1, value2, "clWorkTeamId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table perms.perms_t_department
	 * @mbggenerated  Wed Apr 12 15:37:40 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table perms.perms_t_department
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 30 11:00:16 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}