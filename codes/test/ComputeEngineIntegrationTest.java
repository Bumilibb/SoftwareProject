package test;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.ComputeEngine;
import src.ComputeEngineImpl;
import src.ComputeRequest;
import src.DataStorageAPI;
import src.ComputeResult;
import src.FileInputConfig;

public class ComputeEngineIntegrationTest {

	/**
	 * 
	 */
	@Test
	public void testComputeWorkflow() {
		
		ComputeEngine engine = new ComputeEngineImpl();
		FileInputConfig inputConfig = new FileInputConfig("path_to_file.txt");
        ComputeRequest mockRequestObj = Mockito.mock(ComputeRequest.class);
		TestDataStore testDs = new TestDataStore();

		InMemoryInputConfig input = new InMemoryInputConfig(1, 10, 25);
		
		InMemoryOutputConfig output = new InMemoryOutputConfig();
		
		// This is the actual object we're testing
	
		when(mockRequestObj.getInputConfig()).thenReturn(inputConfig);
		//when(mockRequest.getOutputConfig()).thenReturn(output);
		when(mockRequestObj.getDelimeter()).thenReturn(','); // Assuming the delimiter is for formatting output
		
	 // Execute the computation
	 int[] actualPrimeFactors = engine.computePrimeFactors(1);
        
	 // Define the expected prime factors for the input number 30
	 int[] expectedPrimeFactors = {2, 3, 5};
		
		  // Verify that the computed prime factors match the expected results
		  Assert.assertArrayEquals(expectedPrimeFactors, actualPrimeFactors);
	}
}