package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountFulfillmentArrangementInterestService;
import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountFulfillmentArrangementInterestService.*;

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
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "retrieve")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class RetrieveCurrentAccountFulfillmentArrangementInterestController {

    @Autowired
    private RetrieveCurrentAccountFulfillmentArrangementInterestService retrieveCurrentAccountFulfillmentArrangementInterestService;
    
    @GetMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{cr-reference-id}/interest/{bq-reference-id}/", produces = {"application/json"})
    @Operation(summary = "Invoke a reporting action to obtain a Interest instance related report.", description =  "Retrieve details of an interest transaction applied internally to the account .The retrieve operation can have sub qualifiers beyond BQ level, please reffer to the model heriarchy to extend beyond BQ level into APIs retrieving sub-qualifier level information.", tags = { "retrieve" }, operationId = "retrieveCurrentAccountFulfillmentArrangementInterest", 
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully  Retrieved Interest Instance Record", content = @Content(schema = @Schema(implementation = Response200.class)))
    })
    public Response200 retrieveCurrentAccountFulfillmentArrangementInterest(@PathVariable(name = "sd-reference-id") @NotNull @Parameter(name = "sd-reference-id", description = "Current Account Servicing Session Reference", required = true) String sdReferenceId,
            @PathVariable(name = "cr-reference-id") @NotNull @Parameter(name = "cr-reference-id", description = "Current Account Fulfillment Arrangement Instance Reference", required = true) String crReferenceId,
            @PathVariable(name = "bq-reference-id") @NotNull @Parameter(name = "bq-reference-id", description = "Interest Instance Reference", required = true) String bqReferenceId,
            @RequestParam(name = "queryparams", required = false) @Parameter(name = "queryparams", description = "Query params from schema '#/definitions/BQInterestRetrieveInputModel'") String queryparams) throws Exception {
        RetrieveCurrentAccountFulfillmentArrangementInterestIn retrieveCurrentAccountFulfillmentArrangementInterestIn = new RetrieveCurrentAccountFulfillmentArrangementInterestIn();
        retrieveCurrentAccountFulfillmentArrangementInterestIn.setSdReferenceId(sdReferenceId);
        retrieveCurrentAccountFulfillmentArrangementInterestIn.setCrReferenceId(crReferenceId);
        retrieveCurrentAccountFulfillmentArrangementInterestIn.setBqReferenceId(bqReferenceId);
        retrieveCurrentAccountFulfillmentArrangementInterestIn.setQueryparams(queryparams);
        RetrieveCurrentAccountFulfillmentArrangementInterestOut retrieveCurrentAccountFulfillmentArrangementInterestOut = retrieveCurrentAccountFulfillmentArrangementInterestService.retrieveCurrentAccountFulfillmentArrangementInterest(retrieveCurrentAccountFulfillmentArrangementInterestIn);
        return retrieveCurrentAccountFulfillmentArrangementInterestOut.getResponse200();
    }
}
