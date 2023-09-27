package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.common.config.MyConfig;
import com.example.common.config.MyConfigProto;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PrintBeans {

	private final ApplicationContext applicationContext;

	@Bean
	public void printBeansMethod() {
		MyConfig myConfig1 = applicationContext.getBean(MyConfig.class);
		MyConfig myConfig2 = applicationContext.getBean(MyConfig.class);
		MyConfig myConfig3 = applicationContext.getBean(MyConfig.class);

		MyConfigProto myConfigProto1 = applicationContext.getBean(MyConfigProto.class);
		MyConfigProto myConfigProto2 = applicationContext.getBean(MyConfigProto.class);
		MyConfigProto myConfigProto3 = applicationContext.getBean(MyConfigProto.class);

		// System.out.println(myConfig1);
		// System.out.println(myConfig2);
		// System.out.println(myConfig3);

		// System.out.println(myConfigProto1);
		// System.out.println(myConfigProto2);
		// System.out.println(myConfigProto3);
	}
}
