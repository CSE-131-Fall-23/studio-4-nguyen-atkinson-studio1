package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		




		if (shape.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			StdDraw.setPenColor(red, green, blue);
			if (filled) {
			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		else if (shape.equals("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.setPenColor(red, green, blue);
			if (filled) {
			StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
				
			}
		else if (shape.equals("triangle")) {
			StdDraw.setPenColor(red, green, blue);
			double [] xs = new double[3];
			double [] ys = new double[3];
			xs[0]= in.nextDouble();
			ys[0] = in.nextDouble();
			xs[1]= in.nextDouble();
			ys[1] = in.nextDouble();
			xs[2]= in.nextDouble();
			ys[2] = in.nextDouble();
		
			if (filled) {
				StdDraw.filledPolygon(xs, ys);
			}
			else {
				StdDraw.polygon(xs, ys);
			}
		}
		

		
			
			
		
		
	}
}
