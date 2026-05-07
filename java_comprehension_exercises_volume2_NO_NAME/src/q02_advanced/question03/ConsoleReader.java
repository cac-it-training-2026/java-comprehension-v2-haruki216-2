package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputNum() throws IOException, NumberFormatException {
		int input = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(reader.readLine());
		return input;
	}

	public String inputString() throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();

		return input;
	}

}
