package com.mainframe_ctg_api.openlegacy.services;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.mainframe_ctg_sdk.openlegacy.Fininq2;
import com.mainframe_ctg_sdk.openlegacy.Fininq2CreditCards;
import com.mainframe_ctg_sdk.openlegacy.Fininq2Dfhcommarea;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CardsService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Cards")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CardsService {

    public CardsOut getCards(CardsIn cardsIn) throws Exception;

    @Getter
    @Setter
    public static class CardsIn {
        
        String custId;

    }
    
    @Schema(name = "CardsOut", description = "")
    @Getter
    @Setter
    public static class CardsOut {
        
        @Schema(description = "Fininq2Credit Cards")
        List<Fininq2CreditCards> creditCards;
    }
}
