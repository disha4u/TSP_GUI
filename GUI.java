import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel{
	
	public void PlotPoints(ArrayList<City> cities)
	{
		
		Points points = new Points(cities);
		JFrame frame = new JFrame("Points");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(points);
		frame.setSize(250, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
