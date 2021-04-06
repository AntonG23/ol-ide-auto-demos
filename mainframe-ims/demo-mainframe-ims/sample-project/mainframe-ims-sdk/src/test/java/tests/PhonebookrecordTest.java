package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.mainframe_ims_sdk.openlegacy.Phonebookrecord;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PhonebookrecordTest extends AbstractRpcEntityTest<Phonebookrecord> {

    @Autowired
    public PhonebookrecordTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void phonebookrecordTestUseCaseTest_1() {
        String phonebookrecordTestInput = "mock/PhonebookrecordTest/test_phonebookrecordTest_usecase_1.input.json";
        String phonebookrecordTestOutput = "mock/PhonebookrecordTest/test_phonebookrecordTest_usecase_1.output.json";
        super.baseTest(phonebookrecordTestInput, phonebookrecordTestOutput, Phonebookrecord.class);
    }

//    @Test
    public void phonebookrecordTestUseCaseTest_2() {
        String phonebookrecordTestInput = "mock/PhonebookrecordTest/test_phonebookrecordTest_usecase_2.input.json";
        String phonebookrecordTestOutput = "mock/PhonebookrecordTest/test_phonebookrecordTest_usecase_2.output.json";
        super.baseTest(phonebookrecordTestInput, phonebookrecordTestOutput, Phonebookrecord.class);
    }
}
