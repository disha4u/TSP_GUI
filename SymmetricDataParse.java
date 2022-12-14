import java.lang.Math; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */
public class SymmetricDataParse implements DataParse{
	
	private Double[][] d;
	private int num_nodes=0;
	
	/*
	 * Creates graph data structure by parsing the raw data
	 * @param raw data read from file
	 * @return graph data structure
	*/
	public Graph dataParse(ArrayList<String> data) {
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
		}
		
		Graph g=new Graph(num_nodes);
		if(g.getG()==null)
			return null;
			
		for(int i=0;i<num_nodes;i++) {
			for(int j=0;j<num_nodes;j++) {
				double dist=calc_dist(d[i][0],d[i][1],d[j][0],d[j][1]);
				g.addEdge(i, j, dist);
			}
	    }
		return g;	
	}
	
	/*
	 * Creates a list of cities by parsing the raw data
	 * @param raw data read from file
	 * @return list of cities
	*/
	public ArrayList<City> dataCities(ArrayList<String> data){
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
			City c=new City(d[i][0],d[i][1]);
			cities.add(c);
		}
		return cities;
	}
	
	/*
	 * Calculated Euclidean distance between 2 cities
	 * @param x,y coordinates of the 2 cities between which the distance has to calculated
	 */
	public double calc_dist(double x1,double y1,double x2,double y2) {
		return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
	}
	
}
