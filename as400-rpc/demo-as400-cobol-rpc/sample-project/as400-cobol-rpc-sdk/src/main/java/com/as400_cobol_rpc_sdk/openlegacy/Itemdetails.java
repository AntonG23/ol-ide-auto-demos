package com.as400_cobol_rpc_sdk.openlegacy;

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
@RpcEntity(name="Itemdetails", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "/QSYS.LIB/RMR2L1.LIB/FULLDETAIL.PGM", displayName = "Execute", alias = "execute" )            })
public class Itemdetails implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(length = 8, originalName = "ITEM-NUM", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99999999, decimalPlaces = 0)
    private Integer itemNum;

    @RpcField(originalName = "ITEM-RECORD", displayName = "ITEMRECORD")
    private ItemdetailsItemRecord itemRecord;

    @RpcField(originalName = "SHIPPING", displayName = "Shipping")
    private ItemdetailsShipping shipping;



    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return ItemdetailsEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return ItemdetailsEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return ItemdetailsEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return ItemdetailsEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        ItemdetailsEntityHelper.populateFromJson(jsonObject, this);
    }

}

