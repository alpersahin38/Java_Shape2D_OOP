package ce204_hw1_algo_lib;

/**
 * The abstract SimplePolygon class represents a simple 2D polygon shape with no self-intersections.
 * 
 * It extends the Polygon abstract class.
 */

public abstract class SimplePolygon extends Polygon{
	protected int oriantation;
	
	/**
	 * Rotates the polygon by the specified number of degrees.
	 * 
	 * @param degrees the number of degrees to rotate the polygon by
	 */
	@Override
	public void rotate(double degrees) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * Returns the orientation of the polygon.
	 * 
	 * @return the orientation of the polygon
	 * 
	 */
	
	public int getOriantation() {
		return oriantation;
	}
}
