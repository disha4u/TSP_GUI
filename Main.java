
public class Main {
   public static void main(String[] args) {
	   SymmetricDataFetch obj=new SymmetricDataFetch();
	   obj.dataFetch();
	   Graph g=obj.data_parse();
	   String path=g.CaluculateTSP();
	   System.out.println(path);
   }
}
