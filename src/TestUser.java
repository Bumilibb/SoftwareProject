import java.util.List;

public class TestUser implements UserAPI{ //or UserInterface the naming on it is not clear
    private ComputeEngineInterface computeEngine;

    public TestUser(ComputeEngineInterface computeEngine) {
        this.computeEngine = computeEngine;
    }
    
    @Override
    public void setInputSrc(String src) {
        // Empty
    }

    @Override
    public void setOutputDest(String dest) { //destination
        // Empty
    }

    @Override
    public void setInputDelimeter(String inDeli) {
        // Empty
    }

    @Override
    public void setOutputDelimeter(String outDeli) {
        // Empty
    }

    @Override
    public String executeCompute(List<Integer> l){
        // EMPTY
        return ""; 
    }
}


