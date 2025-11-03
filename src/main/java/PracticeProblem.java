import java.io.*;
public class PracticeProblem {	
public static String getName(int line, String file) {
	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String currentLine;
		int current = 1;

		while ((currentLine = br.readLine()) != null) {
			if (current == line) {
				String[] parts = currentLine.split(" ");
				br.close();
				return parts[0] + " " + parts[1];
			}
			current++;
		}
		br.close();
	} catch(IOException e) {
		System.out.println(e);
		}
		return "";
}
public static int getAge(int line, String file) {
	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String currentLine;
		int current = 1;

		while ((currentLine = br.readLine()) != null) {
			if (current == line) {
				String[] parts = currentLine.split(" ");
				br.close();
				return Integer.parseInt(parts[2]);
			}
			current++;
		}
		br.close();
	} catch(IOException | NumberFormatException e) {
		System.out.println(e);
	}
	return -1;
}
public static int getNumber (int line, String file) {
	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String currentLine;
		int current = 1;

		while ((currentLine = br.readLine()) != null) {
			if (current == line) {
				String[] parts = currentLine.split(" ");
				br.close();
				return Integer.parseInt(parts[3]);
			}
			current++;
		}
		br.close();
	} catch (IOException | NumberFormatException e) {
		System.out.println(e);
	}
	return -1;
}
public static void filleAppend(String output, String filename) {
	try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
		bw.write(output);
		bw.newLine();
		bw.close();
	} catch (IOException e) {
		System.out.println(e);
	}
}
}
