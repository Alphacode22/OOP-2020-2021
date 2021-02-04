package ie.tudublin;

import java.util.Random;

import processing.core.PApplet;

public class BugZap extends PApplet {
    private float playerX=250;
    private float playerY=450;
    private float playerWidth=50;

    private float bugX=10;
    private float bugY=10;
    private float bugWidth=50;

    private boolean isShooting=false;
    private int frameShoot=0;

    //Start
    public void settings(){
        size(500, 500);//px
    }
    
    public void setup(){
        //width = 500;
        //height =500;
        
    }

    void drawPlayer(float x, float y, float w){
        // x + 20, w * 0.5f
        //line(x, y, 50, 50);
        background(0);//Changes background of screen to black

        noStroke();
        fill(0, 0, 255);
        ellipse(x, y, 50, 50);
    }
    
    
    void drawBug(float x, float y, float w){
        // x + 20, w * 0.5f
        //line(x, y, 50, 50);
        //background(0);//Changes background of screen to black

        noStroke();
        fill(0, 255, 0);
        ellipse(x, y, 50, 50);

        moveBug();
    }

    void moveBug(){
        if ((frameCount % 60) == 0)
        {
         
            bugX += Math.random() * 5;
            bugY += Math.random() * 5;
            //random()
            //width-jalfBugWidth
            // Do something
            if ((frameCount % 120) == 0)
            {
                System.out.println("Eat Human");
            }
        }
    }
    
    //Run every second, 60 frames per second
    public void draw(){
        drawPlayer(playerX, playerY, playerWidth);
        shoot();
        drawBug(bugX, bugY, bugWidth);
     
        //keyPressed();
    }

    public void keyPressed()
	{
		if (keyCode == LEFT )
		{
            System.out.println("Left arrow pressed");
            if(!(playerX > 450))
                playerX -=10;
		}
		if (keyCode == RIGHT)
		{
            System.out.println("Right arrow pressed");
            if(!(playerX < 0))
                playerX +=10;
		}
		if (key == ' ')
		{
            System.out.println("SPACE key pressed");
            isShooting = true;
            frameShoot= frameCount;
		}
    }

    public void shoot(){
        //fill(0, 0, 255); 

        //strokeWeight(1);
        if(isShooting){
            if(frameCount < frameShoot+30)
            {
                System.out.println("BANG BANG!!!");
                stroke(0, 255, 255);
                strokeWeight(1);
                line(playerX, playerY, playerX, playerY-500);
            }
            else {
                isShooting = false;
            }
        }
       
    }
    
}

