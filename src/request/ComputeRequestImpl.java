package request;

public class ComputeRequestImpl implements ComputeRequest{

    private final InputConfig inputConfig;
    private final char delimiter;

    public ComputeRequestImpl(InputConfig inputConfig, char delimiter) {
        this.inputConfig = inputConfig;
        this.delimiter = delimiter;
    }

    @Override
    public InputConfig getInputConfig() {
         return this.inputConfig;
    }

    @Override
    public char getDelimiter() {
        return this.delimiter;
    }
    @Override
	public String getInput() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public char getDelimeter() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String getOutput() {
		// TODO Auto-generated method stub
		return null;
	}
	
}