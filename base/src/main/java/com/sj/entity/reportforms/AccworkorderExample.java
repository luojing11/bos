package com.sj.entity.reportforms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccworkorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccworkorderExample() {
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

        public Criteria andBusinessnoticenoIsNull() {
            addCriterion("BusinessNoticeNo is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoIsNotNull() {
            addCriterion("BusinessNoticeNo is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoEqualTo(String value) {
            addCriterion("BusinessNoticeNo =", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotEqualTo(String value) {
            addCriterion("BusinessNoticeNo <>", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoGreaterThan(String value) {
            addCriterion("BusinessNoticeNo >", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessNoticeNo >=", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoLessThan(String value) {
            addCriterion("BusinessNoticeNo <", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoLessThanOrEqualTo(String value) {
            addCriterion("BusinessNoticeNo <=", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoLike(String value) {
            addCriterion("BusinessNoticeNo like", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotLike(String value) {
            addCriterion("BusinessNoticeNo not like", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoIn(List<String> values) {
            addCriterion("BusinessNoticeNo in", values, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotIn(List<String> values) {
            addCriterion("BusinessNoticeNo not in", values, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoBetween(String value1, String value2) {
            addCriterion("BusinessNoticeNo between", value1, value2, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotBetween(String value1, String value2) {
            addCriterion("BusinessNoticeNo not between", value1, value2, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andCustomnoIsNull() {
            addCriterion("CustomNo is null");
            return (Criteria) this;
        }

        public Criteria andCustomnoIsNotNull() {
            addCriterion("CustomNo is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnoEqualTo(String value) {
            addCriterion("CustomNo =", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotEqualTo(String value) {
            addCriterion("CustomNo <>", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoGreaterThan(String value) {
            addCriterion("CustomNo >", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoGreaterThanOrEqualTo(String value) {
            addCriterion("CustomNo >=", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoLessThan(String value) {
            addCriterion("CustomNo <", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoLessThanOrEqualTo(String value) {
            addCriterion("CustomNo <=", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoLike(String value) {
            addCriterion("CustomNo like", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotLike(String value) {
            addCriterion("CustomNo not like", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoIn(List<String> values) {
            addCriterion("CustomNo in", values, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotIn(List<String> values) {
            addCriterion("CustomNo not in", values, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoBetween(String value1, String value2) {
            addCriterion("CustomNo between", value1, value2, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotBetween(String value1, String value2) {
            addCriterion("CustomNo not between", value1, value2, "customno");
            return (Criteria) this;
        }

        public Criteria andJobnoIsNull() {
            addCriterion("JobNo is null");
            return (Criteria) this;
        }

        public Criteria andJobnoIsNotNull() {
            addCriterion("JobNo is not null");
            return (Criteria) this;
        }

        public Criteria andJobnoEqualTo(String value) {
            addCriterion("JobNo =", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotEqualTo(String value) {
            addCriterion("JobNo <>", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThan(String value) {
            addCriterion("JobNo >", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThanOrEqualTo(String value) {
            addCriterion("JobNo >=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThan(String value) {
            addCriterion("JobNo <", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThanOrEqualTo(String value) {
            addCriterion("JobNo <=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLike(String value) {
            addCriterion("JobNo like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotLike(String value) {
            addCriterion("JobNo not like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoIn(List<String> values) {
            addCriterion("JobNo in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotIn(List<String> values) {
            addCriterion("JobNo not in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoBetween(String value1, String value2) {
            addCriterion("JobNo between", value1, value2, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotBetween(String value1, String value2) {
            addCriterion("JobNo not between", value1, value2, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("JobType is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("JobType is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(Integer value) {
            addCriterion("JobType =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(Integer value) {
            addCriterion("JobType <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(Integer value) {
            addCriterion("JobType >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobType >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(Integer value) {
            addCriterion("JobType <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(Integer value) {
            addCriterion("JobType <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<Integer> values) {
            addCriterion("JobType in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<Integer> values) {
            addCriterion("JobType not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(Integer value1, Integer value2) {
            addCriterion("JobType between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("JobType not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andPickupstatusIsNull() {
            addCriterion("PickupStatus is null");
            return (Criteria) this;
        }

        public Criteria andPickupstatusIsNotNull() {
            addCriterion("PickupStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPickupstatusEqualTo(Integer value) {
            addCriterion("PickupStatus =", value, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusNotEqualTo(Integer value) {
            addCriterion("PickupStatus <>", value, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusGreaterThan(Integer value) {
            addCriterion("PickupStatus >", value, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PickupStatus >=", value, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusLessThan(Integer value) {
            addCriterion("PickupStatus <", value, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusLessThanOrEqualTo(Integer value) {
            addCriterion("PickupStatus <=", value, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusIn(List<Integer> values) {
            addCriterion("PickupStatus in", values, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusNotIn(List<Integer> values) {
            addCriterion("PickupStatus not in", values, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusBetween(Integer value1, Integer value2) {
            addCriterion("PickupStatus between", value1, value2, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andPickupstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PickupStatus not between", value1, value2, "pickupstatus");
            return (Criteria) this;
        }

        public Criteria andShortmessageintIsNull() {
            addCriterion("ShortMessageInt is null");
            return (Criteria) this;
        }

        public Criteria andShortmessageintIsNotNull() {
            addCriterion("ShortMessageInt is not null");
            return (Criteria) this;
        }

        public Criteria andShortmessageintEqualTo(Integer value) {
            addCriterion("ShortMessageInt =", value, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintNotEqualTo(Integer value) {
            addCriterion("ShortMessageInt <>", value, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintGreaterThan(Integer value) {
            addCriterion("ShortMessageInt >", value, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShortMessageInt >=", value, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintLessThan(Integer value) {
            addCriterion("ShortMessageInt <", value, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintLessThanOrEqualTo(Integer value) {
            addCriterion("ShortMessageInt <=", value, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintIn(List<Integer> values) {
            addCriterion("ShortMessageInt in", values, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintNotIn(List<Integer> values) {
            addCriterion("ShortMessageInt not in", values, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintBetween(Integer value1, Integer value2) {
            addCriterion("ShortMessageInt between", value1, value2, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andShortmessageintNotBetween(Integer value1, Integer value2) {
            addCriterion("ShortMessageInt not between", value1, value2, "shortmessageint");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeIsNull() {
            addCriterion("WorkGenerationTime is null");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeIsNotNull() {
            addCriterion("WorkGenerationTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeEqualTo(Date value) {
            addCriterion("WorkGenerationTime =", value, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeNotEqualTo(Date value) {
            addCriterion("WorkGenerationTime <>", value, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeGreaterThan(Date value) {
            addCriterion("WorkGenerationTime >", value, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WorkGenerationTime >=", value, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeLessThan(Date value) {
            addCriterion("WorkGenerationTime <", value, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeLessThanOrEqualTo(Date value) {
            addCriterion("WorkGenerationTime <=", value, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeIn(List<Date> values) {
            addCriterion("WorkGenerationTime in", values, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeNotIn(List<Date> values) {
            addCriterion("WorkGenerationTime not in", values, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeBetween(Date value1, Date value2) {
            addCriterion("WorkGenerationTime between", value1, value2, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andWorkgenerationtimeNotBetween(Date value1, Date value2) {
            addCriterion("WorkGenerationTime not between", value1, value2, "workgenerationtime");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumIsNull() {
            addCriterion("AfterSingleNum is null");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumIsNotNull() {
            addCriterion("AfterSingleNum is not null");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumEqualTo(Integer value) {
            addCriterion("AfterSingleNum =", value, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumNotEqualTo(Integer value) {
            addCriterion("AfterSingleNum <>", value, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumGreaterThan(Integer value) {
            addCriterion("AfterSingleNum >", value, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("AfterSingleNum >=", value, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumLessThan(Integer value) {
            addCriterion("AfterSingleNum <", value, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumLessThanOrEqualTo(Integer value) {
            addCriterion("AfterSingleNum <=", value, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumIn(List<Integer> values) {
            addCriterion("AfterSingleNum in", values, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumNotIn(List<Integer> values) {
            addCriterion("AfterSingleNum not in", values, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumBetween(Integer value1, Integer value2) {
            addCriterion("AfterSingleNum between", value1, value2, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andAftersinglenumNotBetween(Integer value1, Integer value2) {
            addCriterion("AfterSingleNum not between", value1, value2, "aftersinglenum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumIsNull() {
            addCriterion("SmallMemberNum is null");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumIsNotNull() {
            addCriterion("SmallMemberNum is not null");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumEqualTo(Integer value) {
            addCriterion("SmallMemberNum =", value, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumNotEqualTo(Integer value) {
            addCriterion("SmallMemberNum <>", value, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumGreaterThan(Integer value) {
            addCriterion("SmallMemberNum >", value, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SmallMemberNum >=", value, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumLessThan(Integer value) {
            addCriterion("SmallMemberNum <", value, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumLessThanOrEqualTo(Integer value) {
            addCriterion("SmallMemberNum <=", value, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumIn(List<Integer> values) {
            addCriterion("SmallMemberNum in", values, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumNotIn(List<Integer> values) {
            addCriterion("SmallMemberNum not in", values, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumBetween(Integer value1, Integer value2) {
            addCriterion("SmallMemberNum between", value1, value2, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andSmallmembernumNotBetween(Integer value1, Integer value2) {
            addCriterion("SmallMemberNum not between", value1, value2, "smallmembernum");
            return (Criteria) this;
        }

        public Criteria andPickupunitIsNull() {
            addCriterion("PickupUnit is null");
            return (Criteria) this;
        }

        public Criteria andPickupunitIsNotNull() {
            addCriterion("PickupUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPickupunitEqualTo(Integer value) {
            addCriterion("PickupUnit =", value, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitNotEqualTo(Integer value) {
            addCriterion("PickupUnit <>", value, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitGreaterThan(Integer value) {
            addCriterion("PickupUnit >", value, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("PickupUnit >=", value, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitLessThan(Integer value) {
            addCriterion("PickupUnit <", value, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitLessThanOrEqualTo(Integer value) {
            addCriterion("PickupUnit <=", value, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitIn(List<Integer> values) {
            addCriterion("PickupUnit in", values, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitNotIn(List<Integer> values) {
            addCriterion("PickupUnit not in", values, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitBetween(Integer value1, Integer value2) {
            addCriterion("PickupUnit between", value1, value2, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickupunitNotBetween(Integer value1, Integer value2) {
            addCriterion("PickupUnit not between", value1, value2, "pickupunit");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIsNull() {
            addCriterion("PickupTime is null");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIsNotNull() {
            addCriterion("PickupTime is not null");
            return (Criteria) this;
        }

        public Criteria andPickuptimeEqualTo(Date value) {
            addCriterion("PickupTime =", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotEqualTo(Date value) {
            addCriterion("PickupTime <>", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeGreaterThan(Date value) {
            addCriterion("PickupTime >", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PickupTime >=", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLessThan(Date value) {
            addCriterion("PickupTime <", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLessThanOrEqualTo(Date value) {
            addCriterion("PickupTime <=", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIn(List<Date> values) {
            addCriterion("PickupTime in", values, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotIn(List<Date> values) {
            addCriterion("PickupTime not in", values, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeBetween(Date value1, Date value2) {
            addCriterion("PickupTime between", value1, value2, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotBetween(Date value1, Date value2) {
            addCriterion("PickupTime not between", value1, value2, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andSortingcodeIsNull() {
            addCriterion("SortingCode is null");
            return (Criteria) this;
        }

        public Criteria andSortingcodeIsNotNull() {
            addCriterion("SortingCode is not null");
            return (Criteria) this;
        }

        public Criteria andSortingcodeEqualTo(String value) {
            addCriterion("SortingCode =", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotEqualTo(String value) {
            addCriterion("SortingCode <>", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeGreaterThan(String value) {
            addCriterion("SortingCode >", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SortingCode >=", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeLessThan(String value) {
            addCriterion("SortingCode <", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeLessThanOrEqualTo(String value) {
            addCriterion("SortingCode <=", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeLike(String value) {
            addCriterion("SortingCode like", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotLike(String value) {
            addCriterion("SortingCode not like", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeIn(List<String> values) {
            addCriterion("SortingCode in", values, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotIn(List<String> values) {
            addCriterion("SortingCode not in", values, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeBetween(String value1, String value2) {
            addCriterion("SortingCode between", value1, value2, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotBetween(String value1, String value2) {
            addCriterion("SortingCode not between", value1, value2, "sortingcode");
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