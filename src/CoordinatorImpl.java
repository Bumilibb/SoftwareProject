package edu.softwareeng.sample;

public class CoordinatorImpl implements ComputationCoordinator {
	
	private final DataStorage ds;
	private final ComputeEngine ce;
	
	public CoordinatorImpl(DataStorage ds, ComputeEngine ce) {
		this.ds = ds;
		this.ce = ce;
	}

	@Override
	public ComputeResult compute(ComputeRequest request) {
		return ComputeResult.FAILURE;
	}

}
