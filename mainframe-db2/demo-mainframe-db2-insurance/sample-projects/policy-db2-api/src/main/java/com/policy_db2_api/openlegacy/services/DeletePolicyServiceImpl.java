package com.policy_db2_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.policy_db2_sdk.openlegacy.Dpolsql;
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
 *  Can be tested by invoking the test DeletePolicyServiceTest.
 *  The interface DeletePolicyService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "DeletePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class DeletePolicyServiceImpl implements DeletePolicyService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getDeletePolicy", entities = {
            @EntityMapping(alias="dpolsql", entity=com.policy_db2_sdk.openlegacy.Dpolsql.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "dpolsql.policyNum", expression = "policyNum")})
    public DeletePolicyOut getDeletePolicy(DeletePolicyIn deletePolicyIn) throws Exception {
        DeletePolicyOut deletePolicyOut = new DeletePolicyOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession policyDb2SdkSession = applicationContext.getBean("policyDb2SdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Dpolsql dpolsql = serviceBinder.bindInputs(this, "getDeletePolicy", "dpolsql", new Dpolsql(), deletePolicyIn);
            dpolsql = policyDb2SdkSession.doAction(ActionUtil.getRpcAction(Dpolsql.class), dpolsql);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            deletePolicyOut = serviceBinder.bindOutput(this, "getDeletePolicy", deletePolicyOut, new String[]{"deletePolicyIn", "dpolsql"}, deletePolicyIn, dpolsql);
            /* autogenerated - output block end */;

            return deletePolicyOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            policyDb2SdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
