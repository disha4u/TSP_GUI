import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   DataFetch df=new DataFetch();
	   String fpath="Data/Asymmetric_Data/rbg017.2.tw.txt";
	   Scanner myObj = new Scanner(System.in); 
	   System.out.println("Enter File Path");
	   fpath=myObj.nextLine();
	   
	   ArrayList<String> data=df.dataFetch(fpath);
	   if (data.size()==0) {
		   myObj.close();
		   return;
	   }
	   String path="";
	   GUI gui=new GUI();
	   if (fpath.contains("Symmetric")) {
		   SymmetricDataParse dp= new SymmetricDataParse();
		   Graph g=dp.dataParse(data);
		   path=g.caluculateTSP();
		   ArrayList<City> cities=dp.dataCities(data);
		   gui.plotPoints(cities);
	   }
	   else {
		   AsymmetricDataParse adp= new AsymmetricDataParse();
		   Graph g=adp.dataParse(data);
		   path=g.caluculateTSP();
	   }
	   gui.displayPath(path);
	   myObj.close();
   }
}