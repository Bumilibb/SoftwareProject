package result;
public interface WriteResult {
	WriteResultStatus getStatus();
	
	enum WriteResultStatus {
		SUCCESS,
		FAILURE
    }
}
