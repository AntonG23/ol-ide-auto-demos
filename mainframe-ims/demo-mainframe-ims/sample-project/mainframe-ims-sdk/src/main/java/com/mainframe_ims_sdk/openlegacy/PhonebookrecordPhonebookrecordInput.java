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
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class PhonebookrecordPhonebookrecordInput {

    @RpcField(length = 2, direction = Direction.INPUT, originalName = "IN-FILLER", legacyType = MainFrameLegacyTypes.Char.class)
    private String inFiller;

    @RpcField(length = 8, direction = Direction.INPUT, originalName = "IN-COMMAND", legacyType = MainFrameLegacyTypes.Char.class)
    private String inCommand;

    @RpcField(length = 10, direction = Direction.INPUT, originalName = "IN-LAST-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String inLastName;

    @RpcField(length = 10, direction = Direction.INPUT, originalName = "IN-FIRST-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String inFirstName;

    @RpcField(length = 10, direction = Direction.INPUT, originalName = "IN-EXTENSION", legacyType = MainFrameLegacyTypes.Char.class)
    private String inExtension;

    @RpcField(length = 7, direction = Direction.INPUT, originalName = "IN-ZIP-CODE", legacyType = MainFrameLegacyTypes.Char.class)
    private String inZipCode;
}

