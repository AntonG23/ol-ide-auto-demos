package com.tuxedo_jca_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.tuxedo_jca_sdk.openlegacy.ViewEntity;
import com.tuxedo_jca_sdk.openlegacy.ViewEntityMyviewr;
import com.tuxedo_jca_sdk.openlegacy.ViewEntityMyviews;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ViewEntityService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ViewEntity")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ViewEntityService {

    public ViewEntityOut getViewEntity(ViewEntityIn viewEntityIn) throws Exception;

    @Getter
    @Setter
    public static class ViewEntityIn {
        
        Integer sval;
        
        Integer lval;
        
        String szStr1;

    }
    
    @Schema(name = "ViewEntityOut", description = "")
    @Getter
    @Setter
    public static class ViewEntityOut {
        
        @Schema(description = "View Entity Myviewr")
        ViewEntityMyviewr myviewr;
    }
}
