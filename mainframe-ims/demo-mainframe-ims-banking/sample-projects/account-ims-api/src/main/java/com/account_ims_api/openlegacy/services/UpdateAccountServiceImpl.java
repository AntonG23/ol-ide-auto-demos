package com.account_ims_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_ims_sdk.openlegacy.Uactim8;
import com.account_ims_sdk.openlegacy.Uactim8Uactim8Input;
import com.account_ims_sdk.openlegacy.Uactim8Uactim8Output;
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
 *  The interface UpdateAccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "UpdateAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class UpdateAccountServiceImpl implements UpdateAccountService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getUpdateAccount", entities = {
            @EntityMapping(alias="uactim8", entity=com.account_ims_sdk.openlegacy.Uactim8.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "uactim8.uactim8Input", expression = "uactim8Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "uactim8Output", expression = "uactim8.uactim8Output")})
    public UpdateAccountOut getUpdateAccount(UpdateAccountIn updateAccountIn) throws Exception {
        UpdateAccountOut updateAccountOut = new UpdateAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountImsSdkSession = applicationContext.getBean("accountImsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Uactim8 uactim8 = serviceBinder.bindInputs(this, "getUpdateAccount", "uactim8", new Uactim8(), updateAccountIn);
            uactim8 = accountImsSdkSession.doAction(ActionUtil.getRpcAction(Uactim8.class), uactim8);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            updateAccountOut = serviceBinder.bindOutput(this, "getUpdateAccount", updateAccountOut, new String[]{"updateAccountIn", "uactim8"}, updateAccountIn, uactim8);
            /* autogenerated - output block end */;

            return updateAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountImsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}