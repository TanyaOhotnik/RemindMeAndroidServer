package com.tanyaohotnik.remindme.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by TanyaOhotnik on 13.06.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.tanyaohotnik.remindme")
public class WebConfig extends WebMvcConfigurerAdapter{
}
