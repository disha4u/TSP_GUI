import java.util.ArrayList;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
	   DataFetch df=new DataFetch();
	   String fpath="Data/Asymmetric_Data/rbg017.2.tw.txt";
	   //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	   //System.out.println("Enter File Path");
	   //fpath=myObj.nextLine();
	   
	   ArrayList<String> data=df.dataFetch(fpath);
	   String path="";
	   GUI gui=new GUI();
	   if (fpath.contains("Symmetric")) {
		   SymmetricDataParse dp= new SymmetricDataParse();
	   Graph g=dp.data_parse(data);
	   path=g.CaluculateTSP();
	   ArrayList<City> cities=dp.data_cities(data);
	   //System.out.println(path);
	  
	   gui.PlotPoints(cities);
	   }
	   else {
		   AsymmetricDataParse dp= new AsymmetricDataParse();
		   Graph g=dp.data_parse(data);
		   path=g.CaluculateTSP();
	   }
	   //System.out.println(path);
	   gui.DisplayPath(path);
   }
}
