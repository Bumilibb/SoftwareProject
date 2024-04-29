package request;

import datastorage.OutputConfig;
import userinterface.InputConfig;

public interface ComputeRequest {
	InputConfig getInputConfig();
	OutputConfig getOutputConfig();

	char getDelimiter();

	String getInput();

	char getDelimeter();

	String getOutput();
}
