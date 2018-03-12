package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ProductCategory implements Serializable {
    private Integer productCategoryId;

    private String produceCategoryName;

    private Integer priority;

    private Date createTime;

    private Integer shopId;

    private static final long serialVersionUID = 1L;

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProduceCategoryName() {
        return produceCategoryName;
    }

    public void setProduceCategoryName(String produceCategoryName) {
        this.produceCategoryName = produceCategoryName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductCategory other = (ProductCategory) that;
        return (this.getProductCategoryId() == null ? other.getProductCategoryId() == null : this.getProductCategoryId().equals(other.getProductCategoryId()))
            && (this.getProduceCategoryName() == null ? other.getProduceCategoryName() == null : this.getProduceCategoryName().equals(other.getProduceCategoryName()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductCategoryId() == null) ? 0 : getProductCategoryId().hashCode());
        result = prime * result + ((getProduceCategoryName() == null) ? 0 : getProduceCategoryName().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", produceCategoryName=").append(produceCategoryName);
        sb.append(", priority=").append(priority);
        sb.append(", createTime=").append(createTime);
        sb.append(", shopId=").append(shopId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}