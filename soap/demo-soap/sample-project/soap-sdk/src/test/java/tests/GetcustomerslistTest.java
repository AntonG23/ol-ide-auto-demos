package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.soap_sdk.openlegacy.Getcustomerslist;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GetcustomerslistTest extends AbstractRpcEntityTest<Getcustomerslist> {

    @Autowired
    public GetcustomerslistTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void getcustomerslistTestUseCaseTest_1() {
        String getcustomerslistTestInput = "mock/GetcustomerslistTest/test_getcustomerslistTest_usecase_1.input.json";
        String getcustomerslistTestOutput = "mock/GetcustomerslistTest/test_getcustomerslistTest_usecase_1.output.json";
        super.baseTest(getcustomerslistTestInput, getcustomerslistTestOutput, Getcustomerslist.class);
    }

   // @Test
    public void getcustomerslistTestUseCaseTest_2() {
        String getcustomerslistTestInput = "mock/GetcustomerslistTest/test_getcustomerslistTest_usecase_2.input.json";
        String getcustomerslistTestOutput = "mock/GetcustomerslistTest/test_getcustomerslistTest_usecase_2.output.json";
        super.baseTest(getcustomerslistTestInput, getcustomerslistTestOutput, Getcustomerslist.class);
    }
}
