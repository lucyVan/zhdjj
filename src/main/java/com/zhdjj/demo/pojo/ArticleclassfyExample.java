package com.zhdjj.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleclassfyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public ArticleclassfyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articleclassfy
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table articleclassfy
     *
     * @mbggenerated
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

        public Criteria andArticleClassfyIdIsNull() {
            addCriterion("article_classfy_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdIsNotNull() {
            addCriterion("article_classfy_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdEqualTo(Integer value) {
            addCriterion("article_classfy_id =", value, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdNotEqualTo(Integer value) {
            addCriterion("article_classfy_id <>", value, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdGreaterThan(Integer value) {
            addCriterion("article_classfy_id >", value, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_classfy_id >=", value, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdLessThan(Integer value) {
            addCriterion("article_classfy_id <", value, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_classfy_id <=", value, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdIn(List<Integer> values) {
            addCriterion("article_classfy_id in", values, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdNotIn(List<Integer> values) {
            addCriterion("article_classfy_id not in", values, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdBetween(Integer value1, Integer value2) {
            addCriterion("article_classfy_id between", value1, value2, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_classfy_id not between", value1, value2, "articleClassfyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameIsNull() {
            addCriterion("article_classfy_name is null");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameIsNotNull() {
            addCriterion("article_classfy_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameEqualTo(String value) {
            addCriterion("article_classfy_name =", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameNotEqualTo(String value) {
            addCriterion("article_classfy_name <>", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameGreaterThan(String value) {
            addCriterion("article_classfy_name >", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameGreaterThanOrEqualTo(String value) {
            addCriterion("article_classfy_name >=", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameLessThan(String value) {
            addCriterion("article_classfy_name <", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameLessThanOrEqualTo(String value) {
            addCriterion("article_classfy_name <=", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameLike(String value) {
            addCriterion("article_classfy_name like", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameNotLike(String value) {
            addCriterion("article_classfy_name not like", value, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameIn(List<String> values) {
            addCriterion("article_classfy_name in", values, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameNotIn(List<String> values) {
            addCriterion("article_classfy_name not in", values, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameBetween(String value1, String value2) {
            addCriterion("article_classfy_name between", value1, value2, "articleClassfyName");
            return (Criteria) this;
        }

        public Criteria andArticleClassfyNameNotBetween(String value1, String value2) {
            addCriterion("article_classfy_name not between", value1, value2, "articleClassfyName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table articleclassfy
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table articleclassfy
     *
     * @mbggenerated
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