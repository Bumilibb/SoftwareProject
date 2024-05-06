package userinterfacetests;

import computeengine.ComputeEngineImpl;
import request.ComputeRequest;
import request.ComputeRequestImpl;
import result.ComputeResult;
import userinterface.FileInputConfig;
import userinterface.InputConfig;

import java.io.File;

public class TestUser {
    private final ComputeEngineImpl coordinator;

    public TestUser(ComputeEngineImpl coordinator) {
        this.coordinator = coordinator;
    }

    public void run(String outputPath) {
        char delimiter = ';';
        String inputPath = "test" + File.separatorChar + "testInputFile.test";
        InputConfig con = new FileInputConfig(inputPath);

        ComputeRequest request = new ComputeRequestImpl(con,delimiter);
        ComputeResult coResult = coordinator.compute(request);
    }
}
