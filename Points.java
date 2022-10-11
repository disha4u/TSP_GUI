
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Points extends JPanel {

	City [] cities;
	Point(City[] cities)
	{
		this.cities=cities;
	}
 /*  double[][] cords =   {{9983.3333,98550.0000},
						{10000.0000,98533.3333},
						{10000.0000,98550.0000},
						{10000.0000,98566.6667},
						{10016.6667,98516.6667},
						{10033.3333,98533.3333}};
*/
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(Color.red);

    for (int i = 0; i < cords.length; i++) {
	
      Dimension size = getSize();
      int w = size.width ;
      int h = size.height;
	  
      int x = cities[i].xcoordinate)%w;//Math.abs(r.nextInt()) % w;
      int y = ((int) cords[i].ycoordinate)%h;//Math.abs(r.nextInt()) % h;
	  g2d.fill(new Ellipse2D.Double(x, y, 4, 4));
      //g2d.drawLine(x, y, x+100, y+100);
    }
  }

/*
  public static void main(String[] args) {
    Points points = new Points();
    JFrame frame = new JFrame("Points");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(points);
    frame.setSize(250, 200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }*/
}