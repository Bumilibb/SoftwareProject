package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataStorageAPI {
	
	public Iterable<Integer> read(String inputFile) throws IOException {
		List<Integer> integers = new ArrayList<>();
		List<String> lines = Files.readAllLines(Paths.get(inputFile));
		for (String line : lines) {
			integers.add(Integer.parseInt(line.trim()));
		}
		return integers;
	}
	
	public void appendSingleResult(String outputFile, Object object, char c) throws IOException {
		String data = object + c;
		Files.write(Paths.get(outputFile), data.getBytes(), java.nio.file.StandardOpenOption.APPEND);
	}
}
