import java.util.*;
import java.io.*;
public class WordCount {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter '1' to input text manually or '2' to provide a file:");
				int choice = scanner.nextInt();
				scanner.nextLine(); 
				
				
				String text = "";
				if (choice == 1) {
				    System.out.println("Enter the text:");
				    text = scanner.nextLine();
				} else if (choice == 2) {
				    System.out.println("Enter the file name:");
				    String fileName = scanner.nextLine();
				    try {
				        text = readFile(fileName);
				    } catch (IOException e) {
				        System.out.println("Error reading the file: " + e.getMessage());
				        return;
				    }
				} else {
				    System.out.println("Invalid choice.");
				    return;
				}
				
				String[] words = text.split("[\\s\\p{Punct}]+");
				
				int wordCount = words.length;
				System.out.println("Total word count: " + wordCount);
			}
	    }
	    
	    public static String readFile(String fileName) throws IOException {
	        StringBuilder content = new StringBuilder();
	        BufferedReader reader = new BufferedReader(new FileReader(fileName));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            content.append(line).append("\n");
	        }
	        reader.close();
	        return content.toString();
	    }
	}
