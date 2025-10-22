package main.java.preprocessor;

import com.konylabs.middleware.common.DataPreProcessor2;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.controller.DataControllerResponse;
import com.konylabs.middleware.dataobject.Dataset;
import com.konylabs.middleware.dataobject.Param;
import com.konylabs.middleware.dataobject.Record;
import com.konylabs.middleware.dataobject.Result;

import java.util.HashMap;

public class TestPreProcessorSaif implements DataPreProcessor2 {
    @Override
    public boolean execute(HashMap hashMap, DataControllerRequest dataControllerRequest, DataControllerResponse dataControllerResponse, Result result) throws Exception {
        String day = dataControllerRequest.getParameter("day");
        if (day.equalsIgnoreCase("1")) {
            return true;
        } else {
            Param param = new Param();
            param.setName("Pre Processor");
            param.setValue("Request Rejected by Pre Processor");

            Record record = new Record();
            record.setId("record");
            record.addParam(param);

            Dataset dataset = new Dataset();
            dataset.setId("PreProcessorDataset");

            dataset.addRecord(record);

            result.addDataset(dataset);
            return false;
        }
    }
}