package de.mhei.spring.diexample.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author marcusheisters
 */
@ActiveProfiles("prod")
@SpringBootTest
class ProdDatasourceControllerTest {
    @Autowired
    DatasourceController datasourceController;

    @Test
    void getDatasourceShouldReturnProd() {
        assertEquals(datasourceController.getDatasource(), "Datasource: prod");
    }

}