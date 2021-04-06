package com.soap_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import org.openlegacy.core.soap.SoapConst;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="GetCustomer", displayName="Get Customer", language=Languages.WSDL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "/services", displayName = "Execute", alias = "execute", actionProperties = {
                @ActionProperty(name = "soap.methodInputNamespace", value = "http://spring.io/guides/gs-producing-web-service" ),
                    @ActionProperty(name = "soap.methodOutputNamespace", value = "http://spring.io/guides/gs-producing-web-service" ),
                    @ActionProperty(name = "soap.soapAction", value = "" )
     }
 )            })
public class GetCustomer implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "inputParams", fieldType = NonStructural.class)
    private GetCustomerInputParams inputParams;

    @RpcField(direction = Direction.OUTPUT, originalName = "outputParams", fieldType = NonStructural.class)
    private GetCustomerOutputParams outputParams;







    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return GetCustomerEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return GetCustomerEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return GetCustomerEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return GetCustomerEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        GetCustomerEntityHelper.populateFromJson(jsonObject, this);
    }

}

