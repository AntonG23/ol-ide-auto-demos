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
public class PhonebookrecordPhonebookrecordOutput {

    @RpcField(length = 40, direction = Direction.OUTPUT, originalName = "OUT-MESSAGE", legacyType = MainFrameLegacyTypes.Char.class, defaultValue = " ")
    private String outMessage;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "OUT-COMMAND", legacyType = MainFrameLegacyTypes.Char.class)
    private String outCommand;

    @RpcField(length = 10, direction = Direction.OUTPUT, originalName = "OUT-LAST-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String outLastName;

    @RpcField(length = 10, direction = Direction.OUTPUT, originalName = "OUT-FIRST-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String outFirstName;

    @RpcField(length = 10, direction = Direction.OUTPUT, originalName = "OUT-EXTENSION", legacyType = MainFrameLegacyTypes.Char.class)
    private String outExtension;

    @RpcField(length = 7, direction = Direction.OUTPUT, originalName = "OUT-ZIP-CODE", legacyType = MainFrameLegacyTypes.Char.class)
    private String outZipCode;

    @RpcField(length = 4, direction = Direction.OUTPUT, originalName = "OUT-SEGNO", legacyType = MainFrameLegacyTypes.Char.class, defaultValue = " ")
    private String outSegno;
}

