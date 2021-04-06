package com.mainframe_ims_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"customerdetails-test"})
public class CustomerDetailsServiceTest extends AbstractApiTest {

    public CustomerDetailsServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testCustomerDetailsService() throws Exception {
        String customerDetails_input = "mock/CustomerDetails/test_customerDetails-getCustomerDetails.input.json";
        String customerDetails_output = "mock/CustomerDetails/test_customerDetails-getCustomerDetails.output.json";
        super.baseTest(customerDetails_input, customerDetails_output, CustomerDetailsServiceImpl.class, "getCustomerDetails");
    }
}
