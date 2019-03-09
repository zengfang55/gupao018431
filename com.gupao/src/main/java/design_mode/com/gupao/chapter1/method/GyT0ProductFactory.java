/**
 * 
 */
package design_mode.com.gupao.chapter1.method;

import design_mode.com.gupao.chapter1.GyT0Product;
import design_mode.com.gupao.chapter1.Iproduct;
import design_mode.com.gupao.chapter1.IproductMethodFactory;

/**
 * @author zengfang
 * @Date 2019年3月9日
 * @version 1.0.0
 * 
 */
public class GyT0ProductFactory implements IproductMethodFactory{

	/**
	 * @see design_mode.com.gupao.chapter1.IproductFactory#createProduct(java.lang.Class)
	 */
	public Iproduct createProduct() {
		return new GyT0Product();
	}

}
