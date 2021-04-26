package com.as400_cobol_rpc_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.as400_cobol_rpc_sdk.openlegacy.Itemdetails;
import com.as400_cobol_rpc_sdk.openlegacy.ItemdetailsItemRecord;
import com.as400_cobol_rpc_sdk.openlegacy.ItemdetailsShipping;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ItemDetailsService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ItemDetails")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ItemDetailsService {

    public ItemDetailsOut getItemDetails(ItemDetailsIn itemDetailsIn) throws Exception;

    @Getter
    @Setter
    public static class ItemDetailsIn {
        
        Integer itemNumber;

    }
    
    @Schema(name = "ItemDetailsOut", description = "")
    @Getter
    @Setter
    public static class ItemDetailsOut {
        
        @Schema(description = "Itemdetails")
        Itemdetails itemdetails;
    }
}
