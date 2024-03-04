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

public class ComputeEngineIntegrationTest {

	/**
	 * 
	 */
	@Test
	public void testComputeWorkflow() {
		
		ComputeEngine engine = new ComputeEngineImpl();
		
		TestDataStore testDs = new TestDataStore();

		InMemoryInputConfig input = new InMemoryInputConfig(1, 10, 25);
		
		InMemoryOutputConfig output = new InMemoryOutputConfig();
		
		// This is the actual object we're testing
		ComputeRequest mockRequest = Mockito.mock(ComputeRequest.class);
		when(mockRequest.getInputConfig()).thenReturn(I);
		//when(mockRequest.getOutputConfig()).thenReturn(output);
		when(mockRequest.getDelimeter()).thenReturn(','); // Assuming the delimiter is for formatting output
		
	 // Execute the computation
	 int[] actualPrimeFactors = engine.computePrimeFactors(1);
        
	 // Define the expected prime factors for the input number 30
	 int[] expectedPrimeFactors = {2, 3, 5};
		
		  // Verify that the computed prime factors match the expected results
		  Assert.assertArrayEquals(expectedPrimeFactors, actualPrimeFactors);
	}
}