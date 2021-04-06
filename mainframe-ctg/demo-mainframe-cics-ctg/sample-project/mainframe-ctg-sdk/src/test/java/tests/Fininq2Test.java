package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.mainframe_ctg_sdk.openlegacy.Fininq2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Fininq2Test extends AbstractRpcEntityTest<Fininq2> {

    @Autowired
    public Fininq2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void fininq2TestUseCaseTest_1() {
        String fininq2TestInput = "mock/Fininq2Test/test_fininq2Test_usecase_1.input.json";
        String fininq2TestOutput = "mock/Fininq2Test/test_fininq2Test_usecase_1.output.json";
        super.baseTest(fininq2TestInput, fininq2TestOutput, Fininq2.class);
    }
}
