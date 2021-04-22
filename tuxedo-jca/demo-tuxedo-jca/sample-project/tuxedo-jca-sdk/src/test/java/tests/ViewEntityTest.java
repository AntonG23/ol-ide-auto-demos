package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.tuxedo_jca_sdk.openlegacy.ViewEntity;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ViewEntityTest extends AbstractRpcEntityTest<ViewEntity> {

    @Autowired
    public ViewEntityTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void viewEntityTestUseCaseTest_1() {
        String viewEntityTestInput = "mock/ViewEntityTest/test_viewEntityTest_usecase_1.input.json";
        String viewEntityTestOutput = "mock/ViewEntityTest/test_viewEntityTest_usecase_1.output.json";
        super.baseTest(viewEntityTestInput, viewEntityTestOutput, ViewEntity.class);
    }

    //@Test
    public void viewEntityTestUseCaseTest_2() {
        String viewEntityTestInput = "mock/ViewEntityTest/test_viewEntityTest_usecase_2.input.json";
        String viewEntityTestOutput = "mock/ViewEntityTest/test_viewEntityTest_usecase_2.output.json";
        super.baseTest(viewEntityTestInput, viewEntityTestOutput, ViewEntity.class);
    }
}
