package com.as400_pcml_rpc_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.as400_pcml_rpc_sdk.openlegacy.Getcst;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CustomerService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Customer")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CustomerService {

    public CustomerOut getCustomer(CustomerIn customerIn) throws Exception;

    @Getter
    @Setter
    public static class CustomerIn {
        
        String customerid;

    }
    
    @Schema(name = "CustomerOut", description = "")
    @Getter
    @Setter
    public static class CustomerOut {
        
        @Schema(description = "Getcst")
        Getcst getcst;
    }
}
