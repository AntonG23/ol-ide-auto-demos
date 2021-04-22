package com.tuxedo_jca_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.TuxedoLegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.tuxedo.TuxedoConst;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class FmlEntityMyviewb {

    @RpcField(originalName = "I", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcNumericField(decimalPlaces = 0)
    private Integer i;

    @RpcField(originalName = "i", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcList(count = 10)
    @RpcNumericField(decimalPlaces = 0)
    private List<Integer> i1;

    @RpcField(length = 128, originalName = "s", legacyType = TuxedoLegacyTypes.TuxedoString.class)
    private String s;
}

