package com.tuxedo_jca_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.tuxedo_jca_sdk.openlegacy.FmlEntity;
import com.tuxedo_jca_sdk.openlegacy.FmlEntityMyviewb;
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
 *  The interface FmlEntityService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "FmlEntity")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class FmlEntityServiceImpl implements FmlEntityService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getFmlEntity", entities = {
            @EntityMapping(alias="fmlEntity", entity=com.tuxedo_jca_sdk.openlegacy.FmlEntity.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "fmlEntity.lval10", expression = "lval10"),
            @BindTo(endpoint = "fmlEntity.lval11", expression = "lval11"),
            @BindTo(endpoint = "fmlEntity.myView", expression = "myView")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "myView", expression = "fmlEntity.myView")})
    public FmlEntityOut getFmlEntity(FmlEntityIn fmlEntityIn) throws Exception {
        FmlEntityOut fmlEntityOut = new FmlEntityOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession tuxedoJcaSdkSession = applicationContext.getBean("tuxedoJcaSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            FmlEntity fmlEntity = serviceBinder.bindInputs(this, "getFmlEntity", "fmlEntity", new FmlEntity(), fmlEntityIn);
            fmlEntity = tuxedoJcaSdkSession.doAction(ActionUtil.getRpcAction(FmlEntity.class), fmlEntity);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            fmlEntityOut = serviceBinder.bindOutput(this, "getFmlEntity", fmlEntityOut, new String[]{"fmlEntityIn", "fmlEntity"}, fmlEntityIn, fmlEntity);
            /* autogenerated - output block end */;

            return fmlEntityOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            tuxedoJcaSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
