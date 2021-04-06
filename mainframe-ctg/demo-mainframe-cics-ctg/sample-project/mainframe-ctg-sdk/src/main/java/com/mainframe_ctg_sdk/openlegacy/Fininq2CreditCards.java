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
public class Fininq2CreditCards {

    @RpcField(length = 16, originalName = "CARD-NUMBER", legacyType = MainFrameLegacyTypes.Char.class)
    private String cardNumber;

    @RpcField(length = 16, originalName = "CARD-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String cardType;

    @RpcField(length = 2, originalName = "CARD-LIMIT", legacyType = MainFrameLegacyTypes.BinaryBigEndian.class)
    @RpcNumericField(minimumValue = -9999, maximumValue = 9999, decimalPlaces = 0)
    private Integer cardLimit;

    @RpcField(length = 2, originalName = "CARD-USAGE", legacyType = MainFrameLegacyTypes.BinaryBigEndian.class)
    @RpcNumericField(minimumValue = -9999, maximumValue = 9999, decimalPlaces = 0)
    private Integer cardUsage;
}

