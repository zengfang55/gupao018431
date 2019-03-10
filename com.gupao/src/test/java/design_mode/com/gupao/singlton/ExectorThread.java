package design_mode.com.gupao.singlton;

import design_mode.com.gupao.chapter2_singleton.DclCheckSingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{

	/**
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":"+DclCheckSingleton.getInstance() );
	}
}
