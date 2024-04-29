
package datastorage;

import result.WriteResult;
import userinterface.InputConfig;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public interface DataStore { //
	static void savePrimeFactors(long number, int[] primeFactors) throws IOException {
		String fileName = "prime_factors_of_" + number + ".txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write("Prime factors of " + number + ": " + primeFactors);
		}
	}

	Iterable<Integer> read(InputConfig input);

	WriteResult appendSingleResult(OutputConfig output, String result, char delimiter);
}