import java.util.*;

/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */
public class Graph {
	   private double[][] G;
	   private String path="";
	   /*
	    *  Creates a Graph Matrix with given length
	    * @param takes in the size of square Matrix
	   */
	   Graph(int val) {
		   G=new double[val][val];
	   }
	   /*
	    * inputs the value at given position in the matrix
	    * @param row  the Row number where the value needs to be inserted
	    * @param column  the Column number where the value needs to be inserted
	    * @param val the value to be inserted at a given row and column
	    */
	   public void addEdge(int row, int column ,double val) {
		   G[row][column]=val;
	   }
	   /*
	    * Calculates the Traveling Salesperson Path between the nodes and edges
	    */
	public String  caluculateTSP()
	{
		int sum = 0;
		int counter = 0;
		int j = 0, i = 0;
		double min=Double.MAX_VALUE;
		List<Integer> visitedNodesList= new ArrayList<>();

		visitedNodesList.add(0);
		int[] route = new int[this.G.length];
		while (i < this.G.length && j < this.G[i].length) {
			if (counter >= this.G[i].length - 1) {
				break;
			}

			if (j != i && !(visitedNodesList.contains(j))) {
				if (this.G[i][j] < min) {
					min = this.G[i][j];
					route[counter] = j + 1;
				}
			}
			j++;
			if (j == this.G[i].length) {
				sum += min;
				visitedNodesList.add(route[counter] - 1);
				min = Integer.MAX_VALUE;
				j = 0;
				i = route[counter] - 1;
				counter++;
			}
		}

		i = route[counter - 1] - 1;

		for (j = 0; j < this.G.length; j++) {

			if ((i != j) && this.G[i][j] < min) {
				min = this.G[i][j];
				
				route[counter] = j + 1;
				
			}
		}
		sum += min;


		for( i=0;i<visitedNodesList.size();i++)
		{
			path+="City"+visitedNodesList.get(i)+"-";
		}
		path=path.substring(0,path.length()-1);
		path+="\n"+"Minimum Cost is : "+sum;
		return path;
	}
	/*
	 * @return A String containing the Traveling Salesperson Path 
	 */
	public String getTSPString()
	{
		return this.path;
	}


}

