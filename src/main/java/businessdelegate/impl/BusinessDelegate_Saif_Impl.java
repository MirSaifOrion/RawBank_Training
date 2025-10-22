package main.java.businessdelegate.impl;

import com.dbp.core.api.factory.impl.DBPAPIAbstractFactoryImpl;
import com.kony.dbp.exception.ApplicationException;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.dataobject.Result;
import main.java.backenddelegate.api.BackendDelegate_Saif_Api;
import main.java.businessdelegate.api.BusinessDelegate_Saif_Api;

public class BusinessDelegate_Saif_Impl implements BusinessDelegate_Saif_Api {
    @Override
    public Result getJsonSaif(DataControllerRequest dataControllerRequest) throws ApplicationException {
        BackendDelegate_Saif_Api backend = DBPAPIAbstractFactoryImpl.getBackendDelegate(BackendDelegate_Saif_Api.class);
        Result result = backend.getJsonSaif(dataControllerRequest);
        result.addParam("business delegate layer", "called Successfully");
        return result;
    }
}
