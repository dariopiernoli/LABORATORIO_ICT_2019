package it.sisthema.lab;

import javax.servlet.http.HttpServlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.sisthema.lab.forms.Account;

@Configuration
public class WebConfig {
	
	@Bean
	public ServletRegistrationBean<HttpServlet> AccountServlet() {
		   ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
		   servRegBean.setServlet(new Account());
		   servRegBean.addUrlMappings("/account/*");
		   servRegBean.setLoadOnStartup(1);
		   return servRegBean;
	   }

}
