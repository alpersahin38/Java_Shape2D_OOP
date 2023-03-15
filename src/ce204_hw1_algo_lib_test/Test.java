package ce204_hw1_algo_lib_test;

import static org.junit.Assert.*;

import java.awt.Point;
import ce204_hw1_algo_lib.*;


public class Test {

	@org.junit.Test
	public void Circle_getAreaTest1() {
		Circle circle = new Circle();
		double expectedArea = 12.56;
		circle.setSemiMajorAxis(2);
		double actualArea = circle.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}

	
	@org.junit.Test
	public void Circle_getAreaTest2() {
		Circle circle = new Circle();
		double expectedArea = 78.50;
		circle.setSemiMajorAxis(5);
		double actualArea = circle.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}
	
	
	@org.junit.Test
	public void Circle_getAreaTest3() {
		Circle circle = new Circle();
		double expectedArea = 314;
		circle.setSemiMajorAxis(10);
		double actualArea = circle.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}
	
	@org.junit.Test
	public void Circle_getPerimeterLengthTest1() {
		Circle circle = new Circle();
		double expectedPerimeterLength = 12.56;
		circle.setSemiMajorAxis(2);
		double actualPerimeterLength = circle.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0);
	}
	
	@org.junit.Test
	public void Circle_getPerimeterLengthTest2() {
		Circle circle = new Circle();
		double expectedPerimeterLength = 31.4;
		circle.setSemiMajorAxis(5);
		double actualPerimeterLength = circle.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	@org.junit.Test
	public void Circle_getPerimeterLengthTest3() {
		Circle circle = new Circle();
		double expectedPerimeterLength = 157;
		circle.setSemiMajorAxis(25);
		double actualPerimeterLength = circle.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0);
	}
	
	
	@org.junit.Test
	public void Circle_getRadiusTest1() {
		Circle circle = new Circle();
		double expectedRadius = 3;
		circle.setSemiMajorAxis(3);
		double actualRadius = circle.getRadius();
		assertEquals(expectedRadius, actualRadius, 0);
	}
	
	@org.junit.Test
	public void Circle_getRadiusTest2() {
		Circle circle = new Circle();
		double expectedRadius = 9;
		circle.setSemiMajorAxis(9);
		double actualRadius = circle.getRadius();
		assertEquals(expectedRadius, actualRadius, 0);
	}
	
	@org.junit.Test
	public void Circle_getRadiusTest3() {
		Circle circle = new Circle();
		double expectedRadius = 20;
		circle.setSemiMajorAxis(20);
		double actualRadius = circle.getRadius();
		assertEquals(expectedRadius, actualRadius, 0);
	}
	
	
	@org.junit.Test
	public void Circle_changeScaleTest1() {
		Circle circle = new Circle();
		circle.setSemiMajorAxis(6);
		circle.changeScale(60);
		double expectedchangeScale = 9.6;
		double actualchangeScale = circle.getRadius();
		assertEquals(expectedchangeScale, actualchangeScale, 0.1);
	}
	
	
	@org.junit.Test
	public void Circle_changeScaleTest2() {
		Circle circle = new Circle();
		circle.setSemiMajorAxis(6);
		circle.changeScale(50);
		double expectedchangeScale = 9;
		double actualchangeScale = circle.getRadius();
		assertEquals(expectedchangeScale, actualchangeScale, 0.1);
	}
	
	@org.junit.Test
	public void Circle_changeScaleTest3() {
		Circle circle = new Circle();
		circle.setSemiMajorAxis(500);
		circle.changeScale(-50);
		double expectedchangeScale = 250;
		double actualchangeScale = circle.getRadius();
		assertEquals(expectedchangeScale, actualchangeScale, 0.1);
	}
	
	
	@org.junit.Test
	public void Circle_getBoundingRectTest1() {
		Circle circle = new Circle();
		circle.setSemiMajorAxis(500);
		double[] bounding =  circle.getBoundingRect();	
		double boundingMajor1 = bounding[0];
		double boundingMajor2 = bounding[1];
		double expectedBounding = 1000;
		assertEquals(expectedBounding, boundingMajor1, 0.1);
		assertEquals(expectedBounding, boundingMajor2, 0.1);
	}
	
	@org.junit.Test
	public void Circle_getBoundingRectTest2() {
		Circle circle = new Circle();
		circle.setSemiMajorAxis(60);
		double[] boundaries =  circle.getBoundingRect();
		double boundingMajor1 = boundaries[0];
		double boundingMajor2 = boundaries[1];
		double expectedBounding = 120;
		assertEquals(expectedBounding, boundingMajor1, 0.1);
		assertEquals(expectedBounding, boundingMajor2, 0.1);
	}
	
	
	@org.junit.Test
	public void Circle_getBoundingRectTest3() {
		Circle circle = new Circle();
		circle.setSemiMajorAxis(45.5);
		double[] boundaries =  circle.getBoundingRect();
		double boundingMajor1 = boundaries[0];
		double boundingMajor2 = boundaries[1];
		double expectedBounding = 91;
		assertEquals(expectedBounding, boundingMajor1, 0.1);
		assertEquals(expectedBounding, boundingMajor2, 0.1);
	}
	
	@org.junit.Test
	public void Circle_rotate_Test1()
	{
		Circle circle = new Circle();
		circle.setDegrees(0);
		circle.rotate(-10);
		double newDegrees = circle.getDegrees();
		double expectedResult = 350;
		assertEquals(expectedResult, newDegrees, 0.1);
	}
	
	@org.junit.Test
	public void Circle_rotate_Test2()
	{
		Circle circle = new Circle();
		circle.setDegrees(0);
		circle.rotate(-120);
		double newDegrees = circle.getDegrees();
		double expectedResult = 240;
		assertEquals(expectedResult, newDegrees, 0.1);
	}
	
	
	@org.junit.Test
	public void Circle_rotate_Test3()
	{
		Circle circle = new Circle();
		circle.setDegrees(0);
		circle.rotate(-65);
		double newDegrees = circle.getDegrees();
		double expectedResult = 295;
		assertEquals(expectedResult, newDegrees, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getAreaTest1() {
		Ellipse ellipse = new Ellipse(5,0);
		double expectedArea = 47.1;
		ellipse.setSemiMajorAxis(3);
		double actualArea = ellipse.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}
	
	
	@org.junit.Test
	public void Ellipse_getAreaTest2() {
		Ellipse ellipse = new Ellipse(15,0);
		double expectedArea = 471;
		ellipse.setSemiMajorAxis(10);
		double actualArea = ellipse.getArea();
		assertEquals(expectedArea, actualArea, 0.1);
	}

	@org.junit.Test
	public void Ellipse_getAreaTest3() {
		Ellipse ellipse = new Ellipse(7,0);
		double expectedArea = 175.84;
		ellipse.setSemiMajorAxis(8);
		double actualArea = ellipse.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}
	
	@org.junit.Test
	public void Ellipse_getPerimeterLengthTest1() {
		Ellipse ellipse = new Ellipse(7,0);
		double expectedPerimeterLength = 47.20;
		ellipse.setSemiMajorAxis(8);
		double actualPerimeterLength = ellipse.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.3);
	}
	
	
	@org.junit.Test
	public void Ellipse_getPerimeterLengthTest2() {
		Ellipse ellipse = new Ellipse(15,0);
		double expectedPerimeterLength = 80.05;
		ellipse.setSemiMajorAxis(10);
		double actualPerimeterLength = ellipse.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.2);
	}
	
	
	
	@org.junit.Test
	public void Ellipse_getPerimeterLengthTest3() {
		Ellipse ellipse = new Ellipse(5,0);
		double expectedPerimeterLength = 25.89;
		ellipse.setSemiMajorAxis(3);
		double actualPerimeterLength = ellipse.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_changeScaleTest1() {
		Ellipse ellipse = new Ellipse(3,0);
		ellipse.setSemiMajorAxis(5);
		ellipse.changeScale(50);
		double expectedMajorAxis = 7.5;
		double expectedMinorAxis = 4.5;
		double actualMajorAxis = ellipse.getSemiMajorAxis();
		double actualMinorAxis = ellipse.getSemiMinorAxis();
		assertEquals(expectedMajorAxis, actualMajorAxis, 0.1);
		assertEquals(expectedMinorAxis, actualMinorAxis, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_changeScaleTest2() {
		Ellipse ellipse = new Ellipse(20,0);
		ellipse.setSemiMajorAxis(100);
		ellipse.changeScale(75);
		double expectedMajorAxis = 175;
		double expectedMinorAxis = 35;
		double actualMajorAxis = ellipse.getSemiMajorAxis();
		double actualMinorAxis = ellipse.getSemiMinorAxis();
		assertEquals(expectedMajorAxis, actualMajorAxis, 0.1);
		assertEquals(expectedMinorAxis, actualMinorAxis, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_changeScaleTest3() {
		Ellipse ellipse = new Ellipse(10,0);
		ellipse.setSemiMajorAxis(80);
		ellipse.changeScale(100);
		double expectedMajorAxis = 160;
		double expectedMinorAxis = 20;
		double actualMajorAxis = ellipse.getSemiMajorAxis();
		double actualMinorAxis = ellipse.getSemiMinorAxis();
		assertEquals(expectedMajorAxis, actualMajorAxis, 0.1);
		assertEquals(expectedMinorAxis, actualMinorAxis, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getBoundingRectTest1() {
		Ellipse ellipse = new Ellipse(10,0);
		ellipse.setSemiMajorAxis(80);
		double[] boundaries =  ellipse.getBoundingRect();
		double boundingMinor = boundaries[0];
		double boundingMajor = boundaries[1];
		double expected1= 160;
		double expected2 = 20;
		assertEquals(expected1, boundingMajor, 0.1);
		assertEquals(expected2, boundingMinor, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getBoundingRectTest2() {
		Ellipse ellipse = new Ellipse(25.5,0);
		ellipse.setSemiMajorAxis(100);
		double[] boundaries =  ellipse.getBoundingRect();
		double boundingMinor = boundaries[0];
		double boundingMajor = boundaries[1];
		double expected1= 200;
		double expected2 = 51;
		assertEquals(expected1, boundingMajor, 0.1);
		assertEquals(expected2, boundingMinor, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getBoundingRectTest3() {
		Ellipse ellipse = new Ellipse(60,0);
		ellipse.setSemiMajorAxis(70);
		double[] boundaries =  ellipse.getBoundingRect();
		double boundingMinor = boundaries[0];
		double boundingMajor = boundaries[1];
		double expected1= 140;
		double expected2 = 120;
		assertEquals(expected1, boundingMajor, 0.1);
		assertEquals(expected2, boundingMinor, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getSemiMajorAxisTest1() {
		Ellipse ellipse = new Ellipse(60,0);
		ellipse.setSemiMajorAxis(70);
		double expected= 70;
		double actual = ellipse.getSemiMajorAxis();
		assertEquals(expected, actual, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getSemiMajorAxisTest2() {
		Ellipse ellipse = new Ellipse(60,0);
		ellipse.setSemiMajorAxis(546.5);
		double expected= 546.5;
		double actual = ellipse.getSemiMajorAxis();
		assertEquals(expected, actual, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getSemiMajorAxisTest3() {
		Ellipse ellipse = new Ellipse(60,0);
		ellipse.setSemiMajorAxis(845);
		double expected= 845;
		double actual = ellipse.getSemiMajorAxis();
		assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_getSemiMinorAxisTest1() {
		Ellipse ellipse = new Ellipse(60,0);
		double expected= 60;
		double actual = ellipse.getSemiMinorAxis();
		assertEquals(expected, actual, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getSemiMinorAxisTest2() {
		Ellipse ellipse = new Ellipse(120,0);
		double expected= 120;
		double actual = ellipse.getSemiMinorAxis();
		assertEquals(expected, actual, 0.1);
	}
	
	@org.junit.Test
	public void Ellipse_getSemiMinorAxisTest3() {
		Ellipse ellipse = new Ellipse(80.5,0);
		double expected= 80.5;
		double actual = ellipse.getSemiMinorAxis();
		assertEquals(expected, actual, 0.1);
	}
	
	
	
	@org.junit.Test
	public void Ellipse_rotateTest1() {
		Ellipse ellipse = new Ellipse(80.5,0);
		ellipse.rotate(30);
        double expected = 30;
        double actual = ellipse.getOrientation();
        assertEquals(expected, actual, 0.0001);
	}
	
	
	@org.junit.Test
	public void Ellipse_rotateTest2() {
		Ellipse ellipse = new Ellipse(80.5,0);
		ellipse.rotate(160);
        double expected = 160;
        double actual = ellipse.getOrientation();
        assertEquals(expected, actual, 0.0001);
	}
	
	
	@org.junit.Test
	public void Ellipse_rotateTest3() {
		Ellipse ellipse = new Ellipse(80.5,0);
		ellipse.rotate(60);
        double expected = 60;
        double actual = ellipse.getOrientation();
        assertEquals(expected, actual, 0.0001);
	}
	
	
	@org.junit.Test
	public void Ellipse_getFocus1Test1() {
		Ellipse ellipse = new Ellipse(5,0);
		ellipse.setSemiMajorAxis(10);
        double expected = 8.66;
        double actual = ellipse.getFocus1();
        assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_getFocus1Test2() {
		Ellipse ellipse = new Ellipse(7,0);
		ellipse.setSemiMajorAxis(15);
        double expected = 13.26;
        double actual = ellipse.getFocus1();
        assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_getFocus1Test3() {
		Ellipse ellipse = new Ellipse(2,0);
		ellipse.setSemiMajorAxis(3);
        double expected = 2.23;
        double actual = ellipse.getFocus1();
        assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_getFocus2Test1() {
		Ellipse ellipse = new Ellipse(5,0);
		ellipse.setSemiMajorAxis(10);
        double expected = -8.66;
        double actual = -1 * ellipse.getFocus1();
        assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_getFocus2Test2() {
		Ellipse ellipse = new Ellipse(7,0);
		ellipse.setSemiMajorAxis(15);
        double expected = -13.26;
        double actual = -1 *ellipse.getFocus1();
        assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void Ellipse_getFocus2Test3() {
		Ellipse ellipse = new Ellipse(2,0);
		ellipse.setSemiMajorAxis(3);
        double expected = -2.23;
        double actual = -1*ellipse.getFocus1();
        assertEquals(expected, actual,0.1);
	}
	
	@org.junit.Test
	public void Rectangle_getAreaTest1() {
		Rectangle rectangle = new Rectangle();
		double expectedArea = 56;
		rectangle.setHeight(8);
		rectangle.setWidth(7);
		double actualArea = rectangle.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}
	
	
	@org.junit.Test
	public void Rectangle_getAreaTest2() {
		Rectangle rectangle = new Rectangle();
		double expectedArea = 100;
		rectangle.setHeight(10);
		rectangle.setWidth(10);
		double actualArea = rectangle.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}
	
	
	@org.junit.Test
	public void Rectangle_getAreaTest3() {
		Rectangle rectangle = new Rectangle();
		double expectedArea = 350;
		rectangle.setHeight(50);
		rectangle.setWidth(7);
		double actualArea = rectangle.getArea();
		assertEquals(expectedArea, actualArea, 0);
	}
	
	
	@org.junit.Test
	public void Rectangle_getPerimeterLengthTest1() {
		Rectangle rectangle = new Rectangle();
		double expectedPerimeterLength = 114;
		rectangle.setHeight(50);
		rectangle.setWidth(7);
		double actualPerimeterLength = rectangle.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0);
	}
	
	
	@org.junit.Test
	public void Rectangle_getPerimeterLengthTest2() {
		Rectangle rectangle = new Rectangle();
		double expectedPerimeterLength = 200;
		rectangle.setHeight(80);
		rectangle.setWidth(20);
		double actualPerimeterLength = rectangle.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0);
	}
	
	
	@org.junit.Test
	public void Rectangle_getPerimeterLengthTest3() {
		Rectangle rectangle = new Rectangle();
		double expectedPerimeterLength = 600;
		rectangle.setHeight(100);
		rectangle.setWidth(200);
		double actualPerimeterLength = rectangle.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0);
	}
	
	@org.junit.Test
	public void Rectangle_changeScaleTest1() {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(100);
		rectangle.setWidth(200);
		rectangle.changeScale(50);
		double expectedHeight = 150;
		double expectedWidth = 300;
		double actualHeight = rectangle.getHeight();
		double actualWidth = rectangle.getWidth();
		assertEquals(expectedHeight, actualHeight,0);
		assertEquals(expectedWidth, actualWidth,0);
		}
	
	
	@org.junit.Test
	public void Rectangle_changeScaleTest2() {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(100);
		rectangle.setWidth(200);
		rectangle.changeScale(-50);
		double expectedHeight = 50;
		double expectedWidth = 100;
		double actualHeight = rectangle.getHeight();
		double actualWidth = rectangle.getWidth();
		assertEquals(expectedHeight, actualHeight,0);
		assertEquals(expectedWidth, actualWidth,0);
		}
	
	
	@org.junit.Test
	public void Rectangle_changeScaleTest3() {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10);
		rectangle.setWidth(20);
		rectangle.changeScale(75);
		double expectedHeight = 17.5;
		double expectedWidth = 35;
		double actualHeight = rectangle.getHeight();
		double actualWidth = rectangle.getWidth();
		assertEquals(expectedHeight, actualHeight,0);
		assertEquals(expectedWidth, actualWidth,0);
		}

	
	@org.junit.Test
	public void Rectangle_getVertices1() {
		Rectangle rectangle = new Rectangle();
		double expected = 4;
		double actual = rectangle.getVertices();
		assertEquals(expected, actual,0);
		}
	
	
	
	
	@org.junit.Test
	public void RegularPolygon_getAreaTest1() {
		RegularPolygon regularpolygon = new RegularPolygon(4,2);
		double expectedArea = 8;
		double actualArea = regularpolygon.getArea();
		assertEquals(expectedArea, actualArea, 0.1);
	}
	
	
	@org.junit.Test
	public void RegularPolygon_getAreaTest2() { //Buradaki 4 yarıçaptır uzunluk değil.
		RegularPolygon regularpolygon = new RegularPolygon(3,4);
		double expectedArea = 20.78;
		double actualArea = regularpolygon.getArea();
		assertEquals(expectedArea, actualArea, 0.1);
	}
	
	
	@org.junit.Test
	public void RegularPolygon_getAreaTest3() {
		RegularPolygon regularpolygon = new RegularPolygon(8,7);
		double expectedArea = 138.53;
		double actualArea = regularpolygon.getArea();
		assertEquals(expectedArea, actualArea, 0.1);
	}
	
	
	@org.junit.Test
	public void RegularPolygon_getPerimeterLengthTest1() {
		RegularPolygon regularpolygon = new RegularPolygon(4,2);
		double expectedPerimeterLength = 11.31;
		double actualPerimeterLength = regularpolygon.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	@org.junit.Test
	public void RegularPolygon_getPerimeterLengthTest2() {
		RegularPolygon regularpolygon = new RegularPolygon(3,4);
		double expectedPerimeterLength = 20.78;
		double actualPerimeterLength = regularpolygon.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	@org.junit.Test
	public void RegularPolygon_getPerimeterLengthTest3() {
		RegularPolygon regularpolygon = new RegularPolygon(8,7);
		double expectedPerimeterLength = 42.83;
		double actualPerimeterLength = regularpolygon.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	@org.junit.Test
	public void RegularPolygon_changeScaleTest1() {
		RegularPolygon regularpolygon = new RegularPolygon(4,2);
		regularpolygon.changeScale(50);
		double expected = 12;
		double actual = regularpolygon.getArea();
		assertEquals(expected, actual, 0.1);
	}
	
	@org.junit.Test
	public void RegularPolygon_changeScaleTest2() {
		RegularPolygon regularpolygon = new RegularPolygon(3, 1);
		regularpolygon.changeScale(50);
        assertEquals(0.75, regularpolygon.getArea(), 0.0001);
	}
	
	
	@org.junit.Test
	public void RegularPolygon_getVerticesTest1() {
		RegularPolygon regularpolygon = new RegularPolygon(3, 1);
		double expected = 3;
        double actual = regularpolygon.getVertices();
        assertEquals(expected,actual,0.1);
	}
	
	
	@org.junit.Test
	public void RegularPolygon_getVerticesTest2() {
		RegularPolygon regularpolygon = new RegularPolygon(20, 1);
		double expected = 20;
        double actual = regularpolygon.getVertices();
        assertEquals(expected,actual,0.1);
	}
	
	
	@org.junit.Test
	public void RegularPolygon_getVerticesTest3() {
		RegularPolygon regularpolygon = new RegularPolygon(8, 1);
		double expected = 8;
        double actual = regularpolygon.getVertices();
        assertEquals(expected,actual,0.1);
	}
		
	
	@org.junit.Test
	public void ArbitraryPolygon_getAreaTest1() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expectedArea = 4;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(0, 2);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);

		double actualArea = arbitrarypolygon.getArea();
		assertEquals(expectedArea, actualArea, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_getAreaTest2() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expectedArea = 2;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(2, 2);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);

		double actualArea = arbitrarypolygon.getArea();
		assertEquals(expectedArea, actualArea, 0.1);
	}
	
	@org.junit.Test
	public void ArbitraryPolygon_getAreaTest3() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expectedArea = 100;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(50, 2);
        Point point4 = new Point(50, 0);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);

		double actualArea = arbitrarypolygon.getArea();
		assertEquals(expectedArea, actualArea, 0.1);
	}
	
	
	
	@org.junit.Test
	public void ArbitraryPolygon_getPerimeterLengthTest1() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expectedPerimeterLength = 6.82;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(2, 2);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);

		double actualPerimeterLength = arbitrarypolygon.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_getPerimeterLengthTest2() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expectedPerimeterLength = 104;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(50, 2);
        Point point4 = new Point(50, 0);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);

		double actualPerimeterLength = arbitrarypolygon.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	
	
	@org.junit.Test
	public void ArbitraryPolygon_getPerimeterLengthTest3() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expectedPerimeterLength = 8;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(0, 2);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);
		double actualPerimeterLength = arbitrarypolygon.getPerimeterLength();
		assertEquals(expectedPerimeterLength, actualPerimeterLength, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_getVerticesTest1() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expected = 5;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(50, 2);
        Point point4 = new Point(51, 1);
        Point point5 = new Point(50, 0);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);
        arbitrarypolygon.addPoint(point5);

		double actual = arbitrarypolygon.getVertices();
		assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_getVerticesTest2() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expected = 4;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(50, 2);
        Point point4 = new Point(50, 0);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);

		double actual = arbitrarypolygon.getVertices();
		assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_getVerticesTest3() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expected = 3;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(2, 2);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);

		double actual = arbitrarypolygon.getVertices();
		assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_removePointTest1() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expected = 3;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(50, 2);
        Point point4 = new Point(50, 0);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);
        
        arbitrarypolygon.removePoint(0);

		double actual = arbitrarypolygon.getVertices();
		assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_removePointTest2() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expected = 2;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(50, 2);
        Point point4 = new Point(50, 0);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);
        
        arbitrarypolygon.removePoint(0);
        arbitrarypolygon.removePoint(1);

		double actual = arbitrarypolygon.getVertices();
		assertEquals(expected, actual, 0.1);
	}
	
	
	@org.junit.Test
	public void ArbitraryPolygon_removePointTest3() {
		ArbitraryPolygon arbitrarypolygon = new ArbitraryPolygon();
		double expected = 4;
		Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(50, 2);
        Point point4 = new Point(51, 1);
        Point point5 = new Point(50, 0);

        arbitrarypolygon.addPoint(point1);
        arbitrarypolygon.addPoint(point2);
        arbitrarypolygon.addPoint(point3);
        arbitrarypolygon.addPoint(point4);
        arbitrarypolygon.addPoint(point5);
        
        arbitrarypolygon.removePoint(0);

		double actual = arbitrarypolygon.getVertices();
		assertEquals(expected, actual, 0.1);
	}

}
