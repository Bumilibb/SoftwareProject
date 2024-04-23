package result;

public interface ComputeResult {
	ComputeResult SUCCESS = () -> Status.SUCCESS;
	ComputeResult FAILURE = () -> Status.FAILURE;

	Status getStatus();
	
	enum Status {
		SUCCESS,
		FAILURE,
		NOT_AN_INTEGER
    }
}
