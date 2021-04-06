package com.soap_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"customers-test"})
public class CustomersServiceTest extends AbstractApiTest {

    public CustomersServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testCustomersService() throws Exception {
        String customers_input = "mock/Customers/test_customers-getCustomers.input.json";
        String customers_output = "mock/Customers/test_customers-getCustomers.output.json";
        super.baseTest(customers_input, customers_output, CustomersServiceImpl.class, "getCustomers");
    }
}
