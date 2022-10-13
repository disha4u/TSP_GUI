import javax.swing.*;
import java.util.*;
public class GUI extends JPanel{
	
	public void plotPoints(ArrayList<City> cities)
	{
		
		Points points = new Points(cities);
		JFrame frame = new JFrame("Points");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(points);
		frame.setSize(250, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public void displayPath(String path)
	{
		JPanel p = new JPanel();
		JFrame frame = new JFrame("Path");
		JTextArea area=new JTextArea(path);
		area.setBounds(10,30, 200,200);  
		p.add(area);
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
