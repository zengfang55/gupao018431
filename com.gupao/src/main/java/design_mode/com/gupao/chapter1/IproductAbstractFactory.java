/**
 * 
 */
package design_mode.com.gupao.chapter1;

/**
 * @author zengfang
 * @Date 2019年3月9日
 * @version 1.0.0
 * 
 */
public interface IproductAbstractFactory {
	/**生成T0货币基金
	 * 
	 * @return
	 */
	Iproduct createT0Product();
	/**生成黄金理财
	 * 
	 * @return
	 */
	Iproduct createETFProduct();
}
