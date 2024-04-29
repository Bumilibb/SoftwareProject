package request;

import dataStorage.OutputConfig;
import userInterface.InputConfig;

public interface ComputeRequest {
	InputConfig getInputConfig();
	OutputConfig getOutputConfig();
	char getDelimeter();
}
