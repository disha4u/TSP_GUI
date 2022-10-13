import java.util.ArrayList;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
	   DataFetch df=new DataFetch();
	   String fpath="Data/Asymmetric_Data/rbg017.2.tw.txt";
	   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	   System.out.println("Enter File Path");
	   fpath=myObj.nextLine();
	   
	   ArrayList<String> data=df.dataFetch(fpath);
	   if (data.size()==0)
		   return;
	   String path="";
	   GUI gui=new GUI();
	   if (fpath.contains("Symmetric")) {
		   SymmetricDataParse dp= new SymmetricDataParse();
	   Graph g=dp.dataParse(data);
	   path=g.caluculateTSP();
	   ArrayList<City> cities=dp.dataCities(data);
	   //System.out.println(path);
	  
	   gui.plotPoints(cities);
	   }
	   else {
		   AsymmetricDataParse dp= new AsymmetricDataParse();
		   Graph g=dp.dataParse(data);
		   path=g.caluculateTSP();
	   }
	   //System.out.println(path);
	   gui.displayPath(path);
   }
}
