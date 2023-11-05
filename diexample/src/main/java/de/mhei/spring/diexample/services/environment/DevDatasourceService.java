package de.mhei.spring.diexample.services.environment;

import de.mhei.spring.diexample.services.DatasourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author marcusheisters
 */
@Profile({"dev", "default"})
@Service("datasourceService")
public class DevDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Datasource: dev";
    }
}
