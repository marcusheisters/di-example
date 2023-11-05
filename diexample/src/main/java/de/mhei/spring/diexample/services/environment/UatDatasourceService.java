package de.mhei.spring.diexample.services.environment;

import de.mhei.spring.diexample.services.DatasourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author marcusheisters
 */
@Profile("uat")
@Service("DatasourceService")
public class UatDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Datasource: uat";
    }
}
