package com.policy_cics_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.policy_cics_sdk.openlegacy.Opolcs2;
import com.policy_cics_sdk.openlegacy.Opolcs2InPut;
import com.policy_cics_sdk.openlegacy.Opolcs2Opolcs2Input;
import com.policy_cics_sdk.openlegacy.Opolcs2Opolcs2Output;
import com.policy_cics_sdk.openlegacy.Opolcs2OutPut;
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
 *  Can be tested by invoking the test OpenPolicyServiceTest.
 *  The interface OpenPolicyService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "OpenPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class OpenPolicyServiceImpl implements OpenPolicyService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getOpenPolicy", entities = {
            @EntityMapping(alias="opolcs2", entity=com.policy_cics_sdk.openlegacy.Opolcs2.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "opolcs2.opolcs2Input", expression = "opolcs2Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "opolcs2Output", expression = "opolcs2.opolcs2Output")})
    public OpenPolicyOut getOpenPolicy(OpenPolicyIn openPolicyIn) throws Exception {
        OpenPolicyOut openPolicyOut = new OpenPolicyOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession policyCicsSdkSession = applicationContext.getBean("policyCicsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Opolcs2 opolcs2 = serviceBinder.bindInputs(this, "getOpenPolicy", "opolcs2", new Opolcs2(), openPolicyIn);
            opolcs2 = policyCicsSdkSession.doAction(ActionUtil.getRpcAction(Opolcs2.class), opolcs2);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            openPolicyOut = serviceBinder.bindOutput(this, "getOpenPolicy", openPolicyOut, new String[]{"openPolicyIn", "opolcs2"}, openPolicyIn, opolcs2);
            /* autogenerated - output block end */;

            return openPolicyOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            policyCicsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}