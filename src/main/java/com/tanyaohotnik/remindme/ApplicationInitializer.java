package com.tanyaohotnik.remindme;

import com.tanyaohotnik.remindme.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by TanyaOhotnik on 13.06.2017.
 */
public class ApplicationInitializer implements WebApplicationInitializer {
    private static final String DISPATCHER = "dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx));
        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER,new DispatcherServlet(ctx));
   servlet.addMapping("/");
    }
}
