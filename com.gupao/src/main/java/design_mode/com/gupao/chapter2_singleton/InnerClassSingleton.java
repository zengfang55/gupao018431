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
public class InnerClassSingleton {
	static {
		System.out.println("类加载静态");
	}
	public static Object data = new EchoDemo();
	private InnerClassSingleton() {
		if(LazyHolder.HOLDER != null) {
			throw new RuntimeException("无法创建多个实例！");
		}
	}
	
	public static InnerClassSingleton getInstance() {
		return LazyHolder.HOLDER;
	}
	static class LazyHolder{
		private static InnerClassSingleton HOLDER = new InnerClassSingleton();
		public static EchoDemo demo = new EchoDemo();
		static {
			System.out.println("执行LazyHolder的静态代码块");
		}
	}
}
