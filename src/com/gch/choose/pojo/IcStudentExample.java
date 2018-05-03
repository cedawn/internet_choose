package com.gch.choose.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IcStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcStudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Long value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Long value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Long value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Long value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Long value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Long> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Long> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Long value1, Long value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Long value1, Long value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuNumberIsNull() {
            addCriterion("stu_number is null");
            return (Criteria) this;
        }

        public Criteria andStuNumberIsNotNull() {
            addCriterion("stu_number is not null");
            return (Criteria) this;
        }

        public Criteria andStuNumberEqualTo(Long value) {
            addCriterion("stu_number =", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberNotEqualTo(Long value) {
            addCriterion("stu_number <>", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberGreaterThan(Long value) {
            addCriterion("stu_number >", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_number >=", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberLessThan(Long value) {
            addCriterion("stu_number <", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberLessThanOrEqualTo(Long value) {
            addCriterion("stu_number <=", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberIn(List<Long> values) {
            addCriterion("stu_number in", values, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberNotIn(List<Long> values) {
            addCriterion("stu_number not in", values, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberBetween(Long value1, Long value2) {
            addCriterion("stu_number between", value1, value2, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberNotBetween(Long value1, Long value2) {
            addCriterion("stu_number not between", value1, value2, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuSortingIsNull() {
            addCriterion("stu_sorting is null");
            return (Criteria) this;
        }

        public Criteria andStuSortingIsNotNull() {
            addCriterion("stu_sorting is not null");
            return (Criteria) this;
        }

        public Criteria andStuSortingEqualTo(String value) {
            addCriterion("stu_sorting =", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingNotEqualTo(String value) {
            addCriterion("stu_sorting <>", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingGreaterThan(String value) {
            addCriterion("stu_sorting >", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sorting >=", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingLessThan(String value) {
            addCriterion("stu_sorting <", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingLessThanOrEqualTo(String value) {
            addCriterion("stu_sorting <=", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingLike(String value) {
            addCriterion("stu_sorting like", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingNotLike(String value) {
            addCriterion("stu_sorting not like", value, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingIn(List<String> values) {
            addCriterion("stu_sorting in", values, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingNotIn(List<String> values) {
            addCriterion("stu_sorting not in", values, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingBetween(String value1, String value2) {
            addCriterion("stu_sorting between", value1, value2, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuSortingNotBetween(String value1, String value2) {
            addCriterion("stu_sorting not between", value1, value2, "stuSorting");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalIsNull() {
            addCriterion("stu_professional is null");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalIsNotNull() {
            addCriterion("stu_professional is not null");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalEqualTo(String value) {
            addCriterion("stu_professional =", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalNotEqualTo(String value) {
            addCriterion("stu_professional <>", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalGreaterThan(String value) {
            addCriterion("stu_professional >", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("stu_professional >=", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalLessThan(String value) {
            addCriterion("stu_professional <", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalLessThanOrEqualTo(String value) {
            addCriterion("stu_professional <=", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalLike(String value) {
            addCriterion("stu_professional like", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalNotLike(String value) {
            addCriterion("stu_professional not like", value, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalIn(List<String> values) {
            addCriterion("stu_professional in", values, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalNotIn(List<String> values) {
            addCriterion("stu_professional not in", values, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalBetween(String value1, String value2) {
            addCriterion("stu_professional between", value1, value2, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuProfessionalNotBetween(String value1, String value2) {
            addCriterion("stu_professional not between", value1, value2, "stuProfessional");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdIsNull() {
            addCriterion("stu_course_id is null");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdIsNotNull() {
            addCriterion("stu_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdEqualTo(Long value) {
            addCriterion("stu_course_id =", value, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdNotEqualTo(Long value) {
            addCriterion("stu_course_id <>", value, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdGreaterThan(Long value) {
            addCriterion("stu_course_id >", value, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_course_id >=", value, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdLessThan(Long value) {
            addCriterion("stu_course_id <", value, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("stu_course_id <=", value, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdIn(List<Long> values) {
            addCriterion("stu_course_id in", values, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdNotIn(List<Long> values) {
            addCriterion("stu_course_id not in", values, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdBetween(Long value1, Long value2) {
            addCriterion("stu_course_id between", value1, value2, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("stu_course_id not between", value1, value2, "stuCourseId");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNull() {
            addCriterion("stu_password is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(Long value) {
            addCriterion("stu_password =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(Long value) {
            addCriterion("stu_password <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(Long value) {
            addCriterion("stu_password >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_password >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(Long value) {
            addCriterion("stu_password <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(Long value) {
            addCriterion("stu_password <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<Long> values) {
            addCriterion("stu_password in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<Long> values) {
            addCriterion("stu_password not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(Long value1, Long value2) {
            addCriterion("stu_password between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(Long value1, Long value2) {
            addCriterion("stu_password not between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuMobileIsNull() {
            addCriterion("stu_mobile is null");
            return (Criteria) this;
        }

        public Criteria andStuMobileIsNotNull() {
            addCriterion("stu_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andStuMobileEqualTo(String value) {
            addCriterion("stu_mobile =", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotEqualTo(String value) {
            addCriterion("stu_mobile <>", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileGreaterThan(String value) {
            addCriterion("stu_mobile >", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileGreaterThanOrEqualTo(String value) {
            addCriterion("stu_mobile >=", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileLessThan(String value) {
            addCriterion("stu_mobile <", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileLessThanOrEqualTo(String value) {
            addCriterion("stu_mobile <=", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileLike(String value) {
            addCriterion("stu_mobile like", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotLike(String value) {
            addCriterion("stu_mobile not like", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileIn(List<String> values) {
            addCriterion("stu_mobile in", values, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotIn(List<String> values) {
            addCriterion("stu_mobile not in", values, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileBetween(String value1, String value2) {
            addCriterion("stu_mobile between", value1, value2, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotBetween(String value1, String value2) {
            addCriterion("stu_mobile not between", value1, value2, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeIsNull() {
            addCriterion("stu_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeIsNotNull() {
            addCriterion("stu_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeEqualTo(String value) {
            addCriterion("stu_zipcode =", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeNotEqualTo(String value) {
            addCriterion("stu_zipcode <>", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeGreaterThan(String value) {
            addCriterion("stu_zipcode >", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_zipcode >=", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeLessThan(String value) {
            addCriterion("stu_zipcode <", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeLessThanOrEqualTo(String value) {
            addCriterion("stu_zipcode <=", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeLike(String value) {
            addCriterion("stu_zipcode like", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeNotLike(String value) {
            addCriterion("stu_zipcode not like", value, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeIn(List<String> values) {
            addCriterion("stu_zipcode in", values, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeNotIn(List<String> values) {
            addCriterion("stu_zipcode not in", values, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeBetween(String value1, String value2) {
            addCriterion("stu_zipcode between", value1, value2, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuZipcodeNotBetween(String value1, String value2) {
            addCriterion("stu_zipcode not between", value1, value2, "stuZipcode");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNull() {
            addCriterion("stu_address is null");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNotNull() {
            addCriterion("stu_address is not null");
            return (Criteria) this;
        }

        public Criteria andStuAddressEqualTo(String value) {
            addCriterion("stu_address =", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotEqualTo(String value) {
            addCriterion("stu_address <>", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThan(String value) {
            addCriterion("stu_address >", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("stu_address >=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThan(String value) {
            addCriterion("stu_address <", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThanOrEqualTo(String value) {
            addCriterion("stu_address <=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLike(String value) {
            addCriterion("stu_address like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotLike(String value) {
            addCriterion("stu_address not like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressIn(List<String> values) {
            addCriterion("stu_address in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotIn(List<String> values) {
            addCriterion("stu_address not in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressBetween(String value1, String value2) {
            addCriterion("stu_address between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotBetween(String value1, String value2) {
            addCriterion("stu_address not between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeIsNull() {
            addCriterion("stu_createtime is null");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeIsNotNull() {
            addCriterion("stu_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeEqualTo(Date value) {
            addCriterion("stu_createtime =", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeNotEqualTo(Date value) {
            addCriterion("stu_createtime <>", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeGreaterThan(Date value) {
            addCriterion("stu_createtime >", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_createtime >=", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeLessThan(Date value) {
            addCriterion("stu_createtime <", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_createtime <=", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeIn(List<Date> values) {
            addCriterion("stu_createtime in", values, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeNotIn(List<Date> values) {
            addCriterion("stu_createtime not in", values, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeBetween(Date value1, Date value2) {
            addCriterion("stu_createtime between", value1, value2, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_createtime not between", value1, value2, "stuCreatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}