package computeengine;

import io.grpc.stub.StreamObserver;

import java.util.Arrays;

public class CoordinatorImpl extends ComputationCoordinatorGrpc.ComputationCoordinatorImplBase {

	private final ComputeEngineImpl computeEngineImpl;

	public CoordinatorImpl(ComputeEngineImpl computeEngineImpl) {
		this.computeEngineImpl = computeEngineImpl;
	}
	@Override
	public void initializeComputation(CoordinatorImplOuterClass.ProcessSourceRequest request, StreamObserver<CoordinatorImplOuterClass.ComputationOutcome> responseObserver) {
		try {
			int number = Integer.parseInt(request.getSourceFile()); // Assuming the number is passed as a string
			int[] factors = computeEngineImpl.computePrimeFactors(number);

			// Format the factors as a string
			String result = Arrays.toString(factors);

			// Here you would typically save the result to data storage and return the path to the saved data
			// For simplicity, we're just returning the result directly
			CoordinatorImplOuterClass.ComputationOutcome outcome = CoordinatorImplOuterClass.ComputationOutcome.newBuilder()
					.setCompletedSuccessfully(true)
					.setFeedbackMessage("Computation completed successfully.")
					.setComputationDetails("Prime factors: " + result)
					.build();

			responseObserver.onNext(outcome); //
			responseObserver.onCompleted();
		} catch (NumberFormatException e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void initializeComputationWithCustomDelimiter(CoordinatorImplOuterClass.ProcessWithDelimiterRequest request, StreamObserver<CoordinatorImplOuterClass.ComputationOutcome> responseObserver) {
		// Implement computation with custom delimiter here
		CoordinatorImplOuterClass.ComputationOutcome outcome = CoordinatorImplOuterClass.ComputationOutcome.newBuilder()
				.setCompletedSuccessfully(true)
				.setFeedbackMessage("Computation with custom delimiter initialized successfully.")
				.setComputationDetails("Details of the computation with custom delimiter.")
				.build();
		responseObserver.onNext(outcome);
		responseObserver.onCompleted();
	}

	@Override
	public void assignSource(CoordinatorImplOuterClass.ProcessSourceRequest request, StreamObserver<CoordinatorImplOuterClass.SourceAssignmentResponse> responseObserver) {
		// Implement source assignment logic here
		CoordinatorImplOuterClass.SourceAssignmentResponse response = CoordinatorImplOuterClass.SourceAssignmentResponse.newBuilder()
				.setAssignedFilePath("Path to the assigned file")
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
