package com.lxm.test.aop;

@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test() {

	}



}
