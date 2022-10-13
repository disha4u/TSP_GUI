import javax.swing.*;
import java.util.*;

/*@author Ramachandra Sai
 *@author Disha Agarawal
 *@author Harshit 
 *@version 1
 */

public class GUI extends JPanel{
	/*
	 * Creates object of Points and plot them on canvas
	 * @param Cities to be plotted
	 */
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
	/*
	 * Displays String Path in Text Area
	 * @param path to be Displayed
	*/
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
