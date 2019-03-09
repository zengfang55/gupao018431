/**
 * 
 */
package design_mode.com.gupao.chapter1.simple;

import design_mode.com.gupao.chapter1.Iproduct;
import design_mode.com.gupao.chapter1.IproductFactory;

/**
 * @author zengfang
 * @Date 2019年3月9日
 * @version 1.0.0
 * 
 */
public class SimpleFactory implements IproductFactory{

	/**
	 * @see design_mode.com.gupao.chapter1.IproductFactory#createProduct()
	 */
	public Iproduct createProduct(Class<? extends Iproduct> clazz) {
		//clazz对象不为空，且是Iproduct的实现或子类才创建
		if(clazz != null && Iproduct.class.isAssignableFrom(clazz) ) {
			try {
				return (Iproduct) clazz.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
