package com.oracle_sp_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import org.openlegacy.core.db.DBConst;
import org.openlegacy.core.storedproc.RefCursorDescriptor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="GetAccountById", language=Languages.PLSQL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "DEMO.BANK_EXAMPLE.GET_ACCOUNT_BY_ID", displayName = "Execute", alias = "execute" )            })
public class GetAccountById implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "2")
    })
    @RpcField(length = 22, direction = Direction.INPUT, originalName = "ACC_ID")
    @RpcNumericField()
    private BigDecimal accId;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "12"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "STATUS_CODE")
    private String statusCode;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE_NAME, value = "DEMO.ACCOUNT_OBJ"),
            @Attribute(key = DBConst.TYPE, value = "2002"),
            @Attribute(key = DBConst.USE_TYPE_NAME, value = "true"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCOUNT")
    private AccountObj account;

    @Getter
    @Setter
    @RpcPart
    public static class AccountObj {

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "2")
        })
        @RpcField(direction = Direction.OUTPUT, originalName = "ACCOUNT_ID")
        @RpcNumericField()
        private BigDecimal accountId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 50, direction = Direction.OUTPUT, originalName = "ACCOUNT_NUMBER")
        private String accountNumber;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 50, direction = Direction.OUTPUT, originalName = "FULL_NAME")
        private String fullName;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 50, direction = Direction.OUTPUT, originalName = "EMAIL")
        private String email;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 50, direction = Direction.OUTPUT, originalName = "IBAN")
        private String iban;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 50, direction = Direction.OUTPUT, originalName = "CREDIT_CARD_TYPE")
        private String creditCardType;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 50, direction = Direction.OUTPUT, originalName = "ACC_CURRENCY_CODE")
        private String accCurrencyCode;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "2")
        })
        @RpcField(direction = Direction.OUTPUT, originalName = "BALANCE")
        @RpcNumericField()
        private BigDecimal balance;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "93")
        })
        @RpcField(direction = Direction.OUTPUT, originalName = "CREATTION_DATE")
        @RpcDateField(pattern="yyyy-MM-dd hh:mm:ss")
        private Timestamp creattionDate;
    }

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return GetAccountByIdEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return GetAccountByIdEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return GetAccountByIdEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return GetAccountByIdEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        GetAccountByIdEntityHelper.populateFromJson(jsonObject, this);
    }

}

