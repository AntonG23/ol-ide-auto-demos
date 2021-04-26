package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.as400_cobol_rpc_sdk.openlegacy.Itemdetails;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ItemdetailsTest extends AbstractRpcEntityTest<Itemdetails> {

    @Autowired
    public ItemdetailsTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void itemdetailsTestUseCaseTest_1() {
        String itemdetailsTestInput = "mock/ItemdetailsTest/test_itemdetailsTest_usecase_1.input.json";
        String itemdetailsTestOutput = "mock/ItemdetailsTest/test_itemdetailsTest_usecase_1.output.json";
        super.baseTest(itemdetailsTestInput, itemdetailsTestOutput, Itemdetails.class);
    }

    @Test
    public void itemdetailsTestUseCaseTest_2() {
        String itemdetailsTestInput = "mock/ItemdetailsTest/test_itemdetailsTest_usecase_2.input.json";
        String itemdetailsTestOutput = "mock/ItemdetailsTest/test_itemdetailsTest_usecase_2.output.json";
        super.baseTest(itemdetailsTestInput, itemdetailsTestOutput, Itemdetails.class);
    }
}
