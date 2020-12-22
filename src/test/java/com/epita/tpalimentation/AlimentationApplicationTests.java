package com.epita.tpalimentation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootTest
@ComponentScan(basePackages = { "com.epita.tpalimentation.infrastructure" }, lazyInit = true)
@EntityScan(basePackages = { "com.epita.tpalimentation.domaine.entity" })
@EnableJpaRepositories
class AlimentationApplicationTests {

    @Test
    void contextLoads() {
    }

}
