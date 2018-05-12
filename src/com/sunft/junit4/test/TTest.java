package com.sunft.junit4.test;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sunft.junit4.T;

public class TTest {
	
	/**
	 * 该方法只能是静态方法
	 */
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass method");
	}
	
	@Before
	public void before() {
		System.out.println("before method");
	}

	@Test
	public void testAdd() {
		int z = new T().add(5, 3);
		//这里使用的是hamcrest的匹配模式,is等同于Matcers.is
		assertThat(z, is(8));
		//演示allOf的使用
		assertThat(z, allOf(greaterThan(5), lessThan(10)));
		System.out.println("testAdd method");
	}
	
	/**
	 * 运行下面的方法,抛出指定的异常,运行会通过,
	 * 因为这里期望抛异常,期望该方法在100毫秒内结束
	 */
	@Test(expected=java.lang.ArithmeticException.class, timeout=100)
	public void testDivide() {
		System.out.println("testDivide method");
		int z = new T().divide(8, 0);
	}
	
	@After
	public void after() {
		System.out.println("after() method");
	}
	
	/**
	 * 该方法只能是静态方法
	 */
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass method");
	}

}


