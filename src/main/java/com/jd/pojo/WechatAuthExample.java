package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public WechatAuthExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andWechatAuthIdIsNull() {
            addCriterion("wechat_auth_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdIsNotNull() {
            addCriterion("wechat_auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdEqualTo(Integer value) {
            addCriterion("wechat_auth_id =", value, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdNotEqualTo(Integer value) {
            addCriterion("wechat_auth_id <>", value, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdGreaterThan(Integer value) {
            addCriterion("wechat_auth_id >", value, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_auth_id >=", value, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdLessThan(Integer value) {
            addCriterion("wechat_auth_id <", value, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_auth_id <=", value, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdIn(List<Integer> values) {
            addCriterion("wechat_auth_id in", values, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdNotIn(List<Integer> values) {
            addCriterion("wechat_auth_id not in", values, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdBetween(Integer value1, Integer value2) {
            addCriterion("wechat_auth_id between", value1, value2, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andWechatAuthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_auth_id not between", value1, value2, "wechatAuthId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNull() {
            addCriterion("userinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("userinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Integer value) {
            addCriterion("userinfo_id =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Integer value) {
            addCriterion("userinfo_id <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Integer value) {
            addCriterion("userinfo_id >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Integer value) {
            addCriterion("userinfo_id <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Integer> values) {
            addCriterion("userinfo_id in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Integer> values) {
            addCriterion("userinfo_id not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id not between", value1, value2, "userinfoId");
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
    }

    /**
     */
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