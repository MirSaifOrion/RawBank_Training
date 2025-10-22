package main.java.service;

import com.dbp.core.api.factory.impl.DBPAPIAbstractFactoryImpl;
import com.konylabs.middleware.common.JavaService2;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.controller.DataControllerResponse;
import main.java.resource.api.Resource_Saif_Api;

public class JavaServiceSaif implements JavaService2 {
    @Override
    public Object invoke(String methodID, Object[] inputArray, DataControllerRequest requestInstance,
                         DataControllerResponse responseInstance) throws Exception {
        return DBPAPIAbstractFactoryImpl.getResource(Resource_Saif_Api.class).getJsonSaif(requestInstance);
    }
}