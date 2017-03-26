package tutorial.io;

import java.io.File;
import java.io.IOException;

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

	public void readLineByLineFromFile(){
		File f = new File(file);
	}
}
