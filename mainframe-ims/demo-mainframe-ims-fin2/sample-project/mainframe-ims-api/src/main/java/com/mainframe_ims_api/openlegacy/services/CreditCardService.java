package com.mainframe_ims_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.mainframe_ims_sdk.openlegacy.Imsfin2;
import com.mainframe_ims_sdk.openlegacy.Imsfin2CreditCards;
import com.mainframe_ims_sdk.openlegacy.Imsfin2Imsfin2Input;
import com.mainframe_ims_sdk.openlegacy.Imsfin2Imsfin2Output;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CreditCardService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "CreditCard")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CreditCardService {

    public CreditCardOut getCreditCard(CreditCardIn creditCardIn) throws Exception;

    @Getter
    @Setter
    public static class CreditCardIn {
        
        String custId;

    }
    
    @Schema(name = "CreditCardOut", description = "")
    @Getter
    @Setter
    public static class CreditCardOut {
        
        @Schema(description = "Imsfin2Imsfin2Output")
        Imsfin2Imsfin2Output imsfin2Output;
    }
}
