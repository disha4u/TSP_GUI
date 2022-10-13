/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */
public class City {

	private double xcoordinate;
	private double ycoordinate;
	
	City(double x,double y){
		xcoordinate=x;
		ycoordinate=y;
	}
	
	/*
	 * @param value of x coordinate
	 */
	public void setx(double val) {
		xcoordinate=val;
	}
	
	/*
	 * @param value of y coordinate
	 */
	public void sety(double val) {
		ycoordinate=val;
	}
	
	/*
	 * @return value of x coordinate
	 */
	public double getx() {
		return xcoordinate;
	}
	
	/*
	 * @return value of y coordinate
	 */
	public double gety() {
		return ycoordinate;
	}
}
