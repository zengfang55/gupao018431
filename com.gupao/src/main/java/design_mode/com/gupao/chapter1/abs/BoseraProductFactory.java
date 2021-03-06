/**
 * 
 */
package design_mode.com.gupao.chapter1.abs;

import design_mode.com.gupao.chapter1.BoseraETFProduct;
import design_mode.com.gupao.chapter1.BoseraT0Product;
import design_mode.com.gupao.chapter1.Iproduct;
import design_mode.com.gupao.chapter1.IproductAbstractFactory;
import design_mode.com.gupao.chapter1.IproductMethodFactory;

/**
 * @author zengfang
 * @Date 2019年3月9日
 * @version 1.0.0
 * 
 */
public class BoseraProductFactory implements IproductAbstractFactory{

	/**
	 * @see design_mode.com.gupao.chapter1.IproductAbstractFactory#createT0Product()
	 */
	public Iproduct createT0Product() {
		return new BoseraT0Product();
	}

	/**
	 * @see design_mode.com.gupao.chapter1.IproductAbstractFactory#createETFProduct()
	 */
	public Iproduct createETFProduct() {
		return new BoseraETFProduct();
	}


}
