package ce204_hw1_algo_lib;


import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**

 * This class represents an arbitrary polygon defined by a list of points.

 * It extends the Polygon class and overrides its methods to handle an arbitrary number of vertices.
*/


public class ArbitraryPolygon extends Polygon {
	
	
	/**
	 * The list of points that defines the polygon.
	 */
    private List<Point> points;
    
    /**
     * Creates a new ArbitraryPolygon instance with an empty list of points.
     */
	public ArbitraryPolygon() {
        points = new ArrayList<>();
    }
	


	/**
	 * Adds a new point to the polygon.
	 * 
	 * @param point the point to add
	 */
	public void addPoint(Point point) {
        points.add(point);
    }
	
	
	
	/**
	 * Returns the area of the polygon.
	 * 
	 * @return the area of the polygon
	 */
	@Override
	public double getArea() {
		
		double area = 0;
        int size = points.size();

        for (int i = 0; i < size; i++) {
            Point point1 = points.get(i);
            Point point2 = points.get((i + 1) % size);

            area += point1.getX() * point2.getY() - point2.getX() * point1.getY();
        }

        return Math.abs(area / 2);
    }
	
	
	/**
	 * Removes the point at the specified index from the polygon.
	 * 
	 * @param index the index of the point to remove
	 */
	public void removePoint(int index) {
        points.remove(index);
    }

	
	/**
	 * Returns the number of vertices in the polygon.
	 * 
	 * @return the number of vertices in the polygon
	 */
	@Override
	public int getVertices() {
		 return points.size();
	}

	
	/**
	 * Rotates the polygon by the specified angle.
	 * 
	 * @param degrees the angle to rotate the polygon by, in degrees
	 */
	@Override
	public void rotate(double degrees) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * Changes the scale of the polygon by the specified percentage.
	 * 
	 * @param percentage the percentage to change the scale of the polygon by
	 */
	@Override
	public void changeScale(int percentage) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * Returns the perimeter length of the polygon.
	 * 
	 * @return the perimeter length of the polygon
	 */

	@Override
	public double getPerimeterLength() {
		 double perimeterLength = 0;
	        int size = points.size();

	        for (int i = 0; i < size; i++) {
	            Point point1 = points.get(i);
	            Point point2 = points.get((i + 1) % size);

	            perimeterLength += point1.distance(point2);
	        }

	        return perimeterLength;
	}
}
