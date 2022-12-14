import java.util.ArrayList;
import java.util.Scanner;

/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */
public class Main {
	
	/* Takes filepaths from folders Data/Asymmetric and Data/Symmetric and calculates the path for both and plots points for symmetric Data
	 * @args takes in the path of the file
	 * 
	 */
	
   public static void main(String[] args) {
	   DataFetch df=new DataFetch();
	   String fpath="";
	   Scanner myObj = new Scanner(System.in); 
	   System.out.println("Enter File Path");
	   fpath=myObj.nextLine();
	   ArrayList<String> data=new ArrayList<String>();
	   Boolean atsp=df.dataFetch(fpath,data);
	   if (data.size()==0) {
		   myObj.close();
		   return;
	   }
	   String path="";
	   GUI gui=new GUI();
	   Boolean isGnull=true;
	   if (!atsp) {
		   SymmetricDataParse dp= new SymmetricDataParse();
		   Graph g=dp.dataParse(data);
		   if (g!=null) {
			   isGnull=false;
		       path=g.caluculateTSP();
		   }
		   ArrayList<City> cities=dp.dataCities(data);
		   gui.plotPoints(cities);
	   }
	   else {
		   isGnull=false;
		   AsymmetricDataParse adp= new AsymmetricDataParse();
		   Graph g=adp.dataParse(data);
		   path=g.caluculateTSP();
	   }
	   if(!isGnull)
	       gui.displayPath(path);
	   myObj.close();
   }
}