/**
 * 
 */
package design_mode.com.gupao.chapter3_prototype;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zengfang
 * @Date 2019年3月11日
 * @version 1.0.0
 * 业务改造代码，将前端传来的message，通过原型模式，克隆到Dto数据传输对象
 */
public class PrototypeMessage implements Cloneable{
	Map<String,Object> head = new HashMap<String,Object>();
	
	Map<String,Object> body = new HashMap<String,Object>();
	Object target = null;
	public PrototypeMessage(Object targetObj) {
		this.target =targetObj;
	}

	public Map<String, Object> getHead() {
		return head;
	}

	public void setHead(Map<String, Object> head) {
		this.head = head;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}
	/**
	 * @see java.lang.Object#clone()
	 * BeanUtils JSON
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Class<? extends Object> clazz = this.target.getClass();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if(method.getName().startsWith("set")) {
				String field =  method.getName().substring(3,4).toLowerCase() + method.getName().substring(4, method.getName().length());
				if(head.containsKey(field)) {
					try {
						method.invoke(target, head.get(field));
					} catch  (Exception e) {
						e.printStackTrace();
					}
				}else if (body.containsKey(field)){
					try {
						method.invoke(target, body.get(field));
					} catch  (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return this.target;
	}
}
