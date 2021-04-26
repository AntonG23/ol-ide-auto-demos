package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountBehaviorQualifierReferenceIdsService;
import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountBehaviorQualifierReferenceIdsService.*;

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
import org.springframework.web.bind.annotation.GetMapping;
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
import java.lang.String;
import java.util.List;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "retrieve")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class RetrieveCurrentAccountBehaviorQualifierReferenceIdsController {

    @Autowired
    private RetrieveCurrentAccountBehaviorQualifierReferenceIdsService retrieveCurrentAccountBehaviorQualifierReferenceIdsService;
    
    @GetMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{cr-reference-id}/{behavior-qualifier}/", produces = {"application/json"})
    @Operation(summary = "Retrieve Behavior Qualifier Reference Ids", tags = { "retrieve" }, operationId = "RetrieveCurrentAccountBehaviorQualifierReferenceIds", 
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful", content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class))))
    })
    public List<String> retrieveCurrentAccountBehaviorQualifierReferenceIds(@PathVariable(name = "sd-reference-id") @NotNull @Parameter(name = "sd-reference-id", description = "Current Account Servicing Session Reference", required = true) String sdReferenceId,
            @PathVariable(name = "cr-reference-id") @NotNull @Parameter(name = "cr-reference-id", description = "Current Account Fulfillment Arrangement Instance Reference", required = true) String crReferenceId,
            @PathVariable(name = "behavior-qualifier") @NotNull @Parameter(name = "behavior-qualifier", description = "Behavior Qualifier Name. ex- IssuedDevice", required = true) String behaviorQualifier,
            @RequestParam(name = "collection-filter", required = false) @Parameter(name = "collection-filter", description = "Filter to refine the result set. ex- IssuedDevice Instance Status = 'pending'") String collectionFilter) throws Exception {
        RetrieveCurrentAccountBehaviorQualifierReferenceIdsIn retrieveCurrentAccountBehaviorQualifierReferenceIdsIn = new RetrieveCurrentAccountBehaviorQualifierReferenceIdsIn();
        retrieveCurrentAccountBehaviorQualifierReferenceIdsIn.setSdReferenceId(sdReferenceId);
        retrieveCurrentAccountBehaviorQualifierReferenceIdsIn.setCrReferenceId(crReferenceId);
        retrieveCurrentAccountBehaviorQualifierReferenceIdsIn.setBehaviorQualifier(behaviorQualifier);
        retrieveCurrentAccountBehaviorQualifierReferenceIdsIn.setCollectionFilter(collectionFilter);
        RetrieveCurrentAccountBehaviorQualifierReferenceIdsOut retrieveCurrentAccountBehaviorQualifierReferenceIdsOut = retrieveCurrentAccountBehaviorQualifierReferenceIdsService.retrieveCurrentAccountBehaviorQualifierReferenceIds(retrieveCurrentAccountBehaviorQualifierReferenceIdsIn);
        return retrieveCurrentAccountBehaviorQualifierReferenceIdsOut.getResponse200();
    }
}
