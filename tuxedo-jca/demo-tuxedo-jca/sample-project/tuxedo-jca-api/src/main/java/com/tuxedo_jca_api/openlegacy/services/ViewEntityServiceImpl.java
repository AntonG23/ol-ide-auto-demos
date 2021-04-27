package com.tuxedo_jca_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.tuxedo_jca_sdk.openlegacy.ViewEntity;
import com.tuxedo_jca_sdk.openlegacy.ViewEntityMyviewr;
import com.tuxedo_jca_sdk.openlegacy.ViewEntityMyviews;
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
 *  Can be tested by invoking the test ViewEntityServiceTest.
 *  The interface ViewEntityService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "ViewEntity")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class ViewEntityServiceImpl implements ViewEntityService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getViewEntity", entities = {
            @EntityMapping(alias="viewEntity", entity=com.tuxedo_jca_sdk.openlegacy.ViewEntity.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "viewEntity.myviews.sval", expression = "sval"),
            @BindTo(endpoint = "viewEntity.myviews.lval", expression = "lval"),
            @BindTo(endpoint = "viewEntity.myviews.szStr1", expression = "szStr1")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "myviewr", expression = "viewEntity.myviewr")})
    public ViewEntityOut getViewEntity(ViewEntityIn viewEntityIn) throws Exception {
        ViewEntityOut viewEntityOut = new ViewEntityOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession tuxedoJcaSdkSession = applicationContext.getBean("tuxedoJcaSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            ViewEntity viewEntity = serviceBinder.bindInputs(this, "getViewEntity", "viewEntity", new ViewEntity(), viewEntityIn);
            viewEntity = tuxedoJcaSdkSession.doAction(ActionUtil.getRpcAction(ViewEntity.class), viewEntity);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            viewEntityOut = serviceBinder.bindOutput(this, "getViewEntity", viewEntityOut, new String[]{"viewEntityIn", "viewEntity"}, viewEntityIn, viewEntity);
            /* autogenerated - output block end */;

            return viewEntityOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            tuxedoJcaSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}