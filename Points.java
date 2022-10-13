
import java.awt.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Random;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.math.*;
public class Points extends JPanel {

	private ArrayList<City> cities;
	Points(ArrayList<City> cities)
	{
		this.cities=cities;
	}
 
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(Color.red);
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
    Dimension size = getSize();
 
    double xmax=-1;
    double ymax=-1;
    double xmin=Double.MAX_VALUE;
    double ymin=Double.MAX_VALUE;
    for (int i = 0; i < cities.size(); i++) {
    	 if(xmax<(cities.get(i).getx()))
    		 xmax=(cities.get(i).getx());
    	 if(ymax<(cities.get(i).gety()))
    		 ymax=(cities.get(i).gety());
    	 if(ymin>(cities.get(i).gety()))
    		 ymin=cities.get(i).gety();
    	if(xmin>cities.get(i).getx())
    		xmin=cities.get(i).getx();
    }
    final int margin=60;
    
    for (int i = 0; i < cities.size(); i++) {
	
      size = getSize();
      double w = (size.width-margin)/(xmax-xmin) ;
      double h = (size.height-margin)/(ymax-ymin);
	  double scale=Math.min(w, h);
      double x = (cities.get(i).getx()-margin-xmin)*scale;//Math.abs(r.nextInt()) % w;
      double y = (cities.get(i).gety()-margin-ymin)*scale;//Math.abs(r.nextInt()) % h;
      g2d.fill(new Ellipse2D.Double(x, y, 6, 6));
    }
  }


}