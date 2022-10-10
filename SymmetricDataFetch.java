import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.lang.Math; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class SymmetricDataFetch  implements DataFetch{
	
	ArrayList<String> data = new ArrayList<String>();
	
	public void dataFetch()
	{
		
		
		try {
		      File myObj = new File("Data/Symmetric_Data/wi29.tsp");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String line = myReader.nextLine();
		        data.add(line);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		//Implementation of Symmetric Data Fetch
		
	}
	public void data_parse() {
		String pattern = "[0-9]+";
		Pattern r = Pattern.compile(pattern);
		String dim_s=data.get(4);
		Matcher m = r.matcher(dim_s);
		int num_nodes=0;
		if (m.find())
		    num_nodes=Integer.parseInt(m.group(0));
        //System.out.println(num_nodes);	
		double[][] d=new double[num_nodes][2];
		Graph obj=new Graph(num_nodes);
		for(int i=0;i<7+num_nodes;i++) {
			
		}
		
		
		
	}
	public double calc_dist(double x1,double y1,double x2,double y2) {
		return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
	}
	
}
