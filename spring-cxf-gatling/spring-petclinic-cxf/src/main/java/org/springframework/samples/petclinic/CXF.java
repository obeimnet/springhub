package org.springframework.samples.petclinic;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Profile(CXF.CXF_PROFILE)
@Configuration
@ImportResource("classpath:cxf/spring-petclinic-cxf.xml")
class CXF {

	protected static final String CXF_PROFILE = "cxf";
	
	@Bean
	public ServletRegistrationBean<CXFServlet> cxfServletRegistrationBean() {
		ServletRegistrationBean<CXFServlet> registrationBean = new ServletRegistrationBean<>(new CXFServlet(), "/services/*");
		registrationBean.setAsyncSupported(true);
		registrationBean.setLoadOnStartup(1);
		registrationBean.setName("CXFServlet");
		return registrationBean;
	}
    
}
