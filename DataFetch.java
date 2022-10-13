import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */
public class DataFetch{
	
	/*
	 * Reads file and stores it in a array list
	 * @param filepath where the file exists
	 * @return list of lines from the file
	*/
	public ArrayList<String> dataFetch(String filePath){
		ArrayList<String> data = new ArrayList<String>();
		try {
		      File myObj = new File(filePath);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String line = myReader.nextLine();
		        data.add(line);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("File not found in the specified path : "+filePath);
		    }
		return data;
	}
}
