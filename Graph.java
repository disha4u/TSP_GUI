
public class Graph {
   private double[][] G;
  
   public void Graph(int val) {
	   G=new double[val][val];
   }
   public void addedge(int i, int j,double val) {
	   G[i][j]=val;
   }
   
}
