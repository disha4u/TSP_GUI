import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */
public class AsymmetricDataParse implements DataParse{

	/*
	 * Creates graph data structure by parsing the raw data
	 * @param raw data read from file
	 * @return graph data structure
	*/
	public Graph dataParse(ArrayList<String> data) {
		
		String pattern = "[0-9]+";
		Pattern r = Pattern.compile(pattern);
		String dim_s=data.get(3);
		Matcher m = r.matcher(dim_s);
		
		int num_nodes=0;
		if (m.find())
		    num_nodes=Integer.parseInt(m.group(0));
        
		Graph g=new Graph(num_nodes);
		
		Double val=0.0;
		int i=0,k=0,j=0;
		while(i<num_nodes) {
			String s=data.get(k+7);
			k+=1;
			//stem.out.println(i);
			m=r.matcher(s);
			
			while (m.find()) {
				
				val=Double.parseDouble(m.group());
				if (val==9999) {
					val=Double.MAX_VALUE;
				}
				g.addEdge(i, j, val);
				j+=1;
				
				if (j==num_nodes) {
					j=0;
					i+=1;
				}
						
			}
			
		}
		
		return g;
	}
}
