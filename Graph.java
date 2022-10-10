// Java program for the above approach
import java.util.*;


public class Graph {
	   private double[][] G;
	  
	   public void Graph(int val) {
		   G=new double[val][val];
	   }
	   public void addedge(int i, int j,double val) {
		   G[i][j]=val;
	   }
	   


	// Function to find the minimum
	// cost path for all the paths
	public String  CaluculateTSP(int[][] tsp)
	{
		int sum = 0;
		int counter = 0;
		int j = 0, i = 0;
		int min = Integer.MAX_VALUE;
		List<Integer> visitedRouteList
			= new ArrayList<>();
		List<String> Results=new ArrayList<String>();

		// Starting from the 0th indexed
		// city i.e., the first city
		visitedRouteList.add(0);
		int[] route = new int[tsp.length];

		// Traverse the adjacency
		// matrix tsp[][]
		while (i < tsp.length
			&& j < tsp[i].length) {

			// Corner of the Matrix
			if (counter >= tsp[i].length - 1) {
				break;
			}

			// If this path is unvisited then
			// and if the cost is less then
			// update the cost
			if (j != i
				&& !(visitedRouteList.contains(j))) {
				if (tsp[i][j] < min) {
					min = tsp[i][j];
					route[counter] = j + 1;
				}
			}
			j++;

			// Check all paths from the
			// ith indexed city
			if (j == tsp[i].length) {
				sum += min;
				
				
				
				visitedRouteList.add(route[counter] - 1);
				Results.add("City"+i+" - City"+(route[counter] - 1)+" "+min);
				min = Integer.MAX_VALUE;
				j = 0;
				i = route[counter] - 1;
				counter++;
			}
		}

		// Update the ending city in array
		// from city which was last visited
		i = route[counter - 1] - 1;

		for (j = 0; j < tsp.length; j++) {

			if ((i != j) && tsp[i][j] < min) {
				min = tsp[i][j];
				
				route[counter] = j + 1;
				Results.add("City"+i+" - City"+j+" "+min);
				//System.out.println(i+" "+j+" "+min);
			}
		}
		sum += min;

		// Started from the node where
		// we finished as well.
		Results.add("Minimum Cost is : "+sum);
		//System.out.print("Minimum Cost is : ");
		//System.out.println(sum);
		String res="";
		for( i=0;i<Results.size();i++)
		{
			res+=Results.get(i)+"\n";
		}
		return res;
	}


}
