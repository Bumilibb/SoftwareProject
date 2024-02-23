
package src;

public interface DataStore {
	Iterable<Integer> read(InputConfig input, int i);
	WriteResult appendSingleResult(OutputConfig output, String result);
}
