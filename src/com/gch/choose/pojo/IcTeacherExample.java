package com.gch.choose.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IcTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcTeacherExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Long value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Long value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Long value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Long value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Long value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Long> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Long> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Long value1, Long value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Long value1, Long value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(String value) {
            addCriterion("tea_sex =", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(String value) {
            addCriterion("tea_sex <>", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(String value) {
            addCriterion("tea_sex >", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(String value) {
            addCriterion("tea_sex >=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(String value) {
            addCriterion("tea_sex <", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(String value) {
            addCriterion("tea_sex <=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLike(String value) {
            addCriterion("tea_sex like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotLike(String value) {
            addCriterion("tea_sex not like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<String> values) {
            addCriterion("tea_sex in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<String> values) {
            addCriterion("tea_sex not in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(String value1, String value2) {
            addCriterion("tea_sex between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(String value1, String value2) {
            addCriterion("tea_sex not between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaNumberIsNull() {
            addCriterion("tea_number is null");
            return (Criteria) this;
        }

        public Criteria andTeaNumberIsNotNull() {
            addCriterion("tea_number is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNumberEqualTo(Long value) {
            addCriterion("tea_number =", value, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberNotEqualTo(Long value) {
            addCriterion("tea_number <>", value, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberGreaterThan(Long value) {
            addCriterion("tea_number >", value, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("tea_number >=", value, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberLessThan(Long value) {
            addCriterion("tea_number <", value, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberLessThanOrEqualTo(Long value) {
            addCriterion("tea_number <=", value, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberIn(List<Long> values) {
            addCriterion("tea_number in", values, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberNotIn(List<Long> values) {
            addCriterion("tea_number not in", values, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberBetween(Long value1, Long value2) {
            addCriterion("tea_number between", value1, value2, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaNumberNotBetween(Long value1, Long value2) {
            addCriterion("tea_number not between", value1, value2, "teaNumber");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordIsNull() {
            addCriterion("tea_password is null");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordIsNotNull() {
            addCriterion("tea_password is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordEqualTo(Long value) {
            addCriterion("tea_password =", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordNotEqualTo(Long value) {
            addCriterion("tea_password <>", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordGreaterThan(Long value) {
            addCriterion("tea_password >", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordGreaterThanOrEqualTo(Long value) {
            addCriterion("tea_password >=", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordLessThan(Long value) {
            addCriterion("tea_password <", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordLessThanOrEqualTo(Long value) {
            addCriterion("tea_password <=", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordIn(List<Long> values) {
            addCriterion("tea_password in", values, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordNotIn(List<Long> values) {
            addCriterion("tea_password not in", values, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordBetween(Long value1, Long value2) {
            addCriterion("tea_password between", value1, value2, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordNotBetween(Long value1, Long value2) {
            addCriterion("tea_password not between", value1, value2, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNull() {
            addCriterion("tea_email is null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNotNull() {
            addCriterion("tea_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailEqualTo(String value) {
            addCriterion("tea_email =", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotEqualTo(String value) {
            addCriterion("tea_email <>", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThan(String value) {
            addCriterion("tea_email >", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tea_email >=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThan(String value) {
            addCriterion("tea_email <", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThanOrEqualTo(String value) {
            addCriterion("tea_email <=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLike(String value) {
            addCriterion("tea_email like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotLike(String value) {
            addCriterion("tea_email not like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIn(List<String> values) {
            addCriterion("tea_email in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotIn(List<String> values) {
            addCriterion("tea_email not in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailBetween(String value1, String value2) {
            addCriterion("tea_email between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotBetween(String value1, String value2) {
            addCriterion("tea_email not between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaMobileIsNull() {
            addCriterion("tea_mobile is null");
            return (Criteria) this;
        }

        public Criteria andTeaMobileIsNotNull() {
            addCriterion("tea_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andTeaMobileEqualTo(String value) {
            addCriterion("tea_mobile =", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileNotEqualTo(String value) {
            addCriterion("tea_mobile <>", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileGreaterThan(String value) {
            addCriterion("tea_mobile >", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileGreaterThanOrEqualTo(String value) {
            addCriterion("tea_mobile >=", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileLessThan(String value) {
            addCriterion("tea_mobile <", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileLessThanOrEqualTo(String value) {
            addCriterion("tea_mobile <=", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileLike(String value) {
            addCriterion("tea_mobile like", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileNotLike(String value) {
            addCriterion("tea_mobile not like", value, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileIn(List<String> values) {
            addCriterion("tea_mobile in", values, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileNotIn(List<String> values) {
            addCriterion("tea_mobile not in", values, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileBetween(String value1, String value2) {
            addCriterion("tea_mobile between", value1, value2, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaMobileNotBetween(String value1, String value2) {
            addCriterion("tea_mobile not between", value1, value2, "teaMobile");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeIsNull() {
            addCriterion("tea_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeIsNotNull() {
            addCriterion("tea_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeEqualTo(String value) {
            addCriterion("tea_zipcode =", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeNotEqualTo(String value) {
            addCriterion("tea_zipcode <>", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeGreaterThan(String value) {
            addCriterion("tea_zipcode >", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tea_zipcode >=", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeLessThan(String value) {
            addCriterion("tea_zipcode <", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeLessThanOrEqualTo(String value) {
            addCriterion("tea_zipcode <=", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeLike(String value) {
            addCriterion("tea_zipcode like", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeNotLike(String value) {
            addCriterion("tea_zipcode not like", value, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeIn(List<String> values) {
            addCriterion("tea_zipcode in", values, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeNotIn(List<String> values) {
            addCriterion("tea_zipcode not in", values, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeBetween(String value1, String value2) {
            addCriterion("tea_zipcode between", value1, value2, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaZipcodeNotBetween(String value1, String value2) {
            addCriterion("tea_zipcode not between", value1, value2, "teaZipcode");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIsNull() {
            addCriterion("tea_address is null");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIsNotNull() {
            addCriterion("tea_address is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAddressEqualTo(String value) {
            addCriterion("tea_address =", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotEqualTo(String value) {
            addCriterion("tea_address <>", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressGreaterThan(String value) {
            addCriterion("tea_address >", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tea_address >=", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLessThan(String value) {
            addCriterion("tea_address <", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLessThanOrEqualTo(String value) {
            addCriterion("tea_address <=", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLike(String value) {
            addCriterion("tea_address like", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotLike(String value) {
            addCriterion("tea_address not like", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIn(List<String> values) {
            addCriterion("tea_address in", values, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotIn(List<String> values) {
            addCriterion("tea_address not in", values, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressBetween(String value1, String value2) {
            addCriterion("tea_address between", value1, value2, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotBetween(String value1, String value2) {
            addCriterion("tea_address not between", value1, value2, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeIsNull() {
            addCriterion("tea_createtime is null");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeIsNotNull() {
            addCriterion("tea_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeEqualTo(Date value) {
            addCriterion("tea_createtime =", value, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeNotEqualTo(Date value) {
            addCriterion("tea_createtime <>", value, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeGreaterThan(Date value) {
            addCriterion("tea_createtime >", value, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tea_createtime >=", value, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeLessThan(Date value) {
            addCriterion("tea_createtime <", value, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("tea_createtime <=", value, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeIn(List<Date> values) {
            addCriterion("tea_createtime in", values, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeNotIn(List<Date> values) {
            addCriterion("tea_createtime not in", values, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeBetween(Date value1, Date value2) {
            addCriterion("tea_createtime between", value1, value2, "teaCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeaCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("tea_createtime not between", value1, value2, "teaCreatetime");
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