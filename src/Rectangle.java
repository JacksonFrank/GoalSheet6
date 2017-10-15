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
	
	//returns 4 integers that get the left and right x coordinates of the window and get the top
	//	and bottom y coordinates of the window
	public int[] getRange() {
		int[] range = new int[4];
		range[0] = p.x;
		range[1] = p.x + width;
		range[2] = p.y - height;
		range[3] = p.y;
		
		return range;
		
	
	}
	
	public Point getPoint() {
		return p;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
