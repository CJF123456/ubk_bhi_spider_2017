package com.unbank.mybatis.vo;

import java.util.ArrayList;
import java.util.List;

public class BhiSurveyExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public BhiSurveyExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentIsNull() {
			addCriterion("survey_department is null");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentIsNotNull() {
			addCriterion("survey_department is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentEqualTo(String value) {
			addCriterion("survey_department =", value, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentNotEqualTo(String value) {
			addCriterion("survey_department <>", value, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentGreaterThan(String value) {
			addCriterion("survey_department >", value, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentGreaterThanOrEqualTo(String value) {
			addCriterion("survey_department >=", value, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentLessThan(String value) {
			addCriterion("survey_department <", value, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentLessThanOrEqualTo(String value) {
			addCriterion("survey_department <=", value, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentLike(String value) {
			addCriterion("survey_department like", value, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentNotLike(String value) {
			addCriterion("survey_department not like", value,
					"surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentIn(List<String> values) {
			addCriterion("survey_department in", values, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentNotIn(List<String> values) {
			addCriterion("survey_department not in", values, "surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentBetween(String value1, String value2) {
			addCriterion("survey_department between", value1, value2,
					"surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyDepartmentNotBetween(String value1,
				String value2) {
			addCriterion("survey_department not between", value1, value2,
					"surveyDepartment");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleIsNull() {
			addCriterion("survey_people is null");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleIsNotNull() {
			addCriterion("survey_people is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleEqualTo(String value) {
			addCriterion("survey_people =", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleNotEqualTo(String value) {
			addCriterion("survey_people <>", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleGreaterThan(String value) {
			addCriterion("survey_people >", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleGreaterThanOrEqualTo(String value) {
			addCriterion("survey_people >=", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleLessThan(String value) {
			addCriterion("survey_people <", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleLessThanOrEqualTo(String value) {
			addCriterion("survey_people <=", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleLike(String value) {
			addCriterion("survey_people like", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleNotLike(String value) {
			addCriterion("survey_people not like", value, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleIn(List<String> values) {
			addCriterion("survey_people in", values, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleNotIn(List<String> values) {
			addCriterion("survey_people not in", values, "surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleBetween(String value1, String value2) {
			addCriterion("survey_people between", value1, value2,
					"surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleNotBetween(String value1, String value2) {
			addCriterion("survey_people not between", value1, value2,
					"surveyPeople");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobIsNull() {
			addCriterion("survey_people_job is null");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobIsNotNull() {
			addCriterion("survey_people_job is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobEqualTo(String value) {
			addCriterion("survey_people_job =", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobNotEqualTo(String value) {
			addCriterion("survey_people_job <>", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobGreaterThan(String value) {
			addCriterion("survey_people_job >", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobGreaterThanOrEqualTo(String value) {
			addCriterion("survey_people_job >=", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobLessThan(String value) {
			addCriterion("survey_people_job <", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobLessThanOrEqualTo(String value) {
			addCriterion("survey_people_job <=", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobLike(String value) {
			addCriterion("survey_people_job like", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobNotLike(String value) {
			addCriterion("survey_people_job not like", value, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobIn(List<String> values) {
			addCriterion("survey_people_job in", values, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobNotIn(List<String> values) {
			addCriterion("survey_people_job not in", values, "surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobBetween(String value1, String value2) {
			addCriterion("survey_people_job between", value1, value2,
					"surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyPeopleJobNotBetween(String value1,
				String value2) {
			addCriterion("survey_people_job not between", value1, value2,
					"surveyPeopleJob");
			return (Criteria) this;
		}

		public Criteria andSurveyTelIsNull() {
			addCriterion("survey_tel is null");
			return (Criteria) this;
		}

		public Criteria andSurveyTelIsNotNull() {
			addCriterion("survey_tel is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyTelEqualTo(String value) {
			addCriterion("survey_tel =", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelNotEqualTo(String value) {
			addCriterion("survey_tel <>", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelGreaterThan(String value) {
			addCriterion("survey_tel >", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelGreaterThanOrEqualTo(String value) {
			addCriterion("survey_tel >=", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelLessThan(String value) {
			addCriterion("survey_tel <", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelLessThanOrEqualTo(String value) {
			addCriterion("survey_tel <=", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelLike(String value) {
			addCriterion("survey_tel like", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelNotLike(String value) {
			addCriterion("survey_tel not like", value, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelIn(List<String> values) {
			addCriterion("survey_tel in", values, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelNotIn(List<String> values) {
			addCriterion("survey_tel not in", values, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelBetween(String value1, String value2) {
			addCriterion("survey_tel between", value1, value2, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyTelNotBetween(String value1, String value2) {
			addCriterion("survey_tel not between", value1, value2, "surveyTel");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxIsNull() {
			addCriterion("survey_fax is null");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxIsNotNull() {
			addCriterion("survey_fax is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxEqualTo(String value) {
			addCriterion("survey_fax =", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxNotEqualTo(String value) {
			addCriterion("survey_fax <>", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxGreaterThan(String value) {
			addCriterion("survey_fax >", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxGreaterThanOrEqualTo(String value) {
			addCriterion("survey_fax >=", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxLessThan(String value) {
			addCriterion("survey_fax <", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxLessThanOrEqualTo(String value) {
			addCriterion("survey_fax <=", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxLike(String value) {
			addCriterion("survey_fax like", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxNotLike(String value) {
			addCriterion("survey_fax not like", value, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxIn(List<String> values) {
			addCriterion("survey_fax in", values, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxNotIn(List<String> values) {
			addCriterion("survey_fax not in", values, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxBetween(String value1, String value2) {
			addCriterion("survey_fax between", value1, value2, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyFaxNotBetween(String value1, String value2) {
			addCriterion("survey_fax not between", value1, value2, "surveyFax");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeIsNull() {
			addCriterion("survey_postcode is null");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeIsNotNull() {
			addCriterion("survey_postcode is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeEqualTo(String value) {
			addCriterion("survey_postcode =", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeNotEqualTo(String value) {
			addCriterion("survey_postcode <>", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeGreaterThan(String value) {
			addCriterion("survey_postcode >", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeGreaterThanOrEqualTo(String value) {
			addCriterion("survey_postcode >=", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeLessThan(String value) {
			addCriterion("survey_postcode <", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeLessThanOrEqualTo(String value) {
			addCriterion("survey_postcode <=", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeLike(String value) {
			addCriterion("survey_postcode like", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeNotLike(String value) {
			addCriterion("survey_postcode not like", value, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeIn(List<String> values) {
			addCriterion("survey_postcode in", values, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeNotIn(List<String> values) {
			addCriterion("survey_postcode not in", values, "surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeBetween(String value1, String value2) {
			addCriterion("survey_postcode between", value1, value2,
					"surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyPostcodeNotBetween(String value1, String value2) {
			addCriterion("survey_postcode not between", value1, value2,
					"surveyPostcode");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressIsNull() {
			addCriterion("survey_detail_address is null");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressIsNotNull() {
			addCriterion("survey_detail_address is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressEqualTo(String value) {
			addCriterion("survey_detail_address =", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressNotEqualTo(String value) {
			addCriterion("survey_detail_address <>", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressGreaterThan(String value) {
			addCriterion("survey_detail_address >", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressGreaterThanOrEqualTo(String value) {
			addCriterion("survey_detail_address >=", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressLessThan(String value) {
			addCriterion("survey_detail_address <", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressLessThanOrEqualTo(String value) {
			addCriterion("survey_detail_address <=", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressLike(String value) {
			addCriterion("survey_detail_address like", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressNotLike(String value) {
			addCriterion("survey_detail_address not like", value,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressIn(List<String> values) {
			addCriterion("survey_detail_address in", values,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressNotIn(List<String> values) {
			addCriterion("survey_detail_address not in", values,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressBetween(String value1,
				String value2) {
			addCriterion("survey_detail_address between", value1, value2,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyDetailAddressNotBetween(String value1,
				String value2) {
			addCriterion("survey_detail_address not between", value1, value2,
					"surveyDetailAddress");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlIsNull() {
			addCriterion("survey_weburl is null");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlIsNotNull() {
			addCriterion("survey_weburl is not null");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlEqualTo(String value) {
			addCriterion("survey_weburl =", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlNotEqualTo(String value) {
			addCriterion("survey_weburl <>", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlGreaterThan(String value) {
			addCriterion("survey_weburl >", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlGreaterThanOrEqualTo(String value) {
			addCriterion("survey_weburl >=", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlLessThan(String value) {
			addCriterion("survey_weburl <", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlLessThanOrEqualTo(String value) {
			addCriterion("survey_weburl <=", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlLike(String value) {
			addCriterion("survey_weburl like", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlNotLike(String value) {
			addCriterion("survey_weburl not like", value, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlIn(List<String> values) {
			addCriterion("survey_weburl in", values, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlNotIn(List<String> values) {
			addCriterion("survey_weburl not in", values, "surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlBetween(String value1, String value2) {
			addCriterion("survey_weburl between", value1, value2,
					"surveyWeburl");
			return (Criteria) this;
		}

		public Criteria andSurveyWeburlNotBetween(String value1, String value2) {
			addCriterion("survey_weburl not between", value1, value2,
					"surveyWeburl");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table bhi_survey
	 * @mbggenerated  Tue Mar 31 15:11:14 GMT+08:00 2015
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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
     * This class corresponds to the database table bhi_survey
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 31 10:53:44 GMT+08:00 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}