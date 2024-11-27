package com.bonfatti.catalogo.runner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeClassNamePatterns(".*Test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RunAllTests {

    @BeforeAll
    public void beforeAll() {
        System.out.println("Iniciando a execução de todos os testes.");
    }

    @AfterAll
    public void afterAll() {
        System.out.println("Todos os testes foram executados.");
    }
}
