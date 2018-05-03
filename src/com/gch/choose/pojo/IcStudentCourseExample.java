package com.gch.choose.pojo;

import java.util.ArrayList;
import java.util.List;

public class IcStudentCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcStudentCourseExample() {
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

        public Criteria andIscIdIsNull() {
            addCriterion("isc_id is null");
            return (Criteria) this;
        }

        public Criteria andIscIdIsNotNull() {
            addCriterion("isc_id is not null");
            return (Criteria) this;
        }

        public Criteria andIscIdEqualTo(Long value) {
            addCriterion("isc_id =", value, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdNotEqualTo(Long value) {
            addCriterion("isc_id <>", value, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdGreaterThan(Long value) {
            addCriterion("isc_id >", value, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdGreaterThanOrEqualTo(Long value) {
            addCriterion("isc_id >=", value, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdLessThan(Long value) {
            addCriterion("isc_id <", value, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdLessThanOrEqualTo(Long value) {
            addCriterion("isc_id <=", value, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdIn(List<Long> values) {
            addCriterion("isc_id in", values, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdNotIn(List<Long> values) {
            addCriterion("isc_id not in", values, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdBetween(Long value1, Long value2) {
            addCriterion("isc_id between", value1, value2, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscIdNotBetween(Long value1, Long value2) {
            addCriterion("isc_id not between", value1, value2, "iscId");
            return (Criteria) this;
        }

        public Criteria andIscStudentidIsNull() {
            addCriterion("isc_studentId is null");
            return (Criteria) this;
        }

        public Criteria andIscStudentidIsNotNull() {
            addCriterion("isc_studentId is not null");
            return (Criteria) this;
        }

        public Criteria andIscStudentidEqualTo(Long value) {
            addCriterion("isc_studentId =", value, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidNotEqualTo(Long value) {
            addCriterion("isc_studentId <>", value, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidGreaterThan(Long value) {
            addCriterion("isc_studentId >", value, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidGreaterThanOrEqualTo(Long value) {
            addCriterion("isc_studentId >=", value, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidLessThan(Long value) {
            addCriterion("isc_studentId <", value, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidLessThanOrEqualTo(Long value) {
            addCriterion("isc_studentId <=", value, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidIn(List<Long> values) {
            addCriterion("isc_studentId in", values, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidNotIn(List<Long> values) {
            addCriterion("isc_studentId not in", values, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidBetween(Long value1, Long value2) {
            addCriterion("isc_studentId between", value1, value2, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscStudentidNotBetween(Long value1, Long value2) {
            addCriterion("isc_studentId not between", value1, value2, "iscStudentid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidIsNull() {
            addCriterion("isc_courseId is null");
            return (Criteria) this;
        }

        public Criteria andIscCourseidIsNotNull() {
            addCriterion("isc_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andIscCourseidEqualTo(Long value) {
            addCriterion("isc_courseId =", value, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidNotEqualTo(Long value) {
            addCriterion("isc_courseId <>", value, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidGreaterThan(Long value) {
            addCriterion("isc_courseId >", value, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("isc_courseId >=", value, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidLessThan(Long value) {
            addCriterion("isc_courseId <", value, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidLessThanOrEqualTo(Long value) {
            addCriterion("isc_courseId <=", value, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidIn(List<Long> values) {
            addCriterion("isc_courseId in", values, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidNotIn(List<Long> values) {
            addCriterion("isc_courseId not in", values, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidBetween(Long value1, Long value2) {
            addCriterion("isc_courseId between", value1, value2, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscCourseidNotBetween(Long value1, Long value2) {
            addCriterion("isc_courseId not between", value1, value2, "iscCourseid");
            return (Criteria) this;
        }

        public Criteria andIscScoreIsNull() {
            addCriterion("isc_score is null");
            return (Criteria) this;
        }

        public Criteria andIscScoreIsNotNull() {
            addCriterion("isc_score is not null");
            return (Criteria) this;
        }

        public Criteria andIscScoreEqualTo(Integer value) {
            addCriterion("isc_score =", value, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreNotEqualTo(Integer value) {
            addCriterion("isc_score <>", value, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreGreaterThan(Integer value) {
            addCriterion("isc_score >", value, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("isc_score >=", value, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreLessThan(Integer value) {
            addCriterion("isc_score <", value, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreLessThanOrEqualTo(Integer value) {
            addCriterion("isc_score <=", value, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreIn(List<Integer> values) {
            addCriterion("isc_score in", values, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreNotIn(List<Integer> values) {
            addCriterion("isc_score not in", values, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreBetween(Integer value1, Integer value2) {
            addCriterion("isc_score between", value1, value2, "iscScore");
            return (Criteria) this;
        }

        public Criteria andIscScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("isc_score not between", value1, value2, "iscScore");
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