import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
	
		String sourceFile = "files/lorumipsum.txt"; 
		String copiedFile = "files/copiedFile.txt"; 
		
		try(
				FileReader fReader = new FileReader(sourceFile); 
				BufferedReader bReader = new BufferedReader(fReader); 
				FileWriter writer = new FileWriter(copiedFile)
				
				) {
			while(true) {
				String line = bReader.readLine(); 
				if (line == null ) {
					break; 
				}else { 
					writer.write(line + "\n");
				}
			} 
			System.out.println("File copied");
			} catch(Exception e) {
				e.printStackTrace(); 
			}
	
		}
}

