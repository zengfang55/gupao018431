/**
 * 
 */
package design_mode.com.gupao.chapter2_singleton;

/**
 * @author zengfang
 * @Date 2019年3月10日
 * @version 1.0.0
 * 每一个线程调用此单例，获取到的是同一个单例。
 * 将单例对象保存在ThreadLocal中
 */
public class ThreadLocalSingleton {
	
	private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>() {
		/**
		 * @see java.lang.ThreadLocal#initialValue()
		 */
		@Override
		protected ThreadLocalSingleton initialValue() {
			return new ThreadLocalSingleton();
		}
	};
	
	private ThreadLocalSingleton() {
	}
	
	public static ThreadLocalSingleton getInstance() {
		return threadLocal.get();
	}
}
