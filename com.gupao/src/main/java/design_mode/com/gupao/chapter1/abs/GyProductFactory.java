/**
 * 
 */
package design_mode.com.gupao.chapter1.abs;

import design_mode.com.gupao.chapter1.BoseraT0Product;
import design_mode.com.gupao.chapter1.GyETFProduct;
import design_mode.com.gupao.chapter1.GyT0Product;
import design_mode.com.gupao.chapter1.Iproduct;
import design_mode.com.gupao.chapter1.IproductAbstractFactory;

/**
 * @author zengfang
 * @Date 2019年3月9日
 * @version 1.0.0
 * 
 */
public class GyProductFactory implements IproductAbstractFactory{

	/**
	 * @see design_mode.com.gupao.chapter1.IproductAbstractFactory#createT0Product()
	 */
	public Iproduct createT0Product() {
		// TODO Auto-generated method stub
		return new GyT0Product();
	}

	/**
	 * @see design_mode.com.gupao.chapter1.IproductAbstractFactory#createETFProduct()
	 */
	public Iproduct createETFProduct() {
		// TODO Auto-generated method stub
		return new GyETFProduct();
	}


}
