package com.hust.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitalizer implements WebApplicationInitializer {
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(SpringConfiguration.class);
		ctx.setServletContext(container);
		
		DispatcherServlet dispatcherServlet=new DispatcherServlet(ctx);
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
		
		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8", true);
		container.addFilter("encodingFilter", characterEncodingFilter)
		.addMappingForUrlPatterns(null, false, "/*");
	}
}
//public class WebInitalizer extends AbstractAnnotationConfigDispatcherServletInitializer {
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class[] { SpringConfiguration.class };
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return null;
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}
//}