package ce204_hw1_algo_lib;

/**

 * Circle class represents a circle shape.

 * It extends the EllipticalShape class and implements its abstract methods.
*/

public class Circle extends EllipticalShape{

	private final double piNumber = 3.14;
	private double degrees;
	
	
	/**
	 * Rotates the circle by a specified degree.
	 *
	 * @param degrees the degree to rotate the circle by.
	 * 
	*/
	@Override
	public void rotate(double _degrees)
	{
		if(_degrees<0)
		{
			degrees = 360 + _degrees + degrees;
		}
		else
		{
			degrees += _degrees - 360 + degrees;
		}
		
	}
	
	
	/**
	 * Sets the rotation degree of the circle.
	 *
	 * @param degrees the degree to set the rotation of the circle.
	 * 
	*/
	public void setDegrees(int _degrees)
	{
		this.degrees = _degrees;
	}
	
	/**
	 * Gets the rotation degree of the circle.
	 *
	 * @return the rotation degree of the circle.
	 * 
	*/
	public double getDegrees()
	{
		return degrees;
	}
	
	
	/**
	 * Changes the scale of the circle by a percentage.
	 *
	 * @param percentage the percentage to change the scale of the circle by.
	 * 
	*/
	@Override
	public void changeScale(int percentage) {
        semiMajorAxis *= (100 + percentage) / 100.0;
    }
	
	/**
	 * Gets the area of the circle.
	 *
	 * @return the area of the circle.
	 * 
	*/
	@Override
	public double getArea() {

        return piNumber * (semiMajorAxis * semiMajorAxis);
	}
	
	/**
	 * Gets the perimeter length of the circle.
	 *
	 * @return the perimeter length of the circle.
	 * 
	*/
	@Override
	public double getPerimeterLength() {
		
		return  2 * piNumber * semiMajorAxis;
	}

	/**
	 * Gets the radius of the circle.
	 *
	 * @return the radius of the circle.
	 * 
	*/
	public double getRadius()
	{
		return semiMajorAxis;
	}
	
	
	
	
	/**
	 * Gets the bounding rectangle of the circle.
	 *
	 * @return the bounding rectangle of the circle.
	 * 
	*/
	@Override
	public double[] getBoundingRect() {
		
		double boundingMajor = semiMajorAxis * 2;
		double[] bounding  = {boundingMajor,boundingMajor};
		return bounding;

	}


	public void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
		
	}
	

}