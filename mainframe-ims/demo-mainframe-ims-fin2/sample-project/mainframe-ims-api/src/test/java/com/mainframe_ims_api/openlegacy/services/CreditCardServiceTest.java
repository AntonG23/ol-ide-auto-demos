package com.mainframe_ims_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"creditcard-test"})
public class CreditCardServiceTest extends AbstractApiTest {

    public CreditCardServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testCreditCardService() throws Exception {
        String creditCard_input = "mock/CreditCard/test_creditCard-getCreditCard.input.json";
        String creditCard_output = "mock/CreditCard/test_creditCard-getCreditCard.output.json";
        super.baseTest(creditCard_input, creditCard_output, CreditCardServiceImpl.class, "getCreditCard");
    }
}
