package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.soap_sdk.openlegacy.Updatecustomer;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UpdatecustomerTest extends AbstractRpcEntityTest<Updatecustomer> {

    @Autowired
    public UpdatecustomerTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void updatecustomerTestUseCaseTest_1() {
        String updatecustomerTestInput = "mock/UpdatecustomerTest/test_updatecustomerTest_usecase_1.input.json";
        String updatecustomerTestOutput = "mock/UpdatecustomerTest/test_updatecustomerTest_usecase_1.output.json";
        super.baseTest(updatecustomerTestInput, updatecustomerTestOutput, Updatecustomer.class);
    }

    @Test
    public void updatecustomerTestUseCaseTest_2() {
        String updatecustomerTestInput = "mock/UpdatecustomerTest/test_updatecustomerTest_usecase_2.input.json";
        String updatecustomerTestOutput = "mock/UpdatecustomerTest/test_updatecustomerTest_usecase_2.output.json";
        super.baseTest(updatecustomerTestInput, updatecustomerTestOutput, Updatecustomer.class);
    }
}
