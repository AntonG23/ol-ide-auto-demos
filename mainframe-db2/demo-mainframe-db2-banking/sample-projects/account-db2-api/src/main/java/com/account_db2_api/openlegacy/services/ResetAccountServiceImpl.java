package com.account_db2_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_db2_sdk.openlegacy.Ractsql;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcActions;

import org.openlegacy.core.annotations.services.*;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.openlegacy.impl.services.ws.ServiceBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.openlegacy.utils.ActionUtil;

/**
 *  A service implementation which invokes OpenLegacy API, and returns a service output.
 *  The code below should be customize to perform a working scenario which goes through the relevant screens.
 *  Can be tested by invoking the test ResetAccountServiceTest.
 *  The interface ResetAccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "ResetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class ResetAccountServiceImpl implements ResetAccountService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getResetAccount", entities = {
            @EntityMapping(alias="ractsql", entity=com.account_db2_sdk.openlegacy.Ractsql.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "ractsql", expression = "ractsql")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "ractsql", expression = "ractsql")})
    public ResetAccountOut getResetAccount(ResetAccountIn resetAccountIn) throws Exception {
        ResetAccountOut resetAccountOut = new ResetAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountDb2SdkSession = applicationContext.getBean("accountDb2SdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Ractsql ractsql = serviceBinder.bindInputs(this, "getResetAccount", "ractsql", new Ractsql(), resetAccountIn);
            ractsql = accountDb2SdkSession.doAction(ActionUtil.getRpcAction(Ractsql.class), ractsql);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            resetAccountOut = serviceBinder.bindOutput(this, "getResetAccount", resetAccountOut, new String[]{"resetAccountIn", "ractsql"}, resetAccountIn, ractsql);
            /* autogenerated - output block end */;

            return resetAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountDb2SdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
