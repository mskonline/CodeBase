package tutorial.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOpsDemo {

	private final String file = "W:\\test\\data.txt";

	public static void main(String[] args) {
		new FileOpsDemo();
	}

	public FileOpsDemo(){
		fileOps();
	}

	public void fileOps(){
		File f = new File(file);

		// Check if file exists
		System.out.println(f.exists());


		try {

			if(!f.exists())
				f.createNewFile();
			else
				System.out.println("File exists");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void readStringFromFile(){

	}

	public void readLineByLineFromFile() throws IOException{
		FileInputStream fis = new FileInputStream("sample.txt");

		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		String line = null;

		while ((line = br.readLine()) != null) {

		}

		br.close();
	}
}
