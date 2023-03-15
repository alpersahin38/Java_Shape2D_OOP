package ce204_hw1_algo_lib;



import java.awt.Point;

/**
 * @file ce204-hw1-algo-lib
 *
 * @author Alper SAHIN - Huseyin YASAR
 *
 * @date 15 March 2023
 *
 */

public abstract class Shape2D 
{
	protected Point center; 
	
	
	/**
	 * @name translate
	 * 
	 * @brief Function to translate the shape by dx and dy units
	 * 
	 * @param dx [\b int] The amount to translate in the x direction
	 * 
	 * @param dy [\b int] The amount to translate in the y direction
	 **/

	 public void translate(int dx, int dy) {
		 center.translate(dx, dy);
	 }

	 
	 /**
	  * @name getCenter
	  * 
	  * @brief Function to get the center point of the shape
	  * 
	  * @return [\b Point] The center point of the shape
	  **/
	 public Point getCenter() {
		 
	        return center;
	  }
	 
	 
	 /**
	  * @name rotate
	  * 
	  * @brief Function to rotate the shape by a given angle
	  * 
	  * @param degrees [\b double] The angle to rotate the shape by, in degrees
	  **/

     public abstract void rotate(double degrees);


     /**
      * @name changeScale
      * 
      * @briefScales the shape by the given percentage.
      * 
      * @return percentage [\b int] percentage The percentage to scale the shape by.
      **/
     public abstract void changeScale(int percentage);
     
     /**
      * @name getArea
      * 
      * @brief Function to get the area of the shape
      * 
      * @return [\b double] The area of the shape
      **/

     public abstract double getArea();
     
     
     /**
      * @name getPerimeterLength
      * 
      * @brief Function to get the perimeter length of the shape
      * 
      * @return [\b double] The perimeter length of the shape
      **/

     public abstract double getPerimeterLength();
     
     
     /**
      * @name getBoundingRect
      * 
      * @brief Function to get the bounding rectangle of the shape
      * 
      * @return [\b double[]] The bounding rectangle of the shape, represented as an array of length 4
      *                       containing the coordinates of the top-left corner (x1, y1) and the
      *                       bottom-right corner (x2, y2) of the rectangle
      **/
     
     public abstract double[] getBoundingRect();

     
}