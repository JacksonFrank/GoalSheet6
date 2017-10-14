/*
 Jackson Frank
 File: Rectangle.java
 Purpose: to create a rectangular window that also keeps track of its position, dimensions, and z-order
 */

import java.awt.Point;


public class Rectangle {
	
	//I am assuming window's coordinates is located on top left corner
	//I am also assuming that origin is in the bottom left corner of the screen
	private Point p = new Point();
	private int width, height;
	
	
	public Rectangle(Point p, int width, int height) {
		this.p = p;
		this.width = width;
		this.height = height;
	}
	
	//returns 4 point values whose coordinates indicate the four corners of the window
	//	going clockwise starting from the top left hand corner
	public Point[] getWindow() {
		Point[] window = new Point[4];
		window[0] = new Point(p);
		window[1] = new Point(p.x + width, p.y);
		window[2] = new Point(p.x + width, p.y - height);
		window[3] = new Point(p.x, p.y - height);
		
		return window;
	
	}
}
