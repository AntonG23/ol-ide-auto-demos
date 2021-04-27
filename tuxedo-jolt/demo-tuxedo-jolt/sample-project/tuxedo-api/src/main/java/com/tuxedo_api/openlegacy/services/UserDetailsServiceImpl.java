package com.tuxedo_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.tuxedo_sdk.openlegacy.Getuserdetails;
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
 *  Can be tested by invoking the test UserDetailsServiceTest.
 *  The interface UserDetailsService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "UserDetails")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getUserDetails", entities = {
            @EntityMapping(alias="getuserdetails", entity=com.tuxedo_sdk.openlegacy.Getuserdetails.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "getuserdetails.id3", expression = "id3")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "getuserdetails", expression = "getuserdetails")})
    public UserDetailsOut getUserDetails(UserDetailsIn userDetailsIn) throws Exception {
        UserDetailsOut userDetailsOut = new UserDetailsOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession tuxedoSdkSession = applicationContext.getBean("tuxedoSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Getuserdetails getuserdetails = serviceBinder.bindInputs(this, "getUserDetails", "getuserdetails", new Getuserdetails(), userDetailsIn);
            getuserdetails = tuxedoSdkSession.doAction(ActionUtil.getRpcAction(Getuserdetails.class), getuserdetails);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            userDetailsOut = serviceBinder.bindOutput(this, "getUserDetails", userDetailsOut, new String[]{"userDetailsIn", "getuserdetails"}, userDetailsIn, getuserdetails);
            /* autogenerated - output block end */;

            return userDetailsOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            tuxedoSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}