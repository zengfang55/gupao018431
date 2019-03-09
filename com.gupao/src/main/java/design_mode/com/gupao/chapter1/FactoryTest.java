/**
 * 
 */
package design_mode.com.gupao.chapter1;

import design_mode.com.gupao.chapter1.abs.BoseraProductFactory;
import design_mode.com.gupao.chapter1.abs.GyProductFactory;
import design_mode.com.gupao.chapter1.method.BoseraT0ProductFactory;
import design_mode.com.gupao.chapter1.method.GyT0ProductFactory;
import design_mode.com.gupao.chapter1.simple.SimpleFactory;

/**
 * @author zengfang
 * @Date 2019年3月9日
 * @version 1.0.0
 * 
 */
public class FactoryTest {
	public static void main(String[] args) {
		//1.简单工厂模式
		SimpleFactory factory = new SimpleFactory();
		Iproduct product = factory.createProduct(GyT0Product.class);
		System.err.println(product.getClass().getName());//design_mode.com.gupao.chapter1.GyT0Product
		//2.工厂方法模式 创建不同的工厂获取不同的产品。不需要传产品的类对象。
		GyT0ProductFactory gyT0ProductFactory = new GyT0ProductFactory();
		BoseraT0ProductFactory boseraT0ProductFactory = new BoseraT0ProductFactory();
		Iproduct gyProduct = gyT0ProductFactory.createProduct();
		Iproduct boseraProduct = boseraT0ProductFactory.createProduct();
		System.err.println(gyProduct.getClass().getName());//design_mode.com.gupao.chapter1.GyT0Product
		System.err.println(boseraProduct.getClass().getName());//design_mode.com.gupao.chapter1.BoseraT0Product
		//3.抽象工厂方法模式
		BoseraProductFactory boseraProductFactory = new BoseraProductFactory();
		GyProductFactory gyProductFactory = new GyProductFactory();
		boseraProductFactory.createETFProduct();
		boseraProductFactory.createT0Product();
		gyProductFactory.createETFProduct();
		//一个工厂可以创建几种对象
		
	}
}
