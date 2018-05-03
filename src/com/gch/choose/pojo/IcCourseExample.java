package com.gch.choose.pojo;

import java.util.ArrayList;
import java.util.List;

public class IcCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcCourseExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Long value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Long value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Long value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Long value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Long> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Long> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Long value1, Long value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdIsNull() {
            addCriterion("course_tea_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdIsNotNull() {
            addCriterion("course_tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdEqualTo(Long value) {
            addCriterion("course_tea_id =", value, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdNotEqualTo(Long value) {
            addCriterion("course_tea_id <>", value, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdGreaterThan(Long value) {
            addCriterion("course_tea_id >", value, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_tea_id >=", value, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdLessThan(Long value) {
            addCriterion("course_tea_id <", value, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdLessThanOrEqualTo(Long value) {
            addCriterion("course_tea_id <=", value, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdIn(List<Long> values) {
            addCriterion("course_tea_id in", values, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdNotIn(List<Long> values) {
            addCriterion("course_tea_id not in", values, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdBetween(Long value1, Long value2) {
            addCriterion("course_tea_id between", value1, value2, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseTeaIdNotBetween(Long value1, Long value2) {
            addCriterion("course_tea_id not between", value1, value2, "courseTeaId");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomIsNull() {
            addCriterion("course_classroom is null");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomIsNotNull() {
            addCriterion("course_classroom is not null");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomEqualTo(Integer value) {
            addCriterion("course_classroom =", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomNotEqualTo(Integer value) {
            addCriterion("course_classroom <>", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomGreaterThan(Integer value) {
            addCriterion("course_classroom >", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_classroom >=", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomLessThan(Integer value) {
            addCriterion("course_classroom <", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomLessThanOrEqualTo(Integer value) {
            addCriterion("course_classroom <=", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomIn(List<Integer> values) {
            addCriterion("course_classroom in", values, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomNotIn(List<Integer> values) {
            addCriterion("course_classroom not in", values, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomBetween(Integer value1, Integer value2) {
            addCriterion("course_classroom between", value1, value2, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomNotBetween(Integer value1, Integer value2) {
            addCriterion("course_classroom not between", value1, value2, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNull() {
            addCriterion("course_credit is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNotNull() {
            addCriterion("course_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditEqualTo(Integer value) {
            addCriterion("course_credit =", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotEqualTo(Integer value) {
            addCriterion("course_credit <>", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThan(Integer value) {
            addCriterion("course_credit >", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_credit >=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThan(Integer value) {
            addCriterion("course_credit <", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThanOrEqualTo(Integer value) {
            addCriterion("course_credit <=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIn(List<Integer> values) {
            addCriterion("course_credit in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotIn(List<Integer> values) {
            addCriterion("course_credit not in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditBetween(Integer value1, Integer value2) {
            addCriterion("course_credit between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("course_credit not between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNull() {
            addCriterion("course_date is null");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNotNull() {
            addCriterion("course_date is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDateEqualTo(String value) {
            addCriterion("course_date =", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotEqualTo(String value) {
            addCriterion("course_date <>", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThan(String value) {
            addCriterion("course_date >", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThanOrEqualTo(String value) {
            addCriterion("course_date >=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThan(String value) {
            addCriterion("course_date <", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThanOrEqualTo(String value) {
            addCriterion("course_date <=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLike(String value) {
            addCriterion("course_date like", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotLike(String value) {
            addCriterion("course_date not like", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateIn(List<String> values) {
            addCriterion("course_date in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotIn(List<String> values) {
            addCriterion("course_date not in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateBetween(String value1, String value2) {
            addCriterion("course_date between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotBetween(String value1, String value2) {
            addCriterion("course_date not between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNull() {
            addCriterion("course_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNotNull() {
            addCriterion("course_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeEqualTo(String value) {
            addCriterion("course_time =", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotEqualTo(String value) {
            addCriterion("course_time <>", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThan(String value) {
            addCriterion("course_time >", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("course_time >=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThan(String value) {
            addCriterion("course_time <", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThanOrEqualTo(String value) {
            addCriterion("course_time <=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLike(String value) {
            addCriterion("course_time like", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotLike(String value) {
            addCriterion("course_time not like", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIn(List<String> values) {
            addCriterion("course_time in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotIn(List<String> values) {
            addCriterion("course_time not in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeBetween(String value1, String value2) {
            addCriterion("course_time between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotBetween(String value1, String value2) {
            addCriterion("course_time not between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseStateIsNull() {
            addCriterion("course_state is null");
            return (Criteria) this;
        }

        public Criteria andCourseStateIsNotNull() {
            addCriterion("course_state is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStateEqualTo(String value) {
            addCriterion("course_state =", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotEqualTo(String value) {
            addCriterion("course_state <>", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateGreaterThan(String value) {
            addCriterion("course_state >", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateGreaterThanOrEqualTo(String value) {
            addCriterion("course_state >=", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateLessThan(String value) {
            addCriterion("course_state <", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateLessThanOrEqualTo(String value) {
            addCriterion("course_state <=", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateLike(String value) {
            addCriterion("course_state like", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotLike(String value) {
            addCriterion("course_state not like", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateIn(List<String> values) {
            addCriterion("course_state in", values, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotIn(List<String> values) {
            addCriterion("course_state not in", values, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateBetween(String value1, String value2) {
            addCriterion("course_state between", value1, value2, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotBetween(String value1, String value2) {
            addCriterion("course_state not between", value1, value2, "courseState");
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