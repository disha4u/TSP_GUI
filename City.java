
public class City {

	private double xcoordinate;
	private double ycoordinate;
	
	City(double x,double y){
		xcoordinate=x;
		ycoordinate=y;
	}
	
	public void setx(double val) {
		xcoordinate=val;
	}
	public void sety(double val) {
		ycoordinate=val;
	}
	public double getx() {
		return xcoordinate;
	}
	public double gety() {
		return ycoordinate;
	}
}
