package tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcActions;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tuxedo_sdk.openlegacy.Getuserdetails;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GetuserdetailsTest extends AbstractRpcEntityTest<Getuserdetails> {

    @Autowired
    public GetuserdetailsTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

//    @Test
    public void getuserdetailsTestUseCaseTest_1() {
        String getuserdetailsTestInput = "mock/GetuserdetailsTest/test_getuserdetailsTest_usecase_1.input.json";
        String getuserdetailsTestOutput = "mock/GetuserdetailsTest/test_getuserdetailsTest_usecase_1.output.json";
        super.baseTest(getuserdetailsTestInput, getuserdetailsTestOutput, Getuserdetails.class);
    }

//    @Test
    public void getuserdetailsTestUseCaseTest_2() {
        String getuserdetailsTestInput = "mock/GetuserdetailsTest/test_getuserdetailsTest_usecase_2.input.json";
        String getuserdetailsTestOutput = "mock/GetuserdetailsTest/test_getuserdetailsTest_usecase_2.output.json";
        super.baseTest(getuserdetailsTestInput, getuserdetailsTestOutput, Getuserdetails.class);
    }
    
    @Autowired
    private RpcSession rpcSession;

    @Test
    public void testGetuserdetailsEXECUTE() throws Exception {
        try {
            Getuserdetails getuserdetails = new Getuserdetails();
            getuserdetails.setId3(101);
            getuserdetails = rpcSession.doAction(RpcActions.EXECUTE(), getuserdetails);
            assertNotNull(getuserdetails);
            assertThat(getuserdetails.getName3().equals("Leonardo Pisano"));
            printJson(getuserdetails);
        } finally {
            rpcSession.disconnect();
        }
    }
    
    public static void printJson(Object object) {
    	   ObjectMapper mapper = new ObjectMapper();
    	   mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    	   try {
    	       System.out.println(mapper.writeValueAsString(object));
    	   } catch (JsonProcessingException e) {
    	       System.out.println(e.getMessage());
    	   }
    	}
}
