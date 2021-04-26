package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.as400_pcml_rpc_sdk.openlegacy.Getcst;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GetcstTest extends AbstractRpcEntityTest<Getcst> {

    @Autowired
    public GetcstTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void getcstTestUseCaseTest_1() {
        String getcstTestInput = "mock/GetcstTest/test_getcstTest_usecase_1.input.json";
        String getcstTestOutput = "mock/GetcstTest/test_getcstTest_usecase_1.output.json";
        super.baseTest(getcstTestInput, getcstTestOutput, Getcst.class);
    }

    //@Test
    public void getcstTestUseCaseTest_2() {
        String getcstTestInput = "mock/GetcstTest/test_getcstTest_usecase_2.input.json";
        String getcstTestOutput = "mock/GetcstTest/test_getcstTest_usecase_2.output.json";
        super.baseTest(getcstTestInput, getcstTestOutput, Getcst.class);
    }
}
