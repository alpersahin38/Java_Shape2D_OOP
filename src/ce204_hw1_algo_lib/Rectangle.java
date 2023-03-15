package ce204_hw1_algo_lib;

/**
*
* It extends the SimplePolygon class and adds specific methods and properties for rectangles.
* 
*/
public class Rectangle extends SimplePolygon {

protected double height;
protected double width;


/**
* Sets the width of the rectangle.
*
* @param width the width of the rectangle
* 
*/
public void setWidth(int width) {
	this.width = width;
}



public double getWidth()
{
	return width;
}


/**
* Sets the height of the rectangle.
*
* @param height the height of the rectangle
* 
*/
public void setHeight(int height) {
	this.height = height;
}

public double getHeight()
{
	return height;
}

/**
* Calculates the area of the rectangle.
*
* @return the area of the rectangle
* 
*/

@Override
public double getArea() {
	
	return height * width ;
}	



/**
* Calculates the perimeter length of the rectangle.
*
* @return the perimeter length of the rectangle
* 
*/

@Override
public double getPerimeterLength() {
	
	return (2 * height) + (2 * width);
}


/**
* Scales the rectangle by a given percentage.
*
* @param percentage the percentage to scale the rectangle by
* 
*/
@Override
public void changeScale(int percentage) {
   height *= (100 + percentage) / 100.0;
   width *= (100 + percentage) / 100.0;
}


/**
* Gets the number of vertices of the rectangle, which is always 4.
*
* @return the number of vertices of the rectangle
* 
*/
@Override
public int getVertices() {
	// TODO Auto-generated method stub
	return 4;
}


/**
* Gets the bounding rectangle of the rectangle.
*
* @return an array of four doubles representing the bounding rectangle of the rectangle
* 
*/
@Override
public double[] getBoundingRect() {
	// TODO Auto-generated method stub
	return super.getBoundingRect();
}

}

