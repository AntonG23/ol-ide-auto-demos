package com.mainframe_ims_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.mainframe_ims_sdk.openlegacy.Phonebookrecord;
import com.mainframe_ims_sdk.openlegacy.PhonebookrecordPhonebookrecordInput;
import com.mainframe_ims_sdk.openlegacy.PhonebookrecordPhonebookrecordOutput;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CustomerDetailsService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "CustomerDetails")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CustomerDetailsService {

    public CustomerDetailsOut getCustomerDetails(CustomerDetailsIn customerDetailsIn) throws Exception;

    @Getter
    @Setter
    public static class CustomerDetailsIn {
        
        String inCommand;
        
        String inLastName;

    }
    
    @Schema(name = "CustomerDetailsOut", description = "")
    @Getter
    @Setter
    public static class CustomerDetailsOut {
        
        @Schema(description = "Phonebookrecord Phonebookrecord Output")
        PhonebookrecordPhonebookrecordOutput phonebookrecordOutput;
    }
}
