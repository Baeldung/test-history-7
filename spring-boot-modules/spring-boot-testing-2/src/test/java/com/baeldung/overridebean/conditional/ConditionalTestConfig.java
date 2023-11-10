package com.baeldung.overridebean.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.baeldung.overridebean.Service;

@TestConfiguration
public class ConditionalTestConfig {

    @ConditionalOnProperty(name = "service.stub", havingValue = "true")
    @Bean
    public Service helloWorld() {
        return new ConditionalStub();
    }
}
