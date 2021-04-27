package com.as400_5250_api.openlegacy.services;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.openlegacy.core.annotations.services.BindFrom;
import org.openlegacy.core.annotations.services.BindOutputs;
import org.openlegacy.core.annotations.services.EntityMapping;
import org.openlegacy.core.annotations.services.LogServiceUsage;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.services.ServiceMethod;
import org.openlegacy.core.modules.login.Login;
import org.openlegacy.core.terminal.TerminalSession;
import org.openlegacy.impl.services.ws.ServiceBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.as400_5250_sdk.openlegacy.DisplayJobRunAttributes;

/**
 *  A service implementation which invokes OpenLegacy API, and returns a service output.
 *  The code below should be customize to perform a working scenario which goes through the relevant screens.
 *  Can be tested by invoking the test DisplayJobAttributesServiceTest.
 *  The interface DisplayJobAttributesService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "DisplayJobAttributes")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class DisplayJobAttributesServiceImpl implements DisplayJobAttributesService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getDisplayJobAttributes", entities = {
            @EntityMapping(alias="displayJobRunAttributes", entity=com.as400_5250_sdk.openlegacy.DisplayJobRunAttributes.class)})
    @LogServiceUsage
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "displayJobRunAttributes", expression = "displayJobRunAttributes")})
    public DisplayJobAttributesOut getDisplayJobAttributes() throws Exception {
        DisplayJobAttributesOut displayJobAttributesOut = new DisplayJobAttributesOut();
        /* autogenerated - sessions block start*/
        ;
        TerminalSession as4005250SdkSession = applicationContext.getBean("as4005250SdkSession", TerminalSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
        	as4005250SdkSession.getModule(Login.class).login("OPENLEGA1", "OPENLEGA");
            /* autogenerated - execution block start */;
            DisplayJobRunAttributes displayJobRunAttributes = new DisplayJobRunAttributes();
            displayJobRunAttributes = as4005250SdkSession.getEntity(DisplayJobRunAttributes.class);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            displayJobAttributesOut = serviceBinder.bindOutput(this, "getDisplayJobAttributes", displayJobAttributesOut, new String[]{"displayJobRunAttributes"}, displayJobRunAttributes);
            /* autogenerated - output block end */;

            return displayJobAttributesOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            as4005250SdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}