package com.tutorialspoint.demo;

import com.tutorialspoint.demo.config.DemoApplicationContextConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling
//@EnableSwagger2
public class DemoApplication implements CommandLineRunner {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplicationContextConfig.class);

		Object str = ctx.getBean("Users");
	}

	@Value("${spring.application.name}")
	private String name;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Hello World from Application Runner. Application Name is {}", name);
		logger.warn("A WARN -> Hello World from Application Runner");
		logger.error("An ERROR -> Hello World from Application Runner");
		logger.debug("A DEBUG -> Hello World from Application Runner");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplicationContextConfig.class);

		Object str = ctx.getBean("Users");

		logger.info("Got a bean: " + str.toString());
	}

//	@Bean
//	public Docket configureApi(){
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.tutorialspoint.demo")).build();
//
//	}

}