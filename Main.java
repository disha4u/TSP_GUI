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
	   if (fpath.contains("Symmetric")) {
	   SymmetricDataParse dp= new SymmetricDataParse();
	   Graph g=dp.data_parse(data);
	   String path=g.CaluculateTSP();
	   ArrayList<City> cities=dp.data_cities(data);
	   System.out.println(path);
	   GUI gui=new GUI();
	   gui.PlotPoints(cities);
	   }
	   else {
		   AsymmetricDataParse dp= new AsymmetricDataParse();
		   Graph g=dp.data_parse(data);
		   String path=g.CaluculateTSP();
	   }
	   
   }
}
