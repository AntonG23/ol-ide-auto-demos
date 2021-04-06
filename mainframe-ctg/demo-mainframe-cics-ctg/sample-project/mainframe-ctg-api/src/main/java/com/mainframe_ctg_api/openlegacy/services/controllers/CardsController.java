package com.mainframe_ctg_api.openlegacy.services.controllers;

import com.mainframe_ctg_api.openlegacy.services.CardsService;
import com.mainframe_ctg_api.openlegacy.services.CardsService.*;

import com.mainframe_ctg_sdk.openlegacy.Fininq2;
import com.mainframe_ctg_sdk.openlegacy.Fininq2CreditCards;
import com.mainframe_ctg_sdk.openlegacy.Fininq2Dfhcommarea;
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
@RequestMapping(path = "/api/cards", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Cards")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class CardsController {

    @Autowired
    private CardsService cardsService;

    @PostMapping
    @Operation(summary = "Cards GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CardsOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public CardsOut getCards(@RequestBody CardsIn cardsIn) throws Exception {
        return cardsService.getCards(cardsIn);
    }
}
