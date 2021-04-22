package com.tuxedo_sdk.openlegacy;

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
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="Getuserdetails", displayName="Getuserdetails", language=Languages.JOLT)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "GETUSERDETAILS", displayName = "Execute", alias = "execute" )            })
public class Getuserdetails implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ID3", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcNumericField(minimumValue = -2147483648, maximumValue = 2147483647, decimalPlaces = 0)
    private Integer id3;

    @RpcField(direction = Direction.OUTPUT, originalName = "ADDRESS3", legacyType = TuxedoLegacyTypes.TuxedoString.class)
    private String address3;

    @RpcField(direction = Direction.OUTPUT, originalName = "NAME3", legacyType = TuxedoLegacyTypes.TuxedoCarray.class)
    private String name3;

    @RpcField(direction = Direction.OUTPUT, originalName = "AGE3", legacyType = TuxedoLegacyTypes.TuxedoFloat.class)
    @RpcNumericField(minimumValue = -340282346638528860000000000000000000000f, maximumValue = 340282346638528860000000000000000000000f, decimalPlaces = 0)
    private Float age3;

    @RpcField(direction = Direction.OUTPUT, originalName = "CURRENCY3", legacyType = TuxedoLegacyTypes.TuxedoDouble.class)
    @RpcNumericField(minimumValue = -340282346638528860000000000000000000000D, maximumValue = 340282346638528860000000000000000000000D, decimalPlaces = 0)
    private Double currency3;

    @RpcField(direction = Direction.OUTPUT, originalName = "YEAR3", legacyType = TuxedoLegacyTypes.TuxedoShort.class)
    @RpcNumericField(minimumValue = -32768, maximumValue = 32767, decimalPlaces = 0)
    private Short year3;

    @RpcField(direction = Direction.OUTPUT, originalName = "CHILDREN3", legacyType = TuxedoLegacyTypes.TuxedoByte.class)
    @RpcNumericField(minimumValue = -128, maximumValue = 127, decimalPlaces = 0)
    private Byte children3;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return GetuserdetailsEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return GetuserdetailsEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return GetuserdetailsEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return GetuserdetailsEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        GetuserdetailsEntityHelper.populateFromJson(jsonObject, this);
    }

}

