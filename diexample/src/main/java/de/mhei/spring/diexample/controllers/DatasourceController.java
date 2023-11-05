package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.DatasourceService;
import org.springframework.stereotype.Controller;

/**
 * @author marcusheisters
 */
@Controller
public class DatasourceController {

    private final DatasourceService datasourceService;

    public DatasourceController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDatasource() {
        return datasourceService.getDatasource();
    }
}
