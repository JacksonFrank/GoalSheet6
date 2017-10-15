/*
 Jackson Frank
 File: OverlappingMain.java
 Purpose: To use the rectangle window class
 */
import java.util.*;
import java.awt.Point;

public class OverlappingMain {

	public static void main(String[] args) {
		System.out.println("Window Creation!");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		
		ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		
		System.out.println("Windows to create:");
		System.out.print(">");
		int windows = console.nextInt();
		System.out.println();
		
		for(int i = 0; i < windows; i++) {
			Point p = new Point();
			
			System.out.println("Window " + (i + 1) + ":");
			System.out.println("X Position:");
			System.out.print(">");
			p.x = console.nextInt();
			System.out.println("Y Position:");
			System.out.print(">");
			p.y = console.nextInt();
			System.out.println("Width:");
			System.out.print(">");
			int width = console.nextInt();
			System.out.println("Height:");
			System.out.print(">");
			int height = console.nextInt();
			
			list.add(new Rectangle(p, width, height));
			
			System.out.println();
		}
		
		Point pClicked = new Point();
		
		System.out.println("Where would you like to click?");
		System.out.println("X Coordinate:");
		System.out.print(">");
		pClicked.x = console.nextInt();
		System.out.println("Y Coordinate:");
		System.out.print(">");
		pClicked.y = console.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			if(isContained(pClicked, list.get(i).getRange())) {
				list.set(0, list.get(i));
				break;
			}
		}
		
		console.close();
		
		System.out.println("Windows:");
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Window " + (i + 1) + ":");
			System.out.println("X Coordinate: " + list.get(i).getPoint().x);
			System.out.println("Y Coordinate: " + list.get(i).getPoint().y);
			System.out.println("Width: " + list.get(i).getWidth());
			System.out.println("Height: " + list.get(i).getHeight());
			System.out.println();
		}
	}
	
	public static boolean isContained(Point c, int[] bound) {
		if(c.x >= bound[0] && c.x <= bound[1] && c.y >= bound[2] && c.y <= bound[3]) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
