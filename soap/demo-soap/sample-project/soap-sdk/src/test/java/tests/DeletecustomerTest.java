package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.soap_sdk.openlegacy.Deletecustomer;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DeletecustomerTest extends AbstractRpcEntityTest<Deletecustomer> {

    @Autowired
    public DeletecustomerTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void deletecustomerTestUseCaseTest_1() {
        String deletecustomerTestInput = "mock/DeletecustomerTest/test_deletecustomerTest_usecase_1.input.json";
        String deletecustomerTestOutput = "mock/DeletecustomerTest/test_deletecustomerTest_usecase_1.output.json";
        super.baseTest(deletecustomerTestInput, deletecustomerTestOutput, Deletecustomer.class);
    }

    @Test
    public void deletecustomerTestUseCaseTest_2() {
        String deletecustomerTestInput = "mock/DeletecustomerTest/test_deletecustomerTest_usecase_2.input.json";
        String deletecustomerTestOutput = "mock/DeletecustomerTest/test_deletecustomerTest_usecase_2.output.json";
        super.baseTest(deletecustomerTestInput, deletecustomerTestOutput, Deletecustomer.class);
    }
}
