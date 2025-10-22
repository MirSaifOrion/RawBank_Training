package main.java.resource.impl;

import com.dbp.core.api.factory.impl.DBPAPIAbstractFactoryImpl;
import com.kony.dbp.exception.ApplicationException;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.dataobject.Result;
import main.java.businessdelegate.api.BusinessDelegate_Saif_Api;
import main.java.resource.api.Resource_Saif_Api;

public class Resource_Saif_Impl implements Resource_Saif_Api {

    @Override
    public Result getJsonSaif(DataControllerRequest dataControllerRequest) throws ApplicationException {

        BusinessDelegate_Saif_Api delegate = DBPAPIAbstractFactoryImpl.getBusinessDelegate(BusinessDelegate_Saif_Api.class);
        Result result = delegate.getJsonSaif(dataControllerRequest);
        result.addParam("resource layer", "called Successfully");
        return result;
    }
}