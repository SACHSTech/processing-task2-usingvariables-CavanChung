/**
 * Name:Processing Task 2 - Using Variables
 * Purpose:Drawing a House Proportionate to Screen
 * Author: Cavan Chung
 * Created:2022/02/22
 */
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// set size (image scales to size, although you should use the same x and y value for proper results)
    size(400, 400);
  }

  // Set background colour, set/draw background shapes to create shape overlap
  public void setup() {

    // set background
    background(173, 216, 230);

    // set/draw grass
    fill(210, 255, 173);
    rect(0, (float) (height / 1.14), width, height / 8);

    // set/draw the rectangular house base proportionate to the size
    fill(255, 0, 0);
    rect(width / 4, height / 2, width / 2, height / 2);  

  }

  public void draw() {
	  
	  // draw window 1 proportionate to the size
    fill(173,216,230);
    rect( (float) (width / 3.2), (float) (height / 1.6), width / 8, height / 8);  

    // draw window 2 proportionate to the size
    fill(173,216,230);
    rect( (float) (width / 1.78), (float) (height / 1.6), width / 8, height / 8); 

    // draw sun proportionate to the size
    fill(255, 255, 0);
    ellipse( (float) (width / 1.13), (float) (height / 8.89), width / 8, height / 8);

    // draw house roof proportionate to the size
    fill(165,42,42);
    triangle(width / 4, height / 2, (float) (width / 1.34), height / 2, width / 2, (float) (height / 5.34));

    // draw house door proportionate to the size
    fill(78,53,36);
    rect( (float) (width / 2.29), (float) (height / 1.23), width / 8, (float) (height / 5.34));

  }
  
}