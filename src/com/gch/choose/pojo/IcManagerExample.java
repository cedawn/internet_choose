package com.gch.choose.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IcManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcManagerExample() {
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

        public Criteria andManIdIsNull() {
            addCriterion("man_id is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("man_id is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(Long value) {
            addCriterion("man_id =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(Long value) {
            addCriterion("man_id <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(Long value) {
            addCriterion("man_id >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(Long value) {
            addCriterion("man_id >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(Long value) {
            addCriterion("man_id <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(Long value) {
            addCriterion("man_id <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<Long> values) {
            addCriterion("man_id in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<Long> values) {
            addCriterion("man_id not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(Long value1, Long value2) {
            addCriterion("man_id between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(Long value1, Long value2) {
            addCriterion("man_id not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManUsernameIsNull() {
            addCriterion("man_username is null");
            return (Criteria) this;
        }

        public Criteria andManUsernameIsNotNull() {
            addCriterion("man_username is not null");
            return (Criteria) this;
        }

        public Criteria andManUsernameEqualTo(String value) {
            addCriterion("man_username =", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameNotEqualTo(String value) {
            addCriterion("man_username <>", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameGreaterThan(String value) {
            addCriterion("man_username >", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("man_username >=", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameLessThan(String value) {
            addCriterion("man_username <", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameLessThanOrEqualTo(String value) {
            addCriterion("man_username <=", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameLike(String value) {
            addCriterion("man_username like", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameNotLike(String value) {
            addCriterion("man_username not like", value, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameIn(List<String> values) {
            addCriterion("man_username in", values, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameNotIn(List<String> values) {
            addCriterion("man_username not in", values, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameBetween(String value1, String value2) {
            addCriterion("man_username between", value1, value2, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManUsernameNotBetween(String value1, String value2) {
            addCriterion("man_username not between", value1, value2, "manUsername");
            return (Criteria) this;
        }

        public Criteria andManTurenameIsNull() {
            addCriterion("man_turename is null");
            return (Criteria) this;
        }

        public Criteria andManTurenameIsNotNull() {
            addCriterion("man_turename is not null");
            return (Criteria) this;
        }

        public Criteria andManTurenameEqualTo(String value) {
            addCriterion("man_turename =", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameNotEqualTo(String value) {
            addCriterion("man_turename <>", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameGreaterThan(String value) {
            addCriterion("man_turename >", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameGreaterThanOrEqualTo(String value) {
            addCriterion("man_turename >=", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameLessThan(String value) {
            addCriterion("man_turename <", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameLessThanOrEqualTo(String value) {
            addCriterion("man_turename <=", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameLike(String value) {
            addCriterion("man_turename like", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameNotLike(String value) {
            addCriterion("man_turename not like", value, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameIn(List<String> values) {
            addCriterion("man_turename in", values, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameNotIn(List<String> values) {
            addCriterion("man_turename not in", values, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameBetween(String value1, String value2) {
            addCriterion("man_turename between", value1, value2, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManTurenameNotBetween(String value1, String value2) {
            addCriterion("man_turename not between", value1, value2, "manTurename");
            return (Criteria) this;
        }

        public Criteria andManPasswordIsNull() {
            addCriterion("man_password is null");
            return (Criteria) this;
        }

        public Criteria andManPasswordIsNotNull() {
            addCriterion("man_password is not null");
            return (Criteria) this;
        }

        public Criteria andManPasswordEqualTo(Long value) {
            addCriterion("man_password =", value, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordNotEqualTo(Long value) {
            addCriterion("man_password <>", value, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordGreaterThan(Long value) {
            addCriterion("man_password >", value, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordGreaterThanOrEqualTo(Long value) {
            addCriterion("man_password >=", value, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordLessThan(Long value) {
            addCriterion("man_password <", value, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordLessThanOrEqualTo(Long value) {
            addCriterion("man_password <=", value, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordIn(List<Long> values) {
            addCriterion("man_password in", values, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordNotIn(List<Long> values) {
            addCriterion("man_password not in", values, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordBetween(Long value1, Long value2) {
            addCriterion("man_password between", value1, value2, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManPasswordNotBetween(Long value1, Long value2) {
            addCriterion("man_password not between", value1, value2, "manPassword");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeIsNull() {
            addCriterion("man_createtime is null");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeIsNotNull() {
            addCriterion("man_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeEqualTo(Date value) {
            addCriterion("man_createtime =", value, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeNotEqualTo(Date value) {
            addCriterion("man_createtime <>", value, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeGreaterThan(Date value) {
            addCriterion("man_createtime >", value, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("man_createtime >=", value, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeLessThan(Date value) {
            addCriterion("man_createtime <", value, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("man_createtime <=", value, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeIn(List<Date> values) {
            addCriterion("man_createtime in", values, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeNotIn(List<Date> values) {
            addCriterion("man_createtime not in", values, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeBetween(Date value1, Date value2) {
            addCriterion("man_createtime between", value1, value2, "manCreatetime");
            return (Criteria) this;
        }

        public Criteria andManCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("man_createtime not between", value1, value2, "manCreatetime");
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