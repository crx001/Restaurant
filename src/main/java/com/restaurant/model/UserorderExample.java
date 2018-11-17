package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class UserorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserorderExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOfoodIsNull() {
            addCriterion("ofood is null");
            return (Criteria) this;
        }

        public Criteria andOfoodIsNotNull() {
            addCriterion("ofood is not null");
            return (Criteria) this;
        }

        public Criteria andOfoodEqualTo(String value) {
            addCriterion("ofood =", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodNotEqualTo(String value) {
            addCriterion("ofood <>", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodGreaterThan(String value) {
            addCriterion("ofood >", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodGreaterThanOrEqualTo(String value) {
            addCriterion("ofood >=", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodLessThan(String value) {
            addCriterion("ofood <", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodLessThanOrEqualTo(String value) {
            addCriterion("ofood <=", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodLike(String value) {
            addCriterion("ofood like", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodNotLike(String value) {
            addCriterion("ofood not like", value, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodIn(List<String> values) {
            addCriterion("ofood in", values, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodNotIn(List<String> values) {
            addCriterion("ofood not in", values, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodBetween(String value1, String value2) {
            addCriterion("ofood between", value1, value2, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfoodNotBetween(String value1, String value2) {
            addCriterion("ofood not between", value1, value2, "ofood");
            return (Criteria) this;
        }

        public Criteria andOfidIsNull() {
            addCriterion("ofid is null");
            return (Criteria) this;
        }

        public Criteria andOfidIsNotNull() {
            addCriterion("ofid is not null");
            return (Criteria) this;
        }

        public Criteria andOfidEqualTo(Integer value) {
            addCriterion("ofid =", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotEqualTo(Integer value) {
            addCriterion("ofid <>", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThan(Integer value) {
            addCriterion("ofid >", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ofid >=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThan(Integer value) {
            addCriterion("ofid <", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThanOrEqualTo(Integer value) {
            addCriterion("ofid <=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidIn(List<Integer> values) {
            addCriterion("ofid in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotIn(List<Integer> values) {
            addCriterion("ofid not in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidBetween(Integer value1, Integer value2) {
            addCriterion("ofid between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotBetween(Integer value1, Integer value2) {
            addCriterion("ofid not between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andOnumIsNull() {
            addCriterion("onum is null");
            return (Criteria) this;
        }

        public Criteria andOnumIsNotNull() {
            addCriterion("onum is not null");
            return (Criteria) this;
        }

        public Criteria andOnumEqualTo(Integer value) {
            addCriterion("onum =", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumNotEqualTo(Integer value) {
            addCriterion("onum <>", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumGreaterThan(Integer value) {
            addCriterion("onum >", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("onum >=", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumLessThan(Integer value) {
            addCriterion("onum <", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumLessThanOrEqualTo(Integer value) {
            addCriterion("onum <=", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumIn(List<Integer> values) {
            addCriterion("onum in", values, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumNotIn(List<Integer> values) {
            addCriterion("onum not in", values, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumBetween(Integer value1, Integer value2) {
            addCriterion("onum between", value1, value2, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumNotBetween(Integer value1, Integer value2) {
            addCriterion("onum not between", value1, value2, "onum");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNull() {
            addCriterion("oprice is null");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNotNull() {
            addCriterion("oprice is not null");
            return (Criteria) this;
        }

        public Criteria andOpriceEqualTo(Double value) {
            addCriterion("oprice =", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotEqualTo(Double value) {
            addCriterion("oprice <>", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThan(Double value) {
            addCriterion("oprice >", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("oprice >=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThan(Double value) {
            addCriterion("oprice <", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThanOrEqualTo(Double value) {
            addCriterion("oprice <=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceIn(List<Double> values) {
            addCriterion("oprice in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotIn(List<Double> values) {
            addCriterion("oprice not in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceBetween(Double value1, Double value2) {
            addCriterion("oprice between", value1, value2, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotBetween(Double value1, Double value2) {
            addCriterion("oprice not between", value1, value2, "oprice");
            return (Criteria) this;
        }

        public Criteria andOdateIsNull() {
            addCriterion("odate is null");
            return (Criteria) this;
        }

        public Criteria andOdateIsNotNull() {
            addCriterion("odate is not null");
            return (Criteria) this;
        }

        public Criteria andOdateEqualTo(String value) {
            addCriterion("odate =", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotEqualTo(String value) {
            addCriterion("odate <>", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThan(String value) {
            addCriterion("odate >", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThanOrEqualTo(String value) {
            addCriterion("odate >=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThan(String value) {
            addCriterion("odate <", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThanOrEqualTo(String value) {
            addCriterion("odate <=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLike(String value) {
            addCriterion("odate like", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotLike(String value) {
            addCriterion("odate not like", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateIn(List<String> values) {
            addCriterion("odate in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotIn(List<String> values) {
            addCriterion("odate not in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateBetween(String value1, String value2) {
            addCriterion("odate between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotBetween(String value1, String value2) {
            addCriterion("odate not between", value1, value2, "odate");
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