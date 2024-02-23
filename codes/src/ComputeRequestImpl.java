package src;

public class ComputeRequestImpl implements ComputeRequest{

    private int number;
    private char delimiter;

    public ComputeRequestImpl(int number, char delimiter) {
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
	
}