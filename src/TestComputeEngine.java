
import java.util.ArrayList;
import java.util.List;
public class TestComputeEngine implements ComputeEngineAPI {
    private DataStorageAPI dataStorage; 

    public TestComputeEngine(DataStorageAPI dataStorage) {
        this.dataStorage = dataStorage;
    }

    @Override
    public void initializeJob() {
        // This method will be used to initialize computation jobs
    }

    @Override
    public void readInput(List<Integer> input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readInput'");
    }

    @Override
    public List<List<Integer>> writeOutput() {
        // This method will write the computation results to the data storage
        return new ArrayList<>();
    }
    
    @Override
    public void preformComputation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preformComputation'");
    }
}
