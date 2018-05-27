package com.kingguanzhang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCategoryExample() {
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

        public Criteria andShopCategoryIdIsNull() {
            addCriterion("shop_category_id is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIsNotNull() {
            addCriterion("shop_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdEqualTo(Integer value) {
            addCriterion("shop_category_id =", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotEqualTo(Integer value) {
            addCriterion("shop_category_id <>", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThan(Integer value) {
            addCriterion("shop_category_id >", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_category_id >=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThan(Integer value) {
            addCriterion("shop_category_id <", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_category_id <=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIn(List<Integer> values) {
            addCriterion("shop_category_id in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotIn(List<Integer> values) {
            addCriterion("shop_category_id not in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_id between", value1, value2, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_id not between", value1, value2, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIsNull() {
            addCriterion("shop_category_name is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIsNotNull() {
            addCriterion("shop_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameEqualTo(String value) {
            addCriterion("shop_category_name =", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotEqualTo(String value) {
            addCriterion("shop_category_name <>", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameGreaterThan(String value) {
            addCriterion("shop_category_name >", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_category_name >=", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLessThan(String value) {
            addCriterion("shop_category_name <", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("shop_category_name <=", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLike(String value) {
            addCriterion("shop_category_name like", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotLike(String value) {
            addCriterion("shop_category_name not like", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIn(List<String> values) {
            addCriterion("shop_category_name in", values, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotIn(List<String> values) {
            addCriterion("shop_category_name not in", values, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameBetween(String value1, String value2) {
            addCriterion("shop_category_name between", value1, value2, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotBetween(String value1, String value2) {
            addCriterion("shop_category_name not between", value1, value2, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescIsNull() {
            addCriterion("shop_category_desc is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescIsNotNull() {
            addCriterion("shop_category_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescEqualTo(String value) {
            addCriterion("shop_category_desc =", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescNotEqualTo(String value) {
            addCriterion("shop_category_desc <>", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescGreaterThan(String value) {
            addCriterion("shop_category_desc >", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescGreaterThanOrEqualTo(String value) {
            addCriterion("shop_category_desc >=", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescLessThan(String value) {
            addCriterion("shop_category_desc <", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescLessThanOrEqualTo(String value) {
            addCriterion("shop_category_desc <=", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescLike(String value) {
            addCriterion("shop_category_desc like", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescNotLike(String value) {
            addCriterion("shop_category_desc not like", value, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescIn(List<String> values) {
            addCriterion("shop_category_desc in", values, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescNotIn(List<String> values) {
            addCriterion("shop_category_desc not in", values, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescBetween(String value1, String value2) {
            addCriterion("shop_category_desc between", value1, value2, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryDescNotBetween(String value1, String value2) {
            addCriterion("shop_category_desc not between", value1, value2, "shopCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgIsNull() {
            addCriterion("shop_category_img is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgIsNotNull() {
            addCriterion("shop_category_img is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgEqualTo(String value) {
            addCriterion("shop_category_img =", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgNotEqualTo(String value) {
            addCriterion("shop_category_img <>", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgGreaterThan(String value) {
            addCriterion("shop_category_img >", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgGreaterThanOrEqualTo(String value) {
            addCriterion("shop_category_img >=", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgLessThan(String value) {
            addCriterion("shop_category_img <", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgLessThanOrEqualTo(String value) {
            addCriterion("shop_category_img <=", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgLike(String value) {
            addCriterion("shop_category_img like", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgNotLike(String value) {
            addCriterion("shop_category_img not like", value, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgIn(List<String> values) {
            addCriterion("shop_category_img in", values, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgNotIn(List<String> values) {
            addCriterion("shop_category_img not in", values, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgBetween(String value1, String value2) {
            addCriterion("shop_category_img between", value1, value2, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andShopCategoryImgNotBetween(String value1, String value2) {
            addCriterion("shop_category_img not between", value1, value2, "shopCategoryImg");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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