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
public interface IproductFactory {
	Iproduct createProduct(Class<? extends Iproduct> clazz);
}
