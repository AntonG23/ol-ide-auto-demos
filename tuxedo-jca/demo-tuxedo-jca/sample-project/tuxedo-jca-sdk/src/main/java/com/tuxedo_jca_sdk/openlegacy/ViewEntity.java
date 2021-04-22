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
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import org.openlegacy.core.tuxedo.TuxedoConst;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="ViewEntity")
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "TOUPPERVIEW2", displayName = "Execute", alias = "execute", actionProperties = {
                @ActionProperty(name = "tuxedo.buffer.type", value = "VIEW32" ),
                    @ActionProperty(name = "tuxedo.input.view.name", value = "MYVIEWS" ),
                    @ActionProperty(name = "tuxedo.output.view.name", value = "MYVIEWR" )
     }
 )            })
public class ViewEntity implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "MYVIEWS", fieldType = NonStructural.class)
    private ViewEntityMyviews myviews;

    @RpcField(direction = Direction.OUTPUT, originalName = "MYVIEWR", fieldType = NonStructural.class)
    private ViewEntityMyviewr myviewr;



    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return ViewEntityEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return ViewEntityEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return ViewEntityEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return ViewEntityEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        ViewEntityEntityHelper.populateFromJson(jsonObject, this);
    }

}

