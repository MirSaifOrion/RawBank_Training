package main.java.mapper;

import com.dbp.core.api.DBPAPIMapper;
import com.dbp.core.api.Resource;
import main.java.resource.api.Resource_Saif_Api;
import main.java.resource.impl.Resource_Saif_Impl;

import java.util.HashMap;
import java.util.Map;

public class ResourceMapperSaif implements DBPAPIMapper<Resource> {
    @Override
    public Map<Class<? extends Resource>, Class<? extends Resource>> getAPIMappings() {
        Map<Class<? extends Resource>, Class<? extends Resource>> map = new HashMap<>();

        map.put(Resource_Saif_Api.class, Resource_Saif_Impl.class);

        return map;
    }
}