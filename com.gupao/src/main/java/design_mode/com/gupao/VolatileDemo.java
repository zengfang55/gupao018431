/**
 * 
 */
package design_mode.com.gupao;

/**
 * @author zengfang
 * @version 1.0.0
 * 
 */
public class VolatileDemo {
	volatile long vi = 0;
	public void set(int a) {
		vi = a;
	}
	public long get() {
		return vi;
	}
	public void getAndIncrement() {
		vi++;
	}
}
