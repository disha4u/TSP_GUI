import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */
public class DataFetch{
	
	/*
	 * Reads file and stores it in a array list
	 * @param filepath where the file exists
	 * @param List for adding data to
	 * @return if the file has Asymmetric or Symmetric TSP data
	*/
	public Boolean dataFetch(String filePath, ArrayList<String> data){
		Boolean atsp=false;
		try {
		      File myObj = new File(filePath);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String line = myReader.nextLine();
		        data.add(line);
		        String pattern = "TYPE: [a-z,A-Z,.]+";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);
				if (m.find()) {
					String type=m.group().split(" ")[1];
					if(type.startsWith("A"))
						atsp=true;
				}
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("File not found in the specified path : "+filePath);
		    }
		return atsp;
	}
}
