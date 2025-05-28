/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lxm.test;

import com.lxm.test.bean.GetBeanTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Main {

	public static void main(String[] args) {
		// test 1 检查程序是否可以运行
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		// Person person = context.getBean(Person.class);
		// System.out.println(person);
		// test 2 测试look-up标签
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		GetBeanTest getBeanTest = (GetBeanTest) context.getBean("getBeanTest");
		getBeanTest.printInfo();
	}
}
