import java.util.ArrayList;


public class Main {
   public static void main(String[] args) {
	   SymmetricDataFetch obj=new SymmetricDataFetch();
	   ArrayList<City> cities= new ArrayList<City>();
	   obj.dataFetch();
	   Graph g=obj.data_parse(cities);
	   //String path=g.CaluculateTSP();
	   //System.out.println(path);
	   GUI gui=new GUI();
	   gui.PlotPoints(cities);
	   
   }
}
