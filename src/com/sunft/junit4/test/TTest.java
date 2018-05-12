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
	 * �÷���ֻ���Ǿ�̬����
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
		//����ʹ�õ���hamcrest��ƥ��ģʽ,is��ͬ��Matcers.is
		assertThat(z, is(8));
		//��ʾallOf��ʹ��
		assertThat(z, allOf(greaterThan(5), lessThan(10)));
		System.out.println("testAdd method");
	}
	
	/**
	 * ��������ķ���,�׳�ָ�����쳣,���л�ͨ��,
	 * ��Ϊ�����������쳣,�����÷�����100�����ڽ���
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
	 * �÷���ֻ���Ǿ�̬����
	 */
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass method");
	}

}


