package ce204_hw1_algo_lib;


/**
 * Represents a regular polygon, which is a polygon with equal sides and angles.
 */

public class RegularPolygon extends SimplePolygon{
	
	private final double piNumber = 3.14;
	private int numPoints;
    private double radius;
    
    
    /**
     * Constructs a regular polygon with the specified number of sides and radius.
     *
     * @param numPoints the number of sides of the polygon
     * @param radius the radius of the polygon
     */
    
    public RegularPolygon(int numPoints, double radius) {
        this.numPoints = numPoints;
        this.radius = radius;
    }
    
    
    /**
     * Changes the number of sides of the polygon.
     *
     * @param numPoints the new number of sides of the polygon
     */
    
    public void changeNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }
    
    
    /**
     * Changes the scale of the polygon by the specified percentage.
     *
     * @param percentage the percentage by which to scale the polygon
     */
    @Override
    public void changeScale(int percentage) {
    	
        radius *= (100 + percentage) / 100.0;;
    }
    
    
    /**
     * Calculates the area of the polygon.
     *
     * @return the area of the polygon
     */
    
    @Override	
    public double getArea() {
        return (((numPoints * radius * radius)/2) * Math.sin(2 * piNumber / numPoints)) ;
    }
    
    
    /**
     * Calculates the perimeter length of the polygon.
     *
     * @return the perimeter length of the polygon
     */
    
    @Override
    public double getPerimeterLength() {
        return numPoints * 2 * radius * Math.sin(piNumber / numPoints);
    }
    
    
    /**
     * Returns the number of vertices (corners) of the polygon.
     *
     * @return the number of vertices of the polygon
     */
    
    @Override
    public int getVertices() {
        return numPoints;
    }

	
}
