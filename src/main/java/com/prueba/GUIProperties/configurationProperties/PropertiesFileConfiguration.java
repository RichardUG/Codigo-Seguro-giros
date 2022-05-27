package com.prueba.GUIProperties.configurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Getter
@Setter
@ToString
@Configuration
@PropertySource("classpath:config.properties")
public class PropertiesFileConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
