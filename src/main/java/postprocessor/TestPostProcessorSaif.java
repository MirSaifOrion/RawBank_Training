package main.java.postprocessor;

import com.konylabs.middleware.common.DataPostProcessor2;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.controller.DataControllerResponse;
import com.konylabs.middleware.dataobject.Dataset;
import com.konylabs.middleware.dataobject.Param;
import com.konylabs.middleware.dataobject.Result;

public class TestPostProcessorSaif implements DataPostProcessor2 {
    @Override
    public Object execute(Result result, DataControllerRequest dataControllerRequest, DataControllerResponse dataControllerResponse) throws Exception {

        result.addParam("Dataset Count", String.valueOf(result.getAllDatasets().size()));
        result.addParam("1st Dataset Records Count", String.valueOf(result.getDatasetById("Employee").getAllRecords().size()));

        Param param = new Param();
        param.setName("Post Processor");
        param.setValue("Response Modified by Post Processor");

        result.getAllDatasets().get(0).getAllRecords().get(0).addParam(param);

        result.getDatasetById("Employee").getAllRecords().get(0).getParam("address").setValue("Modified Address by Post Processor");

        return result;
    }
}