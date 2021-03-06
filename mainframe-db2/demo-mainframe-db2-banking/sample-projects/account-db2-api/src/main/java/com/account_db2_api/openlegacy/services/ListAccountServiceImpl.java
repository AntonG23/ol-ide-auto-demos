package com.account_db2_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_db2_sdk.openlegacy.Lactsql;
import com.account_db2_sdk.openlegacy.Lactsql.ResultSet;
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
 *  Can be tested by invoking the test ListAccountServiceTest.
 *  The interface ListAccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "ListAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class ListAccountServiceImpl implements ListAccountService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getListAccount", entities = {
            @EntityMapping(alias="lactsql", entity=com.account_db2_sdk.openlegacy.Lactsql.class)})
    @LogServiceUsage
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "resultSet", expression = "lactsql.resultSet")})
    public ListAccountOut getListAccount() throws Exception {
        ListAccountOut listAccountOut = new ListAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountDb2SdkSession = applicationContext.getBean("accountDb2SdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Lactsql lactsql = new Lactsql();
            lactsql = accountDb2SdkSession.doAction(ActionUtil.getRpcAction(Lactsql.class), lactsql);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            listAccountOut = serviceBinder.bindOutput(this, "getListAccount", listAccountOut, new String[]{"lactsql"}, lactsql);
            /* autogenerated - output block end */;

            return listAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountDb2SdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
