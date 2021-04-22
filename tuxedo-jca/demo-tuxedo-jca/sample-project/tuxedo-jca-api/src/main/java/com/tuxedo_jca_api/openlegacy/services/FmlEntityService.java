package com.tuxedo_jca_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.tuxedo_jca_sdk.openlegacy.FmlEntity;
import com.tuxedo_jca_sdk.openlegacy.FmlEntityMyviewb;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface FmlEntityService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "FmlEntity")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface FmlEntityService {

    public FmlEntityOut getFmlEntity(FmlEntityIn fmlEntityIn) throws Exception;

    @Getter
    @Setter
    public static class FmlEntityIn {
        
        Integer lval10;
        
        Integer lval11;
        
        FmlEntityMyviewb myView;

    }
    
    @Schema(name = "FmlEntityOut", description = "")
    @Getter
    @Setter
    public static class FmlEntityOut {
        
        @Schema(description = "Fml Entity Myviewb")
        FmlEntityMyviewb myView;
    }
}
