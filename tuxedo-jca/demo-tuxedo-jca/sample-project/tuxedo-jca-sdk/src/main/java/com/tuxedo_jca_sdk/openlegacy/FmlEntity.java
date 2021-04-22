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
@RpcEntity(name="FmlEntity")
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "TOUPPERVIEW3", displayName = "Execute", alias = "execute", actionProperties = {
                @ActionProperty(name = "tuxedo.buffer.type", value = "FML32" )
     }
 )            })
public class FmlEntity implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "20001")
    })
    @RpcField(originalName = "SVAL1", legacyType = TuxedoLegacyTypes.TuxedoShort.class)
    @RpcNumericField(decimalPlaces = 0)
    private Short sval1;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "20002")
    })
    @RpcField(originalName = "SVAL2", legacyType = TuxedoLegacyTypes.TuxedoShort.class)
    @RpcNumericField(decimalPlaces = 0)
    private Short sval2;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "33574435")
    })
    @RpcField(originalName = "LVAL1", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcNumericField(decimalPlaces = 0)
    private Integer lval1;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "33574436")
    })
    @RpcField(originalName = "LVAL2", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcList(count = 10)
    @RpcNumericField(decimalPlaces = 0)
    private List<Integer> lval2;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "33574437")
    })
    @RpcField(originalName = "LVAL3", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcNumericField(decimalPlaces = 0)
    private Integer lval3;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "167792166")
    })
    @RpcField(originalName = "MYSTR1", legacyType = TuxedoLegacyTypes.TuxedoString.class)
    private String mystr1;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "167792167")
    })
    @RpcField(originalName = "MYSTR2", legacyType = TuxedoLegacyTypes.TuxedoString.class)
    private String mystr2;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "20008")
    })
    @RpcField(originalName = "O_SVAL1", legacyType = TuxedoLegacyTypes.TuxedoShort.class)
    @RpcNumericField(decimalPlaces = 0)
    private Short osval1;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "20009")
    })
    @RpcField(originalName = "O_SVAL2", legacyType = TuxedoLegacyTypes.TuxedoShort.class)
    @RpcNumericField(decimalPlaces = 0)
    private Short osval2;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "33574442")
    })
    @RpcField(originalName = "O_LVAL1", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcNumericField(decimalPlaces = 0)
    private Integer olval1;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "33574443")
    })
    @RpcField(originalName = "O_LVAL2", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcList(count = 10)
    @RpcNumericField(decimalPlaces = 0)
    private List<Integer> olval2;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "167792172")
    })
    @RpcField(originalName = "O_MYSTR10", legacyType = TuxedoLegacyTypes.TuxedoString.class)
    @RpcList(count = 10)
    private List<String> omystr10;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "20020")
    })
    @RpcField(originalName = "SVAL10", legacyType = TuxedoLegacyTypes.TuxedoShort.class)
    @RpcNumericField(decimalPlaces = 0)
    private Short sval10;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "33574453")
    })
    @RpcField(originalName = "LVAL10", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcNumericField(decimalPlaces = 0)
    private Integer lval10;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "33574454")
    })
    @RpcField(originalName = "LVAL11", legacyType = TuxedoLegacyTypes.TuxedoInteger.class)
    @RpcNumericField(decimalPlaces = 0)
    private Integer lval11;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "167792183")
    })
    @RpcField(originalName = "MYSTR10", legacyType = TuxedoLegacyTypes.TuxedoString.class)
    private String mystr10;

    @FieldAttributes(attributes = {
            @Attribute(key = TuxedoConst.BUFFER_TYPE, value = "VIEW32"),
            @Attribute(key = TuxedoConst.INPUT_VIEW_NAME, value = "MYVIEWB"),
            @Attribute(key = TuxedoConst.FML_FIELD_ID, value = "369118852")
    })
    @RpcField(originalName = "MY_VIEW")
    private FmlEntityMyviewb myView;


    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return FmlEntityEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return FmlEntityEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return FmlEntityEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return FmlEntityEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        FmlEntityEntityHelper.populateFromJson(jsonObject, this);
    }

}

