package com.onedirect.duedate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
/**
 * 
 * @author kundan.bora
 * This class keep all the configuration for spring context
 *
 */
@Configuration
@Import({DBConfig.class})
@Profile( value={"dev","staging","prod"})
@ImportResource(locations={"classpath:/${profile}/db.properties"})
@ComponentScan(basePackages={"com.onedirect.duedate"})
public class AppConfig {

}
