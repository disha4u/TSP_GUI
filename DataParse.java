import java.util.ArrayList;

/**
 * 
 *@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 * Interface class that has the following methods.
 */
public interface DataParse {
	
	// Parse and Store raw data fetched from the file as a Graph
	public Graph dataParse(ArrayList<String> data);
	
}
