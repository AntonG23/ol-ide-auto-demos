package com.mainframe_ctg_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class Fininq2Dfhcommarea {

    @RpcField(length = 10, originalName = "CUST-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String custId;

    @RpcField(originalName = "CREDIT-CARDS", displayName = "CREDITCARDS")
    @RpcList(count = 5)
    private List<Fininq2CreditCards> creditCards;
}

