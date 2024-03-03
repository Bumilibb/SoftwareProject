package src;

public class CoordinatorCompute implements ComputationCoordinator {

    private final DataStorageAPI dataStorage;
    private final ComputeEngineAPI computeEngine;
    
    public CoordinatorCompute(DataStorageAPI dataStorage, ComputeEngine computeEngine2) {
        this.dataStorage = dataStorage;
        this.computeEngine = computeEngine2;
    }
    
    @Override
    public ComputeResult compute(ComputeRequest request) {
		try {
			Iterable<Integer> integers = dataStorage.read(request.getinput());
			for (int val : integers) {
				dataStorage.appendSingleResult(request.getoutput(),
						computeEngine.compute(val), request.getDelimiter());
			}
			return ComputeResult.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ComputeResult.FAILURE;
		}
	}
}