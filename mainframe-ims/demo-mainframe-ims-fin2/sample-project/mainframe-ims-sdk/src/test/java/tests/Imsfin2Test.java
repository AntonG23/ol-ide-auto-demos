package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.mainframe_ims_sdk.openlegacy.Imsfin2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Imsfin2Test extends AbstractRpcEntityTest<Imsfin2> {

    @Autowired
    public Imsfin2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void imsfin2TestUseCaseTest_1() {
        String imsfin2TestInput = "mock/Imsfin2Test/test_imsfin2Test_usecase_1.input.json";
        String imsfin2TestOutput = "mock/Imsfin2Test/test_imsfin2Test_usecase_1.output.json";
        super.baseTest(imsfin2TestInput, imsfin2TestOutput, Imsfin2.class);
    }

//    @Test
    public void imsfin2TestUseCaseTest_2() {
        String imsfin2TestInput = "mock/Imsfin2Test/test_imsfin2Test_usecase_2.input.json";
        String imsfin2TestOutput = "mock/Imsfin2Test/test_imsfin2Test_usecase_2.output.json";
        super.baseTest(imsfin2TestInput, imsfin2TestOutput, Imsfin2.class);
    }
}
