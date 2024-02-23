package src;

import java.util.Collections;

import src.WriteResult.WriteResultStatus;

//import edu.softwareeng.sample.WriteResult.WriteResultStatus;

public class DataStoreImpl implements DataStore {

	@Override
	public WriteResult appendSingleResult(OutputConfig output, String result) {
		/* 
		 * Using lambda syntax to create an instance of WriteResult. This is an alternative to the ComputeResult approach of providing
		 * constants for success/failure.
		 */
		return () -> WriteResultStatus.FAILURE; 
	}

	@Override
	public Iterable<Integer> read(InputConfig input, int i) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'read'");
	}

}
