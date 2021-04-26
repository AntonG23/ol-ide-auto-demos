package com.as400_cobol_rpc_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"itemdetails-test"})
public class ItemDetailsServiceTest extends AbstractApiTest {

    public ItemDetailsServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testItemDetailsService() throws Exception {
        String itemDetails_input = "mock/ItemDetails/test_itemDetails-getItemDetails.input.json";
        String itemDetails_output = "mock/ItemDetails/test_itemDetails-getItemDetails.output.json";
        super.baseTest(itemDetails_input, itemDetails_output, ItemDetailsServiceImpl.class, "getItemDetails");
    }
}
