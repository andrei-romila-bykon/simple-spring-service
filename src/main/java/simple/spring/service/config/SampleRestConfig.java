package simple.spring.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "simple.spring.service")
@PropertySources({
	  @PropertySource("classpath:application.properties"),
	  @PropertySource(
	      value = "classpath:/application-${spring.profiles.active}.properties",
	      ignoreResourceNotFound = true)
	})
public class SampleRestConfig {
	
    @Bean
    public RequestMappingHandlerMapping handlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
        handlerMapping.setAlwaysUseFullPath(true);
        return handlerMapping;
    }
}
