import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AsymmetricDataParse implements DataParse{

	public Graph data_parse(ArrayList<String> data) {
		String pattern = "[0-9]+";
		Pattern r = Pattern.compile(pattern);
		String dim_s=data.get(3);
		Matcher m = r.matcher(dim_s);
		
		Double[][] d;
		int num_nodes=0;
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
		
		
		return g;
		
	}
}
