package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan // 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}


	// @Bean
	// ViewResolver internalResourceViewResolver() {
	//	return new InternalResourceViewResolver("/WEB-INF/views", ".jsp");
	// }
	// spring boot가 자동으로 application.properties의 설정을 처리하는 것과과같음

	// @Bean
	// SpringMemberFormControllerV1 springMemberFormControllerV1() {
	//	return new SpringMemberFormControllerV1();
	// }
	// SpringMemberFormControllerV1 클래스에서 @Controller를 쓰지 않으면 이렇게 해도 된다.

}
