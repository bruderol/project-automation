package ch.hsr.projectautomation.chatbot.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
			.apis(RequestHandlerSelectors
				.basePackage("ch.hsr.projectautomation.chatbot.rest"))
			.paths(PathSelectors.regex("/.*"))
			.build().apiInfo(apiEndPointsInfo());
	}

	private ApiInfo apiEndPointsInfo() {
		return new ApiInfoBuilder().title("Project Automation Chatbot REST API")
			.description("Sample Project for Project Automation Course Exercises")
			.version("1.0.0")
			.build();
	}

}
