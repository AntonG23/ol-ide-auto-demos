package com.tuxedo_jca_api.openlegacy.services.controllers;

import com.tuxedo_jca_api.openlegacy.services.ViewEntityService;
import com.tuxedo_jca_api.openlegacy.services.ViewEntityService.*;

import com.tuxedo_jca_sdk.openlegacy.ViewEntity;
import com.tuxedo_jca_sdk.openlegacy.ViewEntityMyviewr;
import com.tuxedo_jca_sdk.openlegacy.ViewEntityMyviews;
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
@RequestMapping(path = "/api/viewentity", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ViewEntity")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ViewEntityController {

    @Autowired
    private ViewEntityService viewEntityService;

    @PostMapping
    @Operation(summary = "ViewEntity GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ViewEntityOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ViewEntityOut getViewEntity(@RequestBody ViewEntityIn viewEntityIn) throws Exception {
        return viewEntityService.getViewEntity(viewEntityIn);
    }
}
