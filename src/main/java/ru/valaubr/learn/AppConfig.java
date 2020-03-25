package ru.valaubr.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author valaubr
 */
@Configuration
@ComponentScan("ru.valaubr.learn")
@PropertySource("classpath:musicPlayer.properties")
public class AppConfig {
    
}
