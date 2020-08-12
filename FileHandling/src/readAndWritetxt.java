import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class readAndWritetxt {

	public static void main(String[] args) {
	// .txt , .doc, .docx, --> Kind of file extension .txt -->
	//go to that file path --> Open file and start reading --> line by line
		String sPath = "C:\\Users\\hanuma\\Google Drive\\Srinidhi session code\\FileHandling\\test.txt";
		String sPathToWrite = "C:\\Users\\hanuma\\Google Drive\\Srinidhi session code\\FileHandling\\testWrite10.txt";
		//readTextFile(sPath);
		writeTextFile(sPathToWrite);
	}

	private static void writeTextFile(String sPath) {
		try {
		FileWriter fw = new FileWriter(sPath,true);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Hi");
		br.write("\nThis is Srinidhi here");
		br.newLine();
		br.write("This is Srinidhi here");
		br.close(); 
		}catch (Exception a) {
			System.out.println(a);
		}
	
		
		System.out.println("Success");
	}

	private static void readTextFile(String sPath) {
		
		String sLine;  
		try {
		FileReader fr = new FileReader(sPath);
		BufferedReader br = new BufferedReader(fr);
		//sLine =br.readLine();
		while((sLine=br.readLine())!= null){
			System.out.println(sLine);
			if(sLine.contains("Srinidhi")) {
				System.out.println("I Found");
			}
			
		}
		// Assignment :: Srinidhi place i want you guys to replace to vinod
		br.close();
		}catch (Exception a) {
			System.out.println(a);
		}
		
		
	}

}
