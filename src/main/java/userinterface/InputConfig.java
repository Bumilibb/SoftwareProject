 package userinterface;

public interface InputConfig {
    

	// Use generics to allow callers to specify a return type when they visit the input data
    interface InputConfigVisitor<T> {
		T visitFile(userinterface.FileInputConfig fileInputConfig);
	}
	
	static <T> T visitInputConfig(InputConfig config, InputConfigVisitor<T> visitor) {
		if (config instanceof FileInputConfig) {
			return visitor.visitFile((FileInputConfig) config);
		}
		throw new RuntimeException("Unexpected config type: " + config.getClass());
	}
}
