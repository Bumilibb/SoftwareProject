import java.util.ArrayList;
import java.util.List;

public class TestComputeEngine implements ComputeEngineInterface {
    private DataStorageAPI dataStorage; //or DataStorageInterface 
    private UserAPI userAPI; // UserInterface

    public testComputeEngine(DataStorageAPI dataStorage) {
        this.dataStorage = dataStorage;
    }
    
    public void setUserAPI(UserAPI userAPI) {
        this.userAPI = userAPI;
    }

    @Override
    public void initializeJob() {
        // Empty
    }

    @Override
    public void readInput(List<Integer> input) {
        // Empty
    }

    @Override
    public List<List<Integer>> writeOutput() {
        //Empty 
        return new ArrayList<List<Integer>>();
    }

    @Override
    public void performComputation() {
        // Empty
    }
}