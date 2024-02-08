import java.util.List;

public class TestUser implements UserAPI{
    private computeEngineInterface computeEngine;

    public TestUser(computeEngineInterface computeEngine) {
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
    public void setInputDelimeter(String InDeli) {
        // Empty
    }

    @Override
    public void setOutputDelimeter(String OutDeli) {
        // Empty
    }

    @Override
    public void String executeCompute(List<Integer> 1){
        // EMPTY
        return ""; 
    }
}


