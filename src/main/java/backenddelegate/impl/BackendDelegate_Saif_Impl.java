package main.java.backenddelegate.impl;

import com.kony.dbp.exception.ApplicationException;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.dataobject.Result;
import main.java.backenddelegate.api.BackendDelegate_Saif_Api;

public class BackendDelegate_Saif_Impl implements BackendDelegate_Saif_Api {
    @Override
    public Result getJsonSaif(DataControllerRequest dataControllerRequest) throws ApplicationException {
        Result result = new Result();
        result.addParam("backend delegate layer", "called Successfully");
        return result;
    }
}
