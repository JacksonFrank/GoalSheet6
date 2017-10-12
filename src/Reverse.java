/*
 Jackson Frank
 File: Reverse.java
 Purpose: To reverse the order of lines and the words in the line of a file
 */
import java.io.*;
import java.util.*;

public class Reverse {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("File Reverser!");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		String fileName = "src/";
		System.out.print("File name: ");
		fileName += console.next();
		console.close();
		
		System.out.println();
		
		Scanner file = new Scanner(new File(fileName));
		
		ArrayList<String> line = new ArrayList<String>(); 
		
		while(file.hasNextLine()) {
			line.add(file.nextLine());
		}
		file.close();
		
		for(int i = 0; i < line.size(); i++) {
			ArrayList<String> word = new ArrayList<String>();
			Scanner LReader = new Scanner(line.get(i));
			while(LReader.hasNext()) {
				word.add(LReader.next());
			}
			Collections.reverse(word);
			line.set(i, String.join(" ", word));
			LReader.close();
		}
		Collections.reverse(line);
		for(int i = 0; i < line.size(); i ++) {
			System.out.println(line.get(i));
		}
	}

}
