package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.soap_sdk.openlegacy.GetCustomer;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GetCustomerTest extends AbstractRpcEntityTest<GetCustomer> {

    @Autowired
    public GetCustomerTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void getCustomerTestUseCaseTest_1() {
        String getCustomerTestInput = "mock/GetCustomerTest/test_getCustomerTest_usecase_1.input.json";
        String getCustomerTestOutput = "mock/GetCustomerTest/test_getCustomerTest_usecase_1.output.json";
        super.baseTest(getCustomerTestInput, getCustomerTestOutput, GetCustomer.class);
    }

    @Test
    public void getCustomerTestUseCaseTest_2() {
        String getCustomerTestInput = "mock/GetCustomerTest/test_getCustomerTest_usecase_2.input.json";
        String getCustomerTestOutput = "mock/GetCustomerTest/test_getCustomerTest_usecase_2.output.json";
        super.baseTest(getCustomerTestInput, getCustomerTestOutput, GetCustomer.class);
    }
}
