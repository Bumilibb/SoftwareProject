package userinterfacetests;

import computeengine.ComputeEngineImpl;
import request.ComputeRequest;
import result.ComputeResult;

import java.io.File;

public class TestUser {
    private final ComputeEngineImpl coordinator;

    public TestUser(ComputeEngineImpl coordinator) {
        this.coordinator = coordinator;
    }

    public void run(String outputPath) {
        char delimiter = ';';
        String inputPath = "test" + File.separatorChar + "testInputFile.test";

        ComputeRequest request = null;
        ComputeResult coResult = coordinator.compute(request);
    }
}
