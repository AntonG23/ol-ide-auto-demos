package com.mainframe_ims_api.openlegacy.services.controllers;

import com.mainframe_ims_api.openlegacy.services.CreditCardService;
import com.mainframe_ims_api.openlegacy.services.CreditCardService.*;

import com.mainframe_ims_sdk.openlegacy.Imsfin2;
import com.mainframe_ims_sdk.openlegacy.Imsfin2CreditCards;
import com.mainframe_ims_sdk.openlegacy.Imsfin2Imsfin2Input;
import com.mainframe_ims_sdk.openlegacy.Imsfin2Imsfin2Output;
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
@RequestMapping(path = "/api/creditcard", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "CreditCard")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @PostMapping
    @Operation(summary = "CreditCard GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CreditCardOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public CreditCardOut getCreditCard(@RequestBody CreditCardIn creditCardIn) throws Exception {
        return creditCardService.getCreditCard(creditCardIn);
    }
}
