package com.sj.entity.reportforms;

import java.util.ArrayList;
import java.util.List;

public class ReportformsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportformsExample() {
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

        public Criteria andWattnameIsNull() {
            addCriterion("wattname is null");
            return (Criteria) this;
        }

        public Criteria andWattnameIsNotNull() {
            addCriterion("wattname is not null");
            return (Criteria) this;
        }

        public Criteria andWattnameEqualTo(String value) {
            addCriterion("wattname =", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameNotEqualTo(String value) {
            addCriterion("wattname <>", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameGreaterThan(String value) {
            addCriterion("wattname >", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameGreaterThanOrEqualTo(String value) {
            addCriterion("wattname >=", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameLessThan(String value) {
            addCriterion("wattname <", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameLessThanOrEqualTo(String value) {
            addCriterion("wattname <=", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameLike(String value) {
            addCriterion("wattname like", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameNotLike(String value) {
            addCriterion("wattname not like", value, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameIn(List<String> values) {
            addCriterion("wattname in", values, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameNotIn(List<String> values) {
            addCriterion("wattname not in", values, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameBetween(String value1, String value2) {
            addCriterion("wattname between", value1, value2, "wattname");
            return (Criteria) this;
        }

        public Criteria andWattnameNotBetween(String value1, String value2) {
            addCriterion("wattname not between", value1, value2, "wattname");
            return (Criteria) this;
        }

        public Criteria andSucceedIsNull() {
            addCriterion("succeed is null");
            return (Criteria) this;
        }

        public Criteria andSucceedIsNotNull() {
            addCriterion("succeed is not null");
            return (Criteria) this;
        }

        public Criteria andSucceedEqualTo(Integer value) {
            addCriterion("succeed =", value, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedNotEqualTo(Integer value) {
            addCriterion("succeed <>", value, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedGreaterThan(Integer value) {
            addCriterion("succeed >", value, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedGreaterThanOrEqualTo(Integer value) {
            addCriterion("succeed >=", value, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedLessThan(Integer value) {
            addCriterion("succeed <", value, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedLessThanOrEqualTo(Integer value) {
            addCriterion("succeed <=", value, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedIn(List<Integer> values) {
            addCriterion("succeed in", values, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedNotIn(List<Integer> values) {
            addCriterion("succeed not in", values, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedBetween(Integer value1, Integer value2) {
            addCriterion("succeed between", value1, value2, "succeed");
            return (Criteria) this;
        }

        public Criteria andSucceedNotBetween(Integer value1, Integer value2) {
            addCriterion("succeed not between", value1, value2, "succeed");
            return (Criteria) this;
        }

        public Criteria andDefeatedIsNull() {
            addCriterion("defeated is null");
            return (Criteria) this;
        }

        public Criteria andDefeatedIsNotNull() {
            addCriterion("defeated is not null");
            return (Criteria) this;
        }

        public Criteria andDefeatedEqualTo(Integer value) {
            addCriterion("defeated =", value, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedNotEqualTo(Integer value) {
            addCriterion("defeated <>", value, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedGreaterThan(Integer value) {
            addCriterion("defeated >", value, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("defeated >=", value, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedLessThan(Integer value) {
            addCriterion("defeated <", value, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedLessThanOrEqualTo(Integer value) {
            addCriterion("defeated <=", value, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedIn(List<Integer> values) {
            addCriterion("defeated in", values, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedNotIn(List<Integer> values) {
            addCriterion("defeated not in", values, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedBetween(Integer value1, Integer value2) {
            addCriterion("defeated between", value1, value2, "defeated");
            return (Criteria) this;
        }

        public Criteria andDefeatedNotBetween(Integer value1, Integer value2) {
            addCriterion("defeated not between", value1, value2, "defeated");
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