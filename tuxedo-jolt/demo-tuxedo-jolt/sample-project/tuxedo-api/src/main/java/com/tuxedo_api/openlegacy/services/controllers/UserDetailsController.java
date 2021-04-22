package com.tuxedo_api.openlegacy.services.controllers;

import com.tuxedo_api.openlegacy.services.UserDetailsService;
import com.tuxedo_api.openlegacy.services.UserDetailsService.*;

import com.tuxedo_sdk.openlegacy.Getuserdetails;
import org.openlegacy.core.rpc.RpcSession;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = "/api/userdetails", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "UserDetails")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping
    @Operation(summary = "UserDetails GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = UserDetailsOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public UserDetailsOut getUserDetails(@RequestBody UserDetailsIn userDetailsIn) throws Exception {
        return userDetailsService.getUserDetails(userDetailsIn);
    }
}
