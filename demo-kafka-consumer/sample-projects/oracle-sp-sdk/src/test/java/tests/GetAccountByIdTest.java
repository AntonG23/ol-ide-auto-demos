package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.oracle_sp_sdk.openlegacy.GetAccountById;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GetAccountByIdTest extends AbstractRpcEntityTest<GetAccountById> {

    @Autowired
    public GetAccountByIdTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void getAccountByIdTestUseCaseTest_1() {
        String getAccountByIdTestInput = "mock/GetAccountByIdTest/test_getAccountByIdTest_usecase_1.input.json";
        String getAccountByIdTestOutput = "mock/GetAccountByIdTest/test_getAccountByIdTest_usecase_1.output.json";
        super.baseTest(getAccountByIdTestInput, getAccountByIdTestOutput, GetAccountById.class);
    }

    @Test
    public void getAccountByIdTestUseCaseTest_2() {
        String getAccountByIdTestInput = "mock/GetAccountByIdTest/test_getAccountByIdTest_usecase_2.input.json";
        String getAccountByIdTestOutput = "mock/GetAccountByIdTest/test_getAccountByIdTest_usecase_2.output.json";
        super.baseTest(getAccountByIdTestInput, getAccountByIdTestOutput, GetAccountById.class);
    }
}
