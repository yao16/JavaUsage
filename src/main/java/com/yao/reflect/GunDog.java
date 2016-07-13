package com.yao.reflect;

public class GunDog implements Dog {

	@Override
	public void run() {
		System.out.println("我是一只猎狗，我在跑");

	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("我是一只猎狗，汪汪汪");
	}

}
