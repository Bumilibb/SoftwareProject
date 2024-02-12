import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestUser implements UserAPI{ //or UserInterface the naming on it is not clear
    private ComputeEngineAPI computeEngine;

    public TestUser(ComputeEngineAPI computeEngine) {
        this.computeEngine = computeEngine;
    }
    
    @Override
    public void setInputSource(String src) {
        // Empty
    }

    @Override
    public void setOutputSource(String destination) { 
        // Empty
    }

    @Override
    public void setInputDelimiter(String inD) {
        // Empty
    }

    @Override
    public void setOutputDelimiter(String outD) {
        // Empty
    }

    @Override
    public String executeComputation(List<Integer> l) {
        // EMPTY
        return ""; 
    }
    @Test
    public void testUser() {
       
        DataStorageAPI dataStorageMock = mock(DataStorageAPI.class);

            User user = new User(dataStorageMock);

    
        user.testmethod();

      
    }

}


