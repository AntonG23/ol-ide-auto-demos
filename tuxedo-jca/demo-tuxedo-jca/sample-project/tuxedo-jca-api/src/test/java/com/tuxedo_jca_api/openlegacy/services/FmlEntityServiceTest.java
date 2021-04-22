package com.tuxedo_jca_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"fmlentity-test"})
public class FmlEntityServiceTest extends AbstractApiTest {

    public FmlEntityServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testFmlEntityService() throws Exception {
        String fmlEntity_input = "mock/FmlEntity/test_fmlEntity-getFmlEntity.input.json";
        String fmlEntity_output = "mock/FmlEntity/test_fmlEntity-getFmlEntity.output.json";
        super.baseTest(fmlEntity_input, fmlEntity_output, FmlEntityServiceImpl.class, "getFmlEntity");
    }
}
