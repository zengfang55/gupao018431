/**
 * 
 */
package design_mode.com.gupao.chapter3_prototype;

import java.math.BigDecimal;

/**
 * @author zengfang
 * @Date 2019年3月11日
 * @version 1.0.0
 * 
 */
public class OrderDto {
	boolean isVip ;
	String orderId;
	BigDecimal price;
	long createTime;
	//head信息
	String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderDto [isVip=" + isVip + ", orderId=" + orderId + ", price=" + price + ", createTime=" + createTime
				+ ", userId=" + userId + "]";
	}
	
}
