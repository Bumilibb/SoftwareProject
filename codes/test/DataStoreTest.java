package test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.DataStore;
import src.DataStoreImpl;
import src.InputConfig;
import src.OutputConfig;
import src.WriteResult.WriteResultStatus;

import java.util.Arrays;
import java.util.List;
//import edu.softwareeng.sample.WriteResult.WriteResultStatus;

/*
 * In this case, I've split out the smoke tests into two tests, one per method. It's also fine to consolidate
 * these into a single test
 */
public class DataStoreTest {

	@Test
	public void smokeTestRead() {
		// While there aren't any dependencies for this component, we can mock out the parameters
		InputConfig inputConfig = Mockito.mock(InputConfig.class);
		
		DataStore dataStore = new DataStoreImpl();
		// Use iterable to list for assertion
		List<Integer> expected = Arrays.asList(1, 2, 3); // Expected output
		Iterable<Integer> actual = dataStore.read(inputConfig, 10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void smokeTestWrite() {
		OutputConfig outputConfig = Mockito.mock(OutputConfig.class);
		
		DataStore dataStore = new DataStoreImpl();

		 Assert.assertEquals(WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result").getStatus());
	}
}
