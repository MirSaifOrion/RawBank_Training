package main.java.mapper;

import com.dbp.core.api.BusinessDelegate;
import com.dbp.core.api.DBPAPIMapper;
import com.dbp.core.api.Resource;
import main.java.businessdelegate.api.BusinessDelegate_Saif_Api;
import main.java.businessdelegate.impl.BusinessDelegate_Saif_Impl;

import java.util.HashMap;
import java.util.Map;

public class BusinessDelegateMapperSaif implements DBPAPIMapper<BusinessDelegate> {
    @Override
    public Map<Class<? extends BusinessDelegate>, Class<? extends BusinessDelegate>> getAPIMappings() {
        Map<Class<? extends BusinessDelegate>, Class<? extends BusinessDelegate>> map = new HashMap<>();

        map.put(BusinessDelegate_Saif_Api.class, BusinessDelegate_Saif_Impl.class);

        return map;
    }
}
