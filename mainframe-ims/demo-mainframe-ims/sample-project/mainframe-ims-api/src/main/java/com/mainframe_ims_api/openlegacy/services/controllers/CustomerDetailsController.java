package com.mainframe_ims_api.openlegacy.services.controllers;

import com.mainframe_ims_api.openlegacy.services.CustomerDetailsService;
import com.mainframe_ims_api.openlegacy.services.CustomerDetailsService.*;

import com.mainframe_ims_sdk.openlegacy.Phonebookrecord;
import com.mainframe_ims_sdk.openlegacy.PhonebookrecordPhonebookrecordInput;
import com.mainframe_ims_sdk.openlegacy.PhonebookrecordPhonebookrecordOutput;
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
@RequestMapping(path = "/api/customerdetails", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "CustomerDetails")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class CustomerDetailsController {

    @Autowired
    private CustomerDetailsService customerDetailsService;

    @PostMapping
    @Operation(summary = "CustomerDetails GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CustomerDetailsOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public CustomerDetailsOut getCustomerDetails(@RequestBody CustomerDetailsIn customerDetailsIn) throws Exception {
        return customerDetailsService.getCustomerDetails(customerDetailsIn);
    }
}
