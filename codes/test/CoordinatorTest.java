package test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.ComputationCoordinator;
import src.ComputeEngine;
import src.ComputeRequest;
import src.ComputeResult;
import src.CoordinatorImpl;
import src.DataStore;

public class CoordinatorTest {

	@Test
	public void smokeTest() {
		// mock out the dependencies so that we're just checking the ComputationCoordinator
		DataStore dataStore = Mockito.mock(DataStore.class);
		ComputeEngine computeEngine = Mockito.mock(ComputeEngine.class);
		
		ComputationCoordinator coord = new CoordinatorImpl(dataStore, computeEngine);
		
		
		ComputeRequest mockRequest = Mockito.mock(ComputeRequest.class);
		ComputeResult result = coord.compute(mockRequest);
		
		Assert.assertEquals(result.getStatus(), ComputeResult.Status.SUCCESS);
	}
}
