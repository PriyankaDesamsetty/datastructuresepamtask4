package ds;

import java.util.*;

public class sparseArrays {

	// Complete the matchingStrings function below.
	static int[] matchingStrings(String[] strings, String[] queries) {

		HashMap<String, Integer> h = new HashMap<>();
		int output[] = new int[queries.length];
		for (String string : strings)
			h.put(string, h.getOrDefault(string, 0) + 1);
		int i = 0;
		for (String query : queries)
			output[i++] = h.containsKey(query) ? h.get(query) : 0;

		return output;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int stringsCount = scanner.nextInt();

		String[] strings = new String[stringsCount];

		for (int i = 0; i < stringsCount; i++) {

			strings[i] = scanner.next();
		}

		int queriesCount = scanner.nextInt();

		String[] queries = new String[queriesCount];

		for (int i = 0; i < queriesCount; i++) {

			queries[i] = scanner.next();
		}

		int[] res = matchingStrings(strings, queries);

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

		scanner.close();
	}
}
