package src;

public class ComputeEngineImpl implements ComputeEngine, ComputationCoordinator {

	@Override
	public String compute(int value) {
		return "";
	}

	@Override
	public ComputeResult compute(ComputeRequest request) {
		@SuppressWarnings("unused")
		DataStoreImpl dataStore = new DataStoreImpl();
		@SuppressWarnings("unused")
		InputConfig inputConfig = request.getInputConfig();
		return null;
	}

}
