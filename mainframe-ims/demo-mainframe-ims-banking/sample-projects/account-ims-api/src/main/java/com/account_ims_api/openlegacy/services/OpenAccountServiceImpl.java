package com.account_ims_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_ims_sdk.openlegacy.Oactim8;
import com.account_ims_sdk.openlegacy.Oactim8AccountDetails;
import com.account_ims_sdk.openlegacy.Oactim8Oactim8Input;
import com.account_ims_sdk.openlegacy.Oactim8Oactim8Output;
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
 *  The interface OpenAccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "OpenAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class OpenAccountServiceImpl implements OpenAccountService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getOpenAccount", entities = {
            @EntityMapping(alias="oactim8", entity=com.account_ims_sdk.openlegacy.Oactim8.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "oactim8.oactim8Input", expression = "oactim8Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "oactim8Output", expression = "oactim8.oactim8Output")})
    public OpenAccountOut getOpenAccount(OpenAccountIn openAccountIn) throws Exception {
        OpenAccountOut openAccountOut = new OpenAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountImsSdkSession = applicationContext.getBean("accountImsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Oactim8 oactim8 = serviceBinder.bindInputs(this, "getOpenAccount", "oactim8", new Oactim8(), openAccountIn);
            oactim8 = accountImsSdkSession.doAction(ActionUtil.getRpcAction(Oactim8.class), oactim8);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            openAccountOut = serviceBinder.bindOutput(this, "getOpenAccount", openAccountOut, new String[]{"openAccountIn", "oactim8"}, openAccountIn, oactim8);
            /* autogenerated - output block end */;

            return openAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountImsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
