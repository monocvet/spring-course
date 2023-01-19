package ru.maxima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.maxima")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
