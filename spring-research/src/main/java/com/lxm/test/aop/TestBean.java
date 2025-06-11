package com.lxm.test.aop;

/**
 * 用于测试AOP功能
 */
public class TestBean {

	private String testStr = "str";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {
		System.out.println("test");
	}
}
