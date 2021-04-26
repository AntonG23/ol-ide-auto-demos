package com.kafka_consumer_api.openlegacy.services;


import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.annotations.BusinessEntity;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.oracle_sp_sdk.openlegacy.GetAccountById;
import java.math.BigDecimal;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CustomerService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Customer")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CustomerService {

    public CustomerOut getCustomer(CustomerIn customerIn) throws Exception;

    @Getter
    @Setter
    @BusinessEntity
    public static class CustomerIn implements org.openlegacy.core.rpc.RpcEntity {
        
        BigDecimal accId;

        @NotNull
        @Override
        public JsonObject toJsonObject() {
            return CustomerInEntityHelper.toJson(this);
        }

        @Override
        public void populateFromJson(@NotNull JsonObject jsonObject) {
           CustomerInEntityHelper.populateFromJson(jsonObject, this);
        }

        @NotNull
        @Override
        public RpcEntityDefinition entityDefinition() {
            return CustomerInEntityHelper.entityDefinition;
        }

        @NotNull
        @Override
        public RpcEntityDefinition inputEntityDefinition() {
            return CustomerInEntityHelper.inputEntityDefinition;
        }

        @NotNull
        @Override
        public RpcEntityDefinition outputEntityDefinition() {
            return CustomerInEntityHelper.outputEntityDefinition;
        }
    }
    
    @Getter
    @Setter
    @BusinessEntity
    public static class CustomerOut implements org.openlegacy.core.rpc.RpcEntity {
        
        GetAccountById getAccountById;

        @NotNull
        @Override
        public JsonObject toJsonObject() {
            return CustomerOutEntityHelper.toJson(this);
        }

        @Override
        public void populateFromJson(@NotNull JsonObject jsonObject) {
            CustomerOutEntityHelper.populateFromJson(jsonObject, this);
        }

        @NotNull
        @Override
        public RpcEntityDefinition entityDefinition() {
            return CustomerOutEntityHelper.entityDefinition;
        }

        @NotNull
        @Override
        public RpcEntityDefinition inputEntityDefinition() {
            return CustomerOutEntityHelper.inputEntityDefinition;
        }

        @NotNull
        @Override
        public RpcEntityDefinition outputEntityDefinition() {
            return CustomerOutEntityHelper.outputEntityDefinition;
        }
    }
}
