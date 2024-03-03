package src;

public class ComputeRequestImpl implements ComputeRequest{

    private int number;
    private char delimiter;
    private String input;
    private String output;

    public ComputeRequestImpl(String input, String output,int number, char delimiter) {
        this.number = number;
        this.delimiter = delimiter;
    }

    @Override
    public int getInputConfig() {
         return this.number;
    }

    @Override
    public char getDelimiter() {
        return this.delimiter;
    }
    
    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    @Override
    public String getinput() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getinput'");
    }

    @Override
    public String getoutput() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getoutput'");
    }
	
}