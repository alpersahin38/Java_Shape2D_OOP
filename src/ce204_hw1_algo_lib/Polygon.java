package ce204_hw1_algo_lib;

import java.util.Arrays;
import java.util.Collections;


/**
 * The abstract Polygon class represents a 2D polygon shape.
 * 
 * It extends the Shape2D abstract class.
 * 
 */

public abstract class Polygon extends Shape2D {


	/**
	 * Returns the number of vertices of the polygon.
	 * 
	 * @return the number of vertices of the polygon
	 * 
	 */
	public abstract int getVertices();	

	
	/**
	 * Calculates and returns an array representing the bounding rectangle of the polygon.
	 * 
	 * @return an array containing the width and height of the bounding rectangle of the polygon
	 * 
	 */
	@Override
	public double[] getBoundingRect() {
		
		int Xmax = Collections.max(Arrays.asList(center.x));
        int Xmin = Collections.min(Arrays.asList(center.x));
     
        int Ymax = Collections.max(Arrays.asList(center.y));
        int Ymin = Collections.min(Arrays.asList(center.y));
        
        int width = Xmax - Xmin;
        int height = Ymax - Ymin;

        double[] boundary  = {width,height};
		
		return boundary;
	}
	

}
