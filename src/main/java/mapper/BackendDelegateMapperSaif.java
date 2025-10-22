package main.java.mapper;

import com.dbp.core.api.BackendDelegate;
import com.dbp.core.api.DBPAPIMapper;
import main.java.backenddelegate.api.BackendDelegate_Saif_Api;
import main.java.backenddelegate.impl.BackendDelegate_Saif_Impl;

import java.util.HashMap;
import java.util.Map;

public class BackendDelegateMapperSaif implements DBPAPIMapper<BackendDelegate> {
    @Override
    public Map<Class<? extends BackendDelegate>, Class<? extends BackendDelegate>> getAPIMappings() {
        Map<Class<? extends BackendDelegate>, Class<? extends BackendDelegate>> map = new HashMap<>();
        map.put(BackendDelegate_Saif_Api.class, BackendDelegate_Saif_Impl.class);
        return map;
    }
}
