import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AsymmetricDataParse implements DataParse{

	public Graph data_parse(ArrayList<String> data) {
		String pattern = "[0-9]+";
		Pattern r = Pattern.compile(pattern);
		String dim_s=data.get(3);
		Matcher m = r.matcher(dim_s);
		
		
		int num_nodes=0;
		if (m.find())
		    num_nodes=Integer.parseInt(m.group(0));
        
		Graph g=new Graph(num_nodes);
		
		Double val=0.0;
		for(int i=0;i<num_nodes;i++) {
			String s=data.get(i+num_nodes+8);
			m=r.matcher(s);
			int j=0;
			while (m.find()) {
				
				val=Double.parseDouble(m.group());
				if (val<0) {
					val=Double.MAX_VALUE;
				}
				g.addedge(i, j, val);
				j+=1;
			}
			
			//System.out.printf("%.5f %.5f \n",d[i][0],d[i][1]);
		}
		
		
		
		
		return g;
		
	}
}
