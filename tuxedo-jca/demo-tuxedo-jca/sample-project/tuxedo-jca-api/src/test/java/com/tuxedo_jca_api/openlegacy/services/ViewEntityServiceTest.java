package com.tuxedo_jca_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"viewentity-test"})
public class ViewEntityServiceTest extends AbstractApiTest {

    public ViewEntityServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testViewEntityService() throws Exception {
        String viewEntity_input = "mock/ViewEntity/test_viewEntity-getViewEntity.input.json";
        String viewEntity_output = "mock/ViewEntity/test_viewEntity-getViewEntity.output.json";
        super.baseTest(viewEntity_input, viewEntity_output, ViewEntityServiceImpl.class, "getViewEntity");
    }
}
