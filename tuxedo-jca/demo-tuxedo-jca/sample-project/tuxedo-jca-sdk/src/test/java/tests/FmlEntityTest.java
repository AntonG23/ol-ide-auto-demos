package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.tuxedo_jca_sdk.openlegacy.FmlEntity;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FmlEntityTest extends AbstractRpcEntityTest<FmlEntity> {

    @Autowired
    public FmlEntityTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void fmlEntityTestUseCaseTest_1() {
        String fmlEntityTestInput = "mock/FmlEntityTest/test_fmlEntityTest_usecase_1.input.json";
        String fmlEntityTestOutput = "mock/FmlEntityTest/test_fmlEntityTest_usecase_1.output.json";
        super.baseTest(fmlEntityTestInput, fmlEntityTestOutput, FmlEntity.class);
    }

   // @Test
    public void fmlEntityTestUseCaseTest_2() {
        String fmlEntityTestInput = "mock/FmlEntityTest/test_fmlEntityTest_usecase_2.input.json";
        String fmlEntityTestOutput = "mock/FmlEntityTest/test_fmlEntityTest_usecase_2.output.json";
        super.baseTest(fmlEntityTestInput, fmlEntityTestOutput, FmlEntity.class);
    }
}
