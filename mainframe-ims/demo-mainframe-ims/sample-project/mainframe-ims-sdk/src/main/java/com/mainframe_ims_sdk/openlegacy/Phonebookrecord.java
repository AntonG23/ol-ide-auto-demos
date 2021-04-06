package com.mainframe_ims_sdk.openlegacy;

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
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="Phonebookrecord", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "IVTCB", displayName = "Execute", alias = "execute" )            })
public class Phonebookrecord implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "phonebookrecordInput")
    private PhonebookrecordPhonebookrecordInput phonebookrecordInput;

    @RpcField(direction = Direction.OUTPUT, originalName = "phonebookrecordOutput")
    private PhonebookrecordPhonebookrecordOutput phonebookrecordOutput;



    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return PhonebookrecordEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return PhonebookrecordEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return PhonebookrecordEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return PhonebookrecordEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        PhonebookrecordEntityHelper.populateFromJson(jsonObject, this);
    }

}

