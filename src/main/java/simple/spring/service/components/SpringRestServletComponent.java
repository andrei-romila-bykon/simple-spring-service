package simple.spring.service.components;

import org.osgi.service.component.annotations.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import simple.spring.service.config.SampleRestConfig;

@Component(
        immediate = true,
        property = {
                "osgi.http.whiteboard.context.path=/",
                "osgi.http.whiteboard.servlet.pattern=/api/*"
        },
        service = javax.servlet.Servlet.class
)
public class SpringRestServletComponent extends org.springframework.web.servlet.DispatcherServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4511556505467130357L;

	@Override
    public String getContextConfigLocation() {
        return SampleRestConfig.class.getName();
    }

    @Override
    public Class<?> getContextClass() {
        return AnnotationConfigWebApplicationContext.class;
    }
}
