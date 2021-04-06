package com.mainframe_ctg_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"cards-test"})
public class CardsServiceTest extends AbstractApiTest {

    public CardsServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testCardsService() throws Exception {
        String cards_input = "mock/Cards/test_cards-getCards.input.json";
        String cards_output = "mock/Cards/test_cards-getCards.output.json";
        super.baseTest(cards_input, cards_output, CardsServiceImpl.class, "getCards");
    }
}
