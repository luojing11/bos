package com.sj.entity.logistics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BiglogLogisticscontroltableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiglogLogisticscontroltableExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoIsNull() {
            addCriterion("WorkSheetNo is null");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoIsNotNull() {
            addCriterion("WorkSheetNo is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoEqualTo(String value) {
            addCriterion("WorkSheetNo =", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotEqualTo(String value) {
            addCriterion("WorkSheetNo <>", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoGreaterThan(String value) {
            addCriterion("WorkSheetNo >", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoGreaterThanOrEqualTo(String value) {
            addCriterion("WorkSheetNo >=", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoLessThan(String value) {
            addCriterion("WorkSheetNo <", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoLessThanOrEqualTo(String value) {
            addCriterion("WorkSheetNo <=", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoLike(String value) {
            addCriterion("WorkSheetNo like", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotLike(String value) {
            addCriterion("WorkSheetNo not like", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoIn(List<String> values) {
            addCriterion("WorkSheetNo in", values, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotIn(List<String> values) {
            addCriterion("WorkSheetNo not in", values, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoBetween(String value1, String value2) {
            addCriterion("WorkSheetNo between", value1, value2, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotBetween(String value1, String value2) {
            addCriterion("WorkSheetNo not between", value1, value2, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("CType is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("CType is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(Integer value) {
            addCriterion("CType =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(Integer value) {
            addCriterion("CType <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(Integer value) {
            addCriterion("CType >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CType >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(Integer value) {
            addCriterion("CType <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(Integer value) {
            addCriterion("CType <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<Integer> values) {
            addCriterion("CType in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<Integer> values) {
            addCriterion("CType not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(Integer value1, Integer value2) {
            addCriterion("CType between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CType not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNull() {
            addCriterion("Corporation is null");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNotNull() {
            addCriterion("Corporation is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationEqualTo(String value) {
            addCriterion("Corporation =", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotEqualTo(String value) {
            addCriterion("Corporation <>", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThan(String value) {
            addCriterion("Corporation >", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThanOrEqualTo(String value) {
            addCriterion("Corporation >=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThan(String value) {
            addCriterion("Corporation <", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThanOrEqualTo(String value) {
            addCriterion("Corporation <=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLike(String value) {
            addCriterion("Corporation like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotLike(String value) {
            addCriterion("Corporation not like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationIn(List<String> values) {
            addCriterion("Corporation in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotIn(List<String> values) {
            addCriterion("Corporation not in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationBetween(String value1, String value2) {
            addCriterion("Corporation between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotBetween(String value1, String value2) {
            addCriterion("Corporation not between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andWaybillidIsNull() {
            addCriterion("WaybillID is null");
            return (Criteria) this;
        }

        public Criteria andWaybillidIsNotNull() {
            addCriterion("WaybillID is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillidEqualTo(String value) {
            addCriterion("WaybillID =", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotEqualTo(String value) {
            addCriterion("WaybillID <>", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidGreaterThan(String value) {
            addCriterion("WaybillID >", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidGreaterThanOrEqualTo(String value) {
            addCriterion("WaybillID >=", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidLessThan(String value) {
            addCriterion("WaybillID <", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidLessThanOrEqualTo(String value) {
            addCriterion("WaybillID <=", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidLike(String value) {
            addCriterion("WaybillID like", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotLike(String value) {
            addCriterion("WaybillID not like", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidIn(List<String> values) {
            addCriterion("WaybillID in", values, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotIn(List<String> values) {
            addCriterion("WaybillID not in", values, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidBetween(String value1, String value2) {
            addCriterion("WaybillID between", value1, value2, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotBetween(String value1, String value2) {
            addCriterion("WaybillID not between", value1, value2, "waybillid");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andInputpersonIsNull() {
            addCriterion("InputPerson is null");
            return (Criteria) this;
        }

        public Criteria andInputpersonIsNotNull() {
            addCriterion("InputPerson is not null");
            return (Criteria) this;
        }

        public Criteria andInputpersonEqualTo(Integer value) {
            addCriterion("InputPerson =", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonNotEqualTo(Integer value) {
            addCriterion("InputPerson <>", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonGreaterThan(Integer value) {
            addCriterion("InputPerson >", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("InputPerson >=", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonLessThan(Integer value) {
            addCriterion("InputPerson <", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonLessThanOrEqualTo(Integer value) {
            addCriterion("InputPerson <=", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonIn(List<Integer> values) {
            addCriterion("InputPerson in", values, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonNotIn(List<Integer> values) {
            addCriterion("InputPerson not in", values, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonBetween(Integer value1, Integer value2) {
            addCriterion("InputPerson between", value1, value2, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("InputPerson not between", value1, value2, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("InputDate is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("InputDate is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("InputDate =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("InputDate <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("InputDate >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("InputDate >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("InputDate <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("InputDate <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("InputDate in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("InputDate not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("InputDate between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("InputDate not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputcompanyIsNull() {
            addCriterion("InputCompany is null");
            return (Criteria) this;
        }

        public Criteria andInputcompanyIsNotNull() {
            addCriterion("InputCompany is not null");
            return (Criteria) this;
        }

        public Criteria andInputcompanyEqualTo(Integer value) {
            addCriterion("InputCompany =", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyNotEqualTo(Integer value) {
            addCriterion("InputCompany <>", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyGreaterThan(Integer value) {
            addCriterion("InputCompany >", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("InputCompany >=", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyLessThan(Integer value) {
            addCriterion("InputCompany <", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyLessThanOrEqualTo(Integer value) {
            addCriterion("InputCompany <=", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyIn(List<Integer> values) {
            addCriterion("InputCompany in", values, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyNotIn(List<Integer> values) {
            addCriterion("InputCompany not in", values, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyBetween(Integer value1, Integer value2) {
            addCriterion("InputCompany between", value1, value2, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("InputCompany not between", value1, value2, "inputcompany");
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