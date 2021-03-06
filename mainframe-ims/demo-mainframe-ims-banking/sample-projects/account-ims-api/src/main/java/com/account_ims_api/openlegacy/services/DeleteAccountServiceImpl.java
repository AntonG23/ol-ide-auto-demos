package com.account_ims_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_ims_sdk.openlegacy.Dactim8;
import com.account_ims_sdk.openlegacy.Dactim8AccountOut;
import com.account_ims_sdk.openlegacy.Dactim8Dactim8Input;
import com.account_ims_sdk.openlegacy.Dactim8Dactim8Output;
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
 *  The interface DeleteAccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "DeleteAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class DeleteAccountServiceImpl implements DeleteAccountService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getDeleteAccount", entities = {
            @EntityMapping(alias="dactim8", entity=com.account_ims_sdk.openlegacy.Dactim8.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "dactim8.dactim8Input", expression = "dactim8Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "dactim8Output", expression = "dactim8.dactim8Output")})
    public DeleteAccountOut getDeleteAccount(DeleteAccountIn deleteAccountIn) throws Exception {
        DeleteAccountOut deleteAccountOut = new DeleteAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountImsSdkSession = applicationContext.getBean("accountImsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Dactim8 dactim8 = serviceBinder.bindInputs(this, "getDeleteAccount", "dactim8", new Dactim8(), deleteAccountIn);
            dactim8 = accountImsSdkSession.doAction(ActionUtil.getRpcAction(Dactim8.class), dactim8);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            deleteAccountOut = serviceBinder.bindOutput(this, "getDeleteAccount", deleteAccountOut, new String[]{"deleteAccountIn", "dactim8"}, deleteAccountIn, dactim8);
            /* autogenerated - output block end */;

            return deleteAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountImsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
