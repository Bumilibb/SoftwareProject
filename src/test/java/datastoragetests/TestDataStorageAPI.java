package datastoragetests;

import datastorage.DataStore;
import datastorage.OutputConfig;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import result.WriteResult;
import userinterface.InputConfig;

import java.util.Arrays;
import java.util.List;

public class TestDataStorageAPI {
	@Test
	public void smokeTestRead() {
		// While there aren't any dependencies for this component, we can mock out the parameters
		InputConfig inputConfig = Mockito.mock(InputConfig.class);

		// TODO instantiating a TestDataStore because the actual implementation of DataStore is MIA
		// Fix this test after it is found/created
		DataStore dataStore = new TestDataStore();
		// Use iterable to list for assertion
		List<Integer> expected = Arrays.asList(1, 2, 3); // Expected output
		Iterable<Integer> actual = dataStore.read(inputConfig);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void smokeTestWrite() {
		OutputConfig outputConfig = Mockito.mock(OutputConfig.class);

		// TODO instantiating a TestDataStore because the actual implementation of DataStore is MIA
		// Fix this test after it is found/created
		DataStore dataStore = new TestDataStore();

		 Assert.assertEquals(WriteResult.WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result", 'A').getStatus());
	}
}