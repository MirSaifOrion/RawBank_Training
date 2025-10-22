package main.java.backenddelegate.api;

import com.dbp.core.api.BackendDelegate;
import com.kony.dbp.exception.ApplicationException;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.dataobject.Result;

public interface BackendDelegate_Saif_Api extends BackendDelegate {
    Result getJsonSaif(DataControllerRequest dataControllerRequest) throws ApplicationException;
}
