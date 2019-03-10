/**
 * 
 */
package design_mode.com.gupao.chapter2_singleton;

/**
 * @author zengfang
 * @Date 2019年3月10日
 * @version 1.0.0
 * 
 */
public enum EnumSingleton {
	INSTANCE;
	public static EnumSingleton getInstance() {
		return EnumSingleton.INSTANCE;
	}
}
