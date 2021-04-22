package com.tuxedo_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"userdetails-test"})
public class UserDetailsServiceTest extends AbstractApiTest {

    public UserDetailsServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testUserDetailsService() throws Exception {
        String userDetails_input = "mock/UserDetails/test_userDetails-getUserDetails.input.json";
        String userDetails_output = "mock/UserDetails/test_userDetails-getUserDetails.output.json";
        super.baseTest(userDetails_input, userDetails_output, UserDetailsServiceImpl.class, "getUserDetails");
    }
}
