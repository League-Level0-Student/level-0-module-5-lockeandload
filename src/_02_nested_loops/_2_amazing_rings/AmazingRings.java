package _02_nested_loops._2_amazing_rings;

import processing.core.PApplet;
import java.util.Random;

/*
 * Goal: Create a pair of Amazing Rings!
 * 
 * 1. Open the demonstration for this recipe by opening the Recipe.html
 *    file in this folder.
 * 
 * In the setup() method:
 * 2. Set the size of your window to be a rectangle like in the recipe
 *    demonstration
 * 3. Call the noFill() command so all the ellipses will be transparent
 *
 * In the draw() method:
 * 4. Use a for loop to make the first set of rings that will start in the
 *    left half of the window (you can use your code from Bullseye).
 * 
 * 5. Make this set of rings move across the sketch to the right
 *    Hint: make two variables, one for x and another for the speed.
 *    Then increase x by the amount in speed.
 *
 * 6. When the rings reach the right side of the sketch, reverse the direction
 *    so they move
 *    Hint: speed = -speed

 * 7. When the rings reach the left side of the sketch, reverse the direction
 *    again.
 * 
 * CHALLENGE - to finish the Amazing Rings
 * 8. Add another for loop to draw the second set of rings that will start in
 *    the right half of the window
 *
 * 9. Make this set of rings move in the opposite direction to the other rings
 *    These rings must also "bounce" off the sides of the window.
 */
public class AmazingRings extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;

	int x = 200;
	int otherX = 600;
	int y = 250;

	@Override
	public void settings() {
		size(800, 500);
	}

	@Override
	public void setup() {
		noFill();
		background(200, 200, 200);
	}

	int other = 1;
	int timer = 475;
	int size = 10;
	int xSpeedToo = -1;
	int xSpeed = 15;
	int timmer = 100;
	@Override

	public void draw() {
	if (timmer<5){
		timer=100;
	}
		if(timmer >1) {
		timmer--;
	}
	if(timer==10) {
		if(xSpeedToo>0) {
			xSpeedToo++;
		}else {
			xSpeedToo--;
		}
		
	}
	System.out.println(timmer);
	background(200,200,200);
		for (int in = 0; in < 2; in++) {
			for (int as = 0; as < 200; as++) {
				if (size <= 300) {
					ellipse(x, y, size, size);
					ellipse(otherX, y, size, size);

					size += 10;
				}
			}
			size = 10;

		}
		x += xSpeed;
		otherX += xSpeedToo;
		if (x+150 > WIDTH) {
			xSpeed = -xSpeed;
		//	System.out.println("a");
		}
		if (otherX+150 > WIDTH) {
			xSpeedToo = -xSpeedToo;
		//	System.out.println("other a");
		}
		//***********************\\
		if (x-150 < 0) {
			xSpeed = -xSpeed;
			//System.out.println("b");
		}
		if (otherX-150 < 0) {
			xSpeedToo = -xSpeedToo;
	//		System.out.println("other b");
		}
	}

	static public void main(String[] args) {
		PApplet.main(AmazingRings.class.getName());
	}
}