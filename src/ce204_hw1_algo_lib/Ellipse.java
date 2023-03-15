package ce204_hw1_algo_lib;

/**

 * Ellipse class represents an ellipse shape.

 * It extends EllipticalShape class and implements its abstract methods.
*/

public class Ellipse extends EllipticalShape {
	
	
	private final double piNumber = 3.14;
	protected double semiMinorAxis;
	protected double orientation;
	
	
	/**
     * Constructs an Ellipse object with the specified semi-minor axis and orientation.
     *
     * @param semiMinorAxis the length of the semi-minor axis
     * @param orientation the orientation of the ellipse in degrees 
     */
	public Ellipse(double semiMinorAxis, double orientation) {
        this.semiMinorAxis = semiMinorAxis;
        this.orientation = orientation;
    }

	
	
	/**
     * Rotates the ellipse by the specified number of degrees.
     *
     * @param degrees the number of degrees to rotate the ellipse (positive for clockwise, negative for counterclockwise)
     */
    public void rotate(double degrees) {
        orientation += degrees;
        orientation %= 360;
    }
    
    
    /**
     * Returns the length of the semi-major axis of the ellipse.
     *
     * @return the length of the semi-major axis
     */
	public double getSemiMajorAxis() {
        return semiMajorAxis;
    }
	
	
	/**
     * Returns the length of the semi-minor axis of the ellipse.
     *
     * @return the length of the semi-minor axis
     */
	public double getSemiMinorAxis() {
        return semiMinorAxis;
    }
	
	
	
	/**
     * Calculates and returns the area of the ellipse.
     *
     * @return the area of the ellipse
     */
	@Override
	public double getArea() {
		
		return piNumber * semiMajorAxis * semiMinorAxis;
	}
	
	
	/**
     * Calculates and returns the perimeter length of the ellipse.
     *
     * @return the perimeter length of the ellipse
     */
	
	@Override
	public double getPerimeterLength() {
		
		return (2 * piNumber * Math.sqrt((semiMajorAxis * semiMajorAxis + semiMinorAxis * semiMinorAxis) / 2));
	}

	
	/**
     * Calculates and returns the distance from the center of the ellipse to focus 1.
     *
     * @return the distance from the center of the ellipse to focus 1
     */
	
	public double getFocus1() {
        return Math.sqrt(semiMajorAxis * semiMajorAxis - semiMinorAxis * semiMinorAxis) ;
    }
	
	
	/**
     * Calculates and returns the distance from the center of the ellipse to focus 2.
     *
     * @return the distance from the center of the ellipse to focus 2
     */
	public double getFocus2() {
        return (-Math.sqrt(semiMajorAxis * semiMajorAxis - semiMinorAxis * semiMinorAxis)) ;
    }
	
	
	/**
     * Returns the orientation of the ellipse in degrees.
     *
     * @return the orientation of the ellipse in degrees 
     */
	public double getOrientation() {
        return orientation;
    }
	
	
	/**
     * Changes the size of the ellipse by the specified percentage.
     *
     * @param percentage the percentage by which to scale the ellipse (positive for enlargement, negative for reduction)
     */
	@Override
	public void changeScale(int percentage) {
		semiMinorAxis *= (100 + percentage) / 100.0;
        semiMajorAxis *= (100 + percentage) / 100.0;
    }
	
	/**
     * @name getBoundingRect
     * 
     * @brief Function to get the bounding rectangle of the shape
     * 
     * @return [\b double[]] The bounding rectangle of the shape, represented as an array of length 4
     *                       containing the coordinates of the top-left corner (x1, y1) and the
     *                       bottom-right corner (x2, y2) of the rectangle
     **/
	@Override
	public double[] getBoundingRect() {
		
		double boundingMinor = semiMinorAxis * 2;
		double boundingMajor = semiMajorAxis * 2;
		
		double[] bounding  = {boundingMinor,boundingMajor};
		
		return bounding;

	}

	public void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
		
	}
	
	
}
