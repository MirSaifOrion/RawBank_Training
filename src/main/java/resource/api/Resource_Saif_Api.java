package main.java.resource.api;

import com.dbp.core.api.Resource;
import com.kony.dbp.exception.ApplicationException;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.dataobject.Result;

public interface Resource_Saif_Api extends Resource {
    Result getJsonSaif(DataControllerRequest dataControllerRequest) throws ApplicationException;
}