package com.account_as400_pcml_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_as400_pcml_sdk.openlegacy.Oactcs6X;
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
 *  Can be tested by invoking the test OpenAccountServiceTest.
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
            @EntityMapping(alias="oactcs6X", entity=com.account_as400_pcml_sdk.openlegacy.Oactcs6X.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "oactcs6X.dsAccount", expression = "dsAccount"),
            @BindTo(endpoint = "oactcs6X.dsCustid", expression = "dsCustid"),
            @BindTo(endpoint = "oactcs6X.dsCustname", expression = "dsCustname"),
            @BindTo(endpoint = "oactcs6X.dsIban", expression = "dsIban"),
            @BindTo(endpoint = "oactcs6X.dsBankid", expression = "dsBankid"),
            @BindTo(endpoint = "oactcs6X.dsBranchid", expression = "dsBranchid"),
            @BindTo(endpoint = "oactcs6X.dsCntrycd", expression = "dsCntrycd"),
            @BindTo(endpoint = "oactcs6X.dsTypcd", expression = "dsTypcd"),
            @BindTo(endpoint = "oactcs6X.dsSubtypcd", expression = "dsSubtypcd"),
            @BindTo(endpoint = "oactcs6X.dsTypename", expression = "dsTypename"),
            @BindTo(endpoint = "oactcs6X.dsTypedesc", expression = "dsTypedesc"),
            @BindTo(endpoint = "oactcs6X.dsBalance", expression = "dsBalance"),
            @BindTo(endpoint = "oactcs6X.dsCurrency", expression = "dsCurrency"),
            @BindTo(endpoint = "oactcs6X.dsCrtdt", expression = "dsCrtdt"),
            @BindTo(endpoint = "oactcs6X.dsUpdtdt", expression = "dsUpdtdt"),
            @BindTo(endpoint = "oactcs6X.dsLocked", expression = "dsLocked"),
            @BindTo(endpoint = "oactcs6X.output", expression = "output")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "dsAccount", expression = "oactcs6X.dsAccount"),
            @BindFrom(endpoint = "dsCustid", expression = "oactcs6X.dsCustid"),
            @BindFrom(endpoint = "dsCustname", expression = "oactcs6X.dsCustname"),
            @BindFrom(endpoint = "dsIban", expression = "oactcs6X.dsIban"),
            @BindFrom(endpoint = "dsBankid", expression = "oactcs6X.dsBankid"),
            @BindFrom(endpoint = "dsBranchid", expression = "oactcs6X.dsBranchid"),
            @BindFrom(endpoint = "dsCntrycd", expression = "oactcs6X.dsCntrycd"),
            @BindFrom(endpoint = "dsTypcd", expression = "oactcs6X.dsTypcd"),
            @BindFrom(endpoint = "dsSubtypcd", expression = "oactcs6X.dsSubtypcd"),
            @BindFrom(endpoint = "dsTypename", expression = "oactcs6X.dsTypename"),
            @BindFrom(endpoint = "dsTypedesc", expression = "oactcs6X.dsTypedesc"),
            @BindFrom(endpoint = "dsBalance", expression = "oactcs6X.dsBalance"),
            @BindFrom(endpoint = "dsCurrency", expression = "oactcs6X.dsCurrency"),
            @BindFrom(endpoint = "dsCrtdt", expression = "oactcs6X.dsCrtdt"),
            @BindFrom(endpoint = "dsUpdtdt", expression = "oactcs6X.dsUpdtdt"),
            @BindFrom(endpoint = "dsLocked", expression = "oactcs6X.dsLocked"),
            @BindFrom(endpoint = "output", expression = "oactcs6X.output")})
    public OpenAccountOut getOpenAccount(OpenAccountIn openAccountIn) throws Exception {
        OpenAccountOut openAccountOut = new OpenAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountAs400PcmlSdkSession = applicationContext.getBean("accountAs400PcmlSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Oactcs6X oactcs6X = serviceBinder.bindInputs(this, "getOpenAccount", "oactcs6X", new Oactcs6X(), openAccountIn);
            oactcs6X = accountAs400PcmlSdkSession.doAction(ActionUtil.getRpcAction(Oactcs6X.class), oactcs6X);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            openAccountOut = serviceBinder.bindOutput(this, "getOpenAccount", openAccountOut, new String[]{"openAccountIn", "oactcs6X"}, openAccountIn, oactcs6X);
            /* autogenerated - output block end */;

            return openAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountAs400PcmlSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
