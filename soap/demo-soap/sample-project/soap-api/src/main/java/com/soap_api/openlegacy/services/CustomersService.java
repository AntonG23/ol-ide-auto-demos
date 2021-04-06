package com.soap_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.soap_sdk.openlegacy.GetCustomer;
import com.soap_sdk.openlegacy.GetCustomerAddress;
import com.soap_sdk.openlegacy.GetCustomerCustomer;
import com.soap_sdk.openlegacy.GetCustomerGetCustomerRequest;
import com.soap_sdk.openlegacy.GetCustomerGetCustomerResponse;
import com.soap_sdk.openlegacy.GetCustomerInputParams;
import com.soap_sdk.openlegacy.GetCustomerOutputParams;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CustomersService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Customers")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CustomersService {

    public CustomersOut getCustomers(CustomersIn customersIn) throws Exception;

    @Getter
    @Setter
    public static class CustomersIn {
        
        Long customerId;

    }
    
    @Schema(name = "CustomersOut", description = "")
    @Getter
    @Setter
    public static class CustomersOut {
        
        @Schema(description = "Get Customer Output Params")
        GetCustomerOutputParams outputParams;
    }
}
