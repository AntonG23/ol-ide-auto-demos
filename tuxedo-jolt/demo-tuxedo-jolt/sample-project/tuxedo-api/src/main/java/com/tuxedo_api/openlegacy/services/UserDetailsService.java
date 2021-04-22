package com.tuxedo_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.tuxedo_sdk.openlegacy.Getuserdetails;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface UserDetailsService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "UserDetails")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface UserDetailsService {

    public UserDetailsOut getUserDetails(UserDetailsIn userDetailsIn) throws Exception;

    @Getter
    @Setter
    public static class UserDetailsIn {
        
        Integer id3;

    }
    
    @Schema(name = "UserDetailsOut", description = "")
    @Getter
    @Setter
    public static class UserDetailsOut {
        
        @Schema(description = "Getuserdetails")
        Getuserdetails getuserdetails;
    }
}
