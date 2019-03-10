/**
 * 
 */
package design_mode.com.gupao.chapter2_singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zengfang
 * @Date 2019年3月10日
 * @version 1.0.0
 * Spring中的做法，就是用这种注册式单例
 */
public class ContainerSingleton {
	private ContainerSingleton() {}
	private static Map<String,Object> iocMap = new ConcurrentHashMap<String,Object>();
	
	public static Object getBean(String className){
		synchronized (iocMap) {
			if(!iocMap.containsKey(className)) {
				Object obj = null;
				try {
					obj = Class.forName(className);
					iocMap.put(className, obj);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				return obj;
			}else {
				return iocMap.get(className);
			}
			
		}
	}
	
}
