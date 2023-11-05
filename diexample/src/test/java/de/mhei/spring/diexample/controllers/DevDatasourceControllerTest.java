package de.mhei.spring.diexample.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author marcusheisters
 */
@ActiveProfiles("dev")
@SpringBootTest
class DevDatasourceControllerTest {

    @Autowired
    DatasourceController datasourceController;

    @Test
    void getDatasource() {
        assertEquals(datasourceController.getDatasource(), "Datasource: dev");
    }
}