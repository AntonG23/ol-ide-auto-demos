package com.as400_pcml_rpc_api.openlegacy.services.controllers;

import com.as400_pcml_rpc_api.openlegacy.services.CustomerService;
import com.as400_pcml_rpc_api.openlegacy.services.CustomerService.*;

import com.as400_pcml_rpc_sdk.openlegacy.Getcst;
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
@RequestMapping(path = "/api/customer", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Customer")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @Operation(summary = "Customer GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CustomerOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public CustomerOut getCustomer(@RequestBody CustomerIn customerIn) throws Exception {
        return customerService.getCustomer(customerIn);
    }
}
