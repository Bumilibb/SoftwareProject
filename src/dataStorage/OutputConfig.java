
package dataStorage;
public interface OutputConfig {

	interface OutputConfigVisitor {
		void visitFile(FileOutputConfig fileOutputConfig);
	}
	
	static void visitOutputConfig(OutputConfig config, OutputConfigVisitor visitor) {
		if (config instanceof FileOutputConfig) {
			visitor.visitFile((FileOutputConfig) config);
		} else {
			throw new RuntimeException("Unexpected config type: " + config.getClass());
		}
	}
}