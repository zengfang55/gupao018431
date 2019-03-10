/**
 * 
 */
package design_mode.com.gupao.chapter2_singleton;

import java.io.Serializable;

/**
 * @author zengfang
 * @Date 2019年3月10日
 * @version 1.0.0
 * 
 */
public class DclCheckSingleton implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile DclCheckSingleton instance = null;
	/**
	 * 防止反射
	 */
	private DclCheckSingleton() {
		if(instance != null) {
			throw new RuntimeException("无法创建多个实例！");
		}
	}
	
	public static DclCheckSingleton getInstance() {
		if(instance == null ) {
			synchronized (DclCheckSingleton.class) {
				if(instance == null) {
					instance = new DclCheckSingleton();
				}
			}
		}
		return instance;
	}
	//防止序列化改变对象
	public Object readResolve() {
		return instance;
	}
}
