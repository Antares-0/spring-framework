package com.lxm.test.bean;

public abstract class GetBeanTest {
	public void printInfo() {
		this.getBean().printInfo();
	}

	public abstract User getBean();
}
