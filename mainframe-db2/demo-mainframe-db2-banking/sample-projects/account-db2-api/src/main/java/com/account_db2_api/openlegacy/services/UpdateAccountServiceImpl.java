package com.account_db2_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_db2_sdk.openlegacy.Uactsql;
import java.math.BigDecimal;
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
 *  Can be tested by invoking the test UpdateAccountServiceTest.
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
            @EntityMapping(alias="uactsql", entity=com.account_db2_sdk.openlegacy.Uactsql.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "uactsql.accountId", expression = "accountId"),
            @BindTo(endpoint = "uactsql.customerId", expression = "customerId"),
            @BindTo(endpoint = "uactsql.customerName", expression = "customerName"),
            @BindTo(endpoint = "uactsql.iban", expression = "iban"),
            @BindTo(endpoint = "uactsql.bnkId", expression = "bnkId"),
            @BindTo(endpoint = "uactsql.brnchId", expression = "brnchId"),
            @BindTo(endpoint = "uactsql.cntryCd", expression = "cntryCd"),
            @BindTo(endpoint = "uactsql.typcd", expression = "typcd"),
            @BindTo(endpoint = "uactsql.subTypcd", expression = "subTypcd"),
            @BindTo(endpoint = "uactsql.typeName", expression = "typeName"),
            @BindTo(endpoint = "uactsql.typeDescription", expression = "typeDescription"),
            @BindTo(endpoint = "uactsql.balance", expression = "balance"),
            @BindTo(endpoint = "uactsql.currency", expression = "currency"),
            @BindTo(endpoint = "uactsql.crtDt", expression = "crtDt"),
            @BindTo(endpoint = "uactsql.updtDt", expression = "updtDt"),
            @BindTo(endpoint = "uactsql.locked", expression = "locked")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "accountId", expression = "uactsql.accountId"),
            @BindFrom(endpoint = "customerId", expression = "uactsql.customerId"),
            @BindFrom(endpoint = "customerName", expression = "uactsql.customerName"),
            @BindFrom(endpoint = "iban", expression = "uactsql.iban"),
            @BindFrom(endpoint = "bnkId", expression = "uactsql.bnkId"),
            @BindFrom(endpoint = "brnchId", expression = "uactsql.brnchId"),
            @BindFrom(endpoint = "cntryCd", expression = "uactsql.cntryCd"),
            @BindFrom(endpoint = "typcd", expression = "uactsql.typcd"),
            @BindFrom(endpoint = "subTypcd", expression = "uactsql.subTypcd"),
            @BindFrom(endpoint = "typeName", expression = "uactsql.typeName"),
            @BindFrom(endpoint = "typeDescription", expression = "uactsql.typeDescription"),
            @BindFrom(endpoint = "balance", expression = "uactsql.balance"),
            @BindFrom(endpoint = "currency", expression = "uactsql.currency"),
            @BindFrom(endpoint = "crtDt", expression = "uactsql.crtDt"),
            @BindFrom(endpoint = "updtDt", expression = "uactsql.updtDt"),
            @BindFrom(endpoint = "locked", expression = "uactsql.locked")})
    public UpdateAccountOut getUpdateAccount(UpdateAccountIn updateAccountIn) throws Exception {
        UpdateAccountOut updateAccountOut = new UpdateAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountDb2SdkSession = applicationContext.getBean("accountDb2SdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Uactsql uactsql = serviceBinder.bindInputs(this, "getUpdateAccount", "uactsql", new Uactsql(), updateAccountIn);
            uactsql = accountDb2SdkSession.doAction(ActionUtil.getRpcAction(Uactsql.class), uactsql);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            updateAccountOut = serviceBinder.bindOutput(this, "getUpdateAccount", updateAccountOut, new String[]{"updateAccountIn", "uactsql"}, updateAccountIn, uactsql);
            /* autogenerated - output block end */;

            return updateAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountDb2SdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
