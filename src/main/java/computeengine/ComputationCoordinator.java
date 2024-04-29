package computeengine;

import request.ComputeRequest;
import result.ComputeResult;

public interface ComputationCoordinator {
	ComputeResult compute(ComputeRequest request);
}
