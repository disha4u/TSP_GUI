import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.lang.Math; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class SymmetricDataParse implements DataParse{
	
	
	Double[][] d;
	int num_nodes=0;
	
	public Graph data_parse(ArrayList<String> data) {
		String pattern = "[0-9]+";
		Pattern r = Pattern.compile(pattern);
		String dim_s=data.get(4);
		Matcher m = r.matcher(dim_s);
		
		
		if (m.find())
		    num_nodes=Integer.parseInt(m.group(0));
        
		d=new Double[num_nodes][2];
		
		
		for(int i=0;i<num_nodes;i++) {
			
			String[] s=data.get(i+7).split(" ",3);
			d[i][0]=Double.parseDouble(s[1]);
			d[i][1]=Double.parseDouble(s[2]);
			//System.out.printf("%.5f %.5f \n",d[i][0],d[i][1]);
		}
		
		Graph g=new Graph(num_nodes);
		
		for(int i=0;i<num_nodes;i++) {
			for(int j=0;j<num_nodes;j++) {
				double dist=calc_dist(d[i][0],d[i][1],d[j][0],d[j][1]);
				g.addedge(i, j, dist);
			}
		}
		return g;
		
	}
	
	public ArrayList<City> data_cities(ArrayList<String> data){
		ArrayList<City> cities= new ArrayList<City>();
		
		String pattern = "[0-9]+";
		Pattern r = Pattern.compile(pattern);
		String dim_s=data.get(4);
		Matcher m = r.matcher(dim_s);
		
		
		if (m.find())
		    num_nodes=Integer.parseInt(m.group(0));
        
		d=new Double[num_nodes][2];
		
		
		for(int i=0;i<num_nodes;i++) {
			
			String[] s=data.get(i+7).split(" ",3);
			d[i][0]=Double.parseDouble(s[1]);
			d[i][1]=Double.parseDouble(s[2]);
			//System.out.printf("%.5f %.5f \n",d[i][0],d[i][1]);
		
			
			
			City c=new City(d[i][0],d[i][1]);
			cities.add(c);
			//System.out.printf("%.5f %.5f \n",d[i][0],d[i][1]);
		}
		return cities;
	}
	
	public double calc_dist(double x1,double y1,double x2,double y2) {
		return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
	}
	
}
