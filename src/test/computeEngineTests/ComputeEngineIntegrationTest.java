package computeEngineTests;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import request.ComputeRequest;
import userInterface.FileInputConfig;
import userInterface.InputConfig;


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
		Mockito.when(mockRequestObj.getDelimeter()).thenReturn(','); // Assuming the delimiter is for formatting output
		
	 // Execute the computation
	 int[] actualPrimeFactors = engine.computePrimeFactors(1);
        
	 // Define the expected prime factors for the input number 30
	 int[] expectedPrimeFactors = {2, 3, 5};
		
		  // Verify that the computed prime factors match the expected results
		  Assertions.assertArrayEquals(expectedPrimeFactors, actualPrimeFactors);
	}


}