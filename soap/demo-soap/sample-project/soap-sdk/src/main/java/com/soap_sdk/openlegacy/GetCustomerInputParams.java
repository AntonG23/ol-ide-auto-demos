package com.soap_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.soap.SoapConst;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class GetCustomerInputParams {

    @FieldAttributes(attributes = {
            @Attribute(key = SoapConst.PREFIX_ATTRIBUTE, value = "ns_p0")
    })
    @RpcField(direction = Direction.INPUT, originalName = "getCustomerRequest")
    private GetCustomerGetCustomerRequest getCustomerRequest;
}

