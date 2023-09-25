package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.config.MyConfig;
import com.example.config.MyConfigProto;

@SpringBootApplication
public class ShinhanBackApplication {

	public static void main(String[] args) {
		MyConfig myConfig1 = new MyConfig();
		MyConfig myConfig2 = new MyConfig();
		MyConfig myConfig3 = new MyConfig();

		MyConfigProto myConfigProto1 = new MyConfigProto();
		MyConfigProto myConfigProto2 = new MyConfigProto();
		MyConfigProto myConfigProto3 = new MyConfigProto();

		System.out.println(myConfig1);
		System.out.println(myConfig2);
		System.out.println(myConfig3);

		System.out.println(myConfigProto1);
		System.out.println(myConfigProto2);
		System.out.println(myConfigProto3);

		SpringApplication.run(ShinhanBackApplication.class, args);
	}
}
