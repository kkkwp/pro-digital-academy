package com.example.ioc;

public class Chef {

	public String cook(String menu) {
		
		// 재료 준비
		Chicken chicken = new Chicken("국내산 닭");

		// 뚝딱뚝딱...

		// 결과 반환
		return chicken.getName() + "으로 만든 " + menu;
	}
}
