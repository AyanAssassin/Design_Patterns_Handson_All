package com.cognizant;

public class ShapeMaker {
private Shape circle;
private Shape rectangle;
private Shape square;
public ShapeMaker() {
	circle=new Circle();
	rectangle=new Rectangle();
	square=new Square();
}
public void drawCircle(){
	circle.draw();
}
public void drawRectangle(){
	rectangle.draw();
}
public void drawSquare(){
	square.draw();
}
@Override
public void finalize() {
	circle = null;
	square = null;
	rectangle = null;
}

}
