package com.cics_account_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.cics_account_api.openlegacy.Body;
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;

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
 *  The interface UpdateCurrentAccountFulfillmentArrangementIssuedDeviceService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "UpdateCurrentAccountFulfillmentArrangementIssuedDevice")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class UpdateCurrentAccountFulfillmentArrangementIssuedDeviceServiceImpl implements UpdateCurrentAccountFulfillmentArrangementIssuedDeviceService {


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "updateCurrentAccountFulfillmentArrangementIssuedDevice")
    @LogServiceUsage
    @BindInputs(endpoints = {})
    @BindOutputs(endpoints = {})
    public UpdateCurrentAccountFulfillmentArrangementIssuedDeviceOut updateCurrentAccountFulfillmentArrangementIssuedDevice(UpdateCurrentAccountFulfillmentArrangementIssuedDeviceIn updateCurrentAccountFulfillmentArrangementIssuedDeviceIn) throws Exception {
        UpdateCurrentAccountFulfillmentArrangementIssuedDeviceOut updateCurrentAccountFulfillmentArrangementIssuedDeviceOut = new UpdateCurrentAccountFulfillmentArrangementIssuedDeviceOut();
        /* autogenerated - sessions block start*/
        ;
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            updateCurrentAccountFulfillmentArrangementIssuedDeviceOut = serviceBinder.bindOutput(this, "updateCurrentAccountFulfillmentArrangementIssuedDevice", updateCurrentAccountFulfillmentArrangementIssuedDeviceOut, new String[]{"updateCurrentAccountFulfillmentArrangementIssuedDeviceIn"}, updateCurrentAccountFulfillmentArrangementIssuedDeviceIn);
            /* autogenerated - output block end */;

            return updateCurrentAccountFulfillmentArrangementIssuedDeviceOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            /* autogenerated - disconnect block end */
            ;
        }
    }

}