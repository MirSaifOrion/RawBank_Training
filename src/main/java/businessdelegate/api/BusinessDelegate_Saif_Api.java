package main.java.businessdelegate.api;

import com.dbp.core.api.BusinessDelegate;
import com.kony.dbp.exception.ApplicationException;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.dataobject.Result;

public interface BusinessDelegate_Saif_Api extends BusinessDelegate {
    Result getJsonSaif(DataControllerRequest dataControllerRequest) throws ApplicationException;

}
