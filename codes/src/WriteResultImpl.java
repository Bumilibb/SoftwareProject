package src;

public class WriteResultImpl implements WriteResult{
    private WriteResultStatus status;
    
    public WriteResultImpl(WriteResultStatus status) {
        this.status = status;
    }
    
    public WriteResultStatus getStatus() {
        return status;
    }
}
