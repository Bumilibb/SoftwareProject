package request;

public interface ComputeRequest {
	InputConfig getInputConfig();
	OutputConfig getOutputConfig();
	char getDelimeter();
}
