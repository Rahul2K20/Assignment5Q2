package com.main;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Embeddable;
import org.hibernate.Hibernate;

@Entity
@Table(name = "order_detail")

@Embeddable
public class order_detail {
	 @Column(name = "product_id", nullable = false)
	    private Integer productId;

	    @Column(name = "order_id", nullable = false)
	    private Integer orderId;
	    

	    public Integer getProductId() {
	        return productId;
	    }

	    public void setProductId(Integer productId) {
	        this.productId = productId;
	    }

	    public Integer getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(Integer orderId) {
	        this.orderId = orderId;
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || Hibernate.getClass(this) != Hibernate.getClass(obj)) return false;
	        order_detail entity = (order_detail) obj;
	        return Objects.equals(this.productId, entity.productId) &&
	                Objects.equals(this.orderId, entity.orderId);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(productId, orderId);
	    }

}