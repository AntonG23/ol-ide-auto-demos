package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.ConfigureSDCurrentAccountService;
import com.cics_account_api.openlegacy.services.ConfigureSDCurrentAccountService.*;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import com.cics_account_api.openlegacy.Body;
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "configure")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ConfigureSDCurrentAccountController {

    @Autowired
    private ConfigureSDCurrentAccountService configureSDCurrentAccountService;
    
    @PutMapping(path = "/{sd-reference-id}/configuration", consumes = {"*/*"}, produces = {"application/json"})
    @Operation(summary = "Update an active SDCurrentAccount session configuration", description =  "Update an active SDCurrentAccount session configuration", tags = { "configure" }, operationId = "configureSDCurrentAccount", 
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful Service Configuration", content = @Content(schema = @Schema(implementation = Response200.class)))
    })
    public Response200 configureSDCurrentAccount(@PathVariable(name = "sd-reference-id") @NotNull @Parameter(name = "sd-reference-id", description = "SDCurrentAccount Servicing Session Reference", required = true) String sdReferenceId,
            @Valid @RequestBody() @Parameter(name = "body", description = "SDCurrentAccount Configure Request Payload", required = true) Body body) throws Exception {
        ConfigureSDCurrentAccountIn configureSDCurrentAccountIn = new ConfigureSDCurrentAccountIn();
        configureSDCurrentAccountIn.setSdReferenceId(sdReferenceId);
        configureSDCurrentAccountIn.setBody(body);
        ConfigureSDCurrentAccountOut configureSDCurrentAccountOut = configureSDCurrentAccountService.configureSDCurrentAccount(configureSDCurrentAccountIn);
        return configureSDCurrentAccountOut.getResponse200();
    }
}
