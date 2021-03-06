package com.kafka_consumer_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.oracle_sp_sdk.openlegacy.GetAccountById;
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
 *  The interface CustomerService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "Customer")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getCustomer", entities = {
            @EntityMapping(alias="getAccountById", entity=com.oracle_sp_sdk.openlegacy.GetAccountById.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "getAccountById.accId", expression = "accId")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "getAccountById", expression = "getAccountById")})
    public CustomerOut getCustomer(CustomerIn customerIn) throws Exception {
        CustomerOut customerOut = new CustomerOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession oracleSpSdkSession = applicationContext.getBean("oracleSpSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            GetAccountById getAccountById = serviceBinder.bindInputs(this, "getCustomer", "getAccountById", new GetAccountById(), customerIn);
            getAccountById = oracleSpSdkSession.doAction(ActionUtil.getRpcAction(GetAccountById.class), getAccountById);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            customerOut = serviceBinder.bindOutput(this, "getCustomer", customerOut, new String[]{"customerIn", "getAccountById"}, customerIn, getAccountById);
            /* autogenerated - output block end */;

            return customerOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            oracleSpSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
