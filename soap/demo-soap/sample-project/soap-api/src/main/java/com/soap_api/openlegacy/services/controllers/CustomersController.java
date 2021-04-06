package com.soap_api.openlegacy.services.controllers;

import com.soap_api.openlegacy.services.CustomersService;
import com.soap_api.openlegacy.services.CustomersService.*;

import com.soap_sdk.openlegacy.GetCustomer;
import com.soap_sdk.openlegacy.GetCustomerAddress;
import com.soap_sdk.openlegacy.GetCustomerCustomer;
import com.soap_sdk.openlegacy.GetCustomerGetCustomerRequest;
import com.soap_sdk.openlegacy.GetCustomerGetCustomerResponse;
import com.soap_sdk.openlegacy.GetCustomerInputParams;
import com.soap_sdk.openlegacy.GetCustomerOutputParams;
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
@RequestMapping(path = "/api/customers", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Customers")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @PostMapping
    @Operation(summary = "Customers GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CustomersOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public CustomersOut getCustomers(@RequestBody CustomersIn customersIn) throws Exception {
        return customersService.getCustomers(customersIn);
    }
}
