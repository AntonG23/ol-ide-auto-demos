package com.as400_pcml_rpc_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"customer-test"})
public class CustomerServiceTest extends AbstractApiTest {

    public CustomerServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testCustomerService() throws Exception {
        String customer_input = "mock/Customer/test_customer-getCustomer.input.json";
        String customer_output = "mock/Customer/test_customer-getCustomer.output.json";
        super.baseTest(customer_input, customer_output, CustomerServiceImpl.class, "getCustomer");
    }
}
