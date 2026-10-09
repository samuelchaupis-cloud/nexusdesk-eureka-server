package com.nexusdesk.eureka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(properties = {
    "eureka.client.register-with-eureka=false",
    "eureka.client.fetch-registry=false"
})
class EurekaServerApplicationTests {

    @Test
    @DisplayName("Debe cargar el contexto de Eureka Server sin excepciones")
    void contextLoads() {
        assertNotNull(EurekaServerApplication.class);
    }
}
