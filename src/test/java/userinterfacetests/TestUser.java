package userinterfacetests;

import request.ComputeRequest;
import result.ComputeResult;

import java.io.File;

public class TestUser {
    private final CoordinatorImplOuterClass.CoordinatorImpl coordinator;

    public TestUser(CoordinatorImplOuterClass.CoordinatorImpl coordinator) {
        this.coordinator = coordinator;
    }

    public void run(String outputPath) {
        char delimiter = ';';
        String inputPath = "test" + File.separatorChar + "testInputFile.test";

        ComputeRequest request = null;
        ComputeResult coResult = coordinator.compute(request);
    }
}
