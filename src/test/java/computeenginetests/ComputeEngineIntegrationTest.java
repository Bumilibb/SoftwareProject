package computeenginetests;

import computeengine.ComputeEngine;
import computeengine.ComputeEngineImpl;
import datastoragetests.TestDataStore;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import request.ComputeRequest;
import userinterface.FileInputConfig;
import userinterface.InputConfig;

import static org.junit.jupiter.api.Assertions.*;

public class ComputeEngineIntegrationTest {
    @Test
    public void testComputeWorkflow() {
        FileInputConfig fileinputConfig = new FileInputConfig("path_to_file.txt");
        InputConfig inputConfig = (InputConfig) new FileInputConfig("path_to_file");
        ComputeRequest mockRequestObj = Mockito.mock(ComputeRequest.class);

        TestDataStore testDs = new TestDataStore();

        //InMemoryInputConfig input = new InMemoryInputConfig(1, 10, 25);
        //InMemoryOutputConfig output = new InMemoryOutputConfig();
        // This is the actual object we're testing

        Mockito.when(mockRequestObj.getInputConfig()).thenReturn(inputConfig);
        Mockito.when(mockRequestObj.getInputConfig()).thenReturn(inputConfig);

        //when(mockRequest.getOutputConfig()).thenReturn(output);
        Mockito.when(mockRequestObj.getDelimiter()).thenReturn(','); // Assuming the delimiter is for formatting output

        // Execute the computation
        ComputeEngine engine = new ComputeEngineImpl();
        int[] actualPrimeFactors = engine.computePrimeFactors(30);

        // Define the expected prime factors for the input number 30
        int[] expectedPrimeFactors = {2, 3, 5};

        // Verify that the computed prime factors match the expected results
        Assertions.assertArrayEquals(expectedPrimeFactors, actualPrimeFactors);
    }
}