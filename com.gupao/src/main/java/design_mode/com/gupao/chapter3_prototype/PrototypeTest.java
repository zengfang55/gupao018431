/**
 * 
 */
package design_mode.com.gupao.chapter3_prototype;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

/**
 * @author zengfang
 * @Date 2019年3月11日
 * @version 1.0.0
 * 
 */
public class PrototypeTest {
	public static void main(String[] args) throws Exception {
		//克隆目标对像
		OrderDto orderDto = new OrderDto();
		//head报文
		HashMap<String, Object> head = new HashMap<String,Object>();
		head.put("userId", "12345");
		head.put("session","trustMe");
		//body报文
		HashMap<String, Object> body = new HashMap<String,Object>();
		body.put("orderId", "PM12314");
		body.put("price",new BigDecimal(2.0));
		body.put("createTime", new Date().getTime());
		body.put("vip", true);
		PrototypeMessage prototypeMessage = new PrototypeMessage(orderDto);
		prototypeMessage.setBody(body);
		prototypeMessage.setHead(head);
		//调用克隆方法
		prototypeMessage.clone();
		System.out.println(orderDto);
		//OrderDto [isVip=true, orderId=PM12314, price=2, createTime=1552300651475, userId=12345]
	}
}
