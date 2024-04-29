package datastoragetests;

import datastorage.DataStorageAPI;
import datastorage.DataStore;
import datastorage.OutputConfig;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import userinterface.InputConfig;

import java.util.Arrays;
import java.util.List;

public class TestDataStorageAPI extends DataStorageAPI {
	@Test
	public void smokeTestRead() {
		// While there aren't any dependencies for this component, we can mock out the parameters
		InputConfig inputConfig = Mockito.mock(InputConfig.class);

		DataStore dataStore = new DataStorageAPI();
		// Use iterable to list for assertion
		List<Integer> expected = Arrays.asList(1, 2, 3); // Expected output
		Iterable<Integer> actual = dataStore.read(inputConfig);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void smokeTestWrite() {
		OutputConfig outputConfig = Mockito.mock(OutputConfig.class);
		
		DataStore dataStore = new DataStorageAPI();

		 Assert.assertEquals(WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result", 'A').getStatus());
	}
}