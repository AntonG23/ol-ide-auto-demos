package com.as400_pcml_rpc_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.Jt400LegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="Getcst", language=Languages.PCML)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "/QSYS.LIB/OPENLEGA11.LIB/GETCST.PGM", displayName = "Execute", alias = "execute" )            })
public class Getcst implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(length = 4, direction = Direction.INPUT, originalName = "CUSTOMERID", legacyType = Jt400LegacyTypes.Char.class)
    private String customerid;

    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "FIRSTNAME", legacyType = Jt400LegacyTypes.Char.class)
    private String firstname;

    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "LASTNAME", legacyType = Jt400LegacyTypes.Char.class)
    private String lastname;

    @RpcField(length = 20, direction = Direction.INPUT_OUTPUT, originalName = "ADDRESS", legacyType = Jt400LegacyTypes.Char.class)
    private String address;

    @RpcField(length = 2, direction = Direction.INPUT_OUTPUT, originalName = "CREDIT", legacyType = Jt400LegacyTypes.Char.class)
    private String credit;

    @RpcField(length = 5, direction = Direction.INPUT_OUTPUT, originalName = "DISCOUNT", legacyType = Jt400LegacyTypes.Packed.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 9.9999D, decimalPlaces = 4)
    private Double discount;

    @RpcField(length = 7, direction = Direction.INPUT_OUTPUT, originalName = "BALANCE", legacyType = Jt400LegacyTypes.Packed.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double balance;

    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "PHONE", legacyType = Jt400LegacyTypes.Char.class)
    private String phone;

    @RpcField(length = 10, direction = Direction.INPUT_OUTPUT, originalName = "STATUS", legacyType = Jt400LegacyTypes.Char.class)
    private String status;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return GetcstEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return GetcstEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return GetcstEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return GetcstEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        GetcstEntityHelper.populateFromJson(jsonObject, this);
    }

}

