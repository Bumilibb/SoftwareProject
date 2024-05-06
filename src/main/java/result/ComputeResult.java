package result;

public interface ComputeResult {
	ComputeResult SUCCESS = () -> Status.SUCCESS;
	ComputeResult FAIL = () -> Status.FAILURE;
	ComputeResult Not = () -> Status.NOT_AN_INTEGER;
	Status getStatus();
	
	enum Status {
		SUCCESS,
		FAILURE,
		NOT_AN_INTEGER
    }
}
