package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	public void draw()
	{	
		// background(255, 0, 0);//Black
		// stroke(0, 255, 0);//Pen colour
		// line(10, 10, 200, 200);// x1, y1, x2, y2
		// noStroke();
		// ellipse(200, 200, 100, 50);// cx, cy, w, h
		// fill(0, 0, 255);
		// rect(20, 100, 70, 90); // toplx, toply, w, h
		// point(200, 60);
		// fill(0, 255, 255);
		// triangle(200, 90, 300, 200, 10, 60);
		// fill(0);
		// text("Hello world", 300, 300);


		// (0,0)                   (10,0)







		//(0, -10)
		background(255, 0, 0);
		stroke(0, 255, 0);//outline?
		noStroke();		//no outline?

		//Yellow Circle
		fill(255, 255, 0);// Here//What does it do? //rgb // fills next shape after it
		ellipse(250, 250, 400, 400);// cx, cy, w, h
		
		//Blue Triangle
		fill(0, 230, 255);
		triangle(250, 10, 50, 450, 450, 450);//(first point, second point, third point)
		// fill(0);
		// text("Hello world", 300, 300);

		//Grey Circle
		fill(192, 192, 192);
		ellipse(250,250,200,100);

		//Back Circle
		fill(0);
		ellipse(250,250,80,80);
	}
}
