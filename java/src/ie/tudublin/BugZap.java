package ie.tudublin;

import java.util.Random;
import java.util.concurrent.locks.LockSupport;

import processing.core.PApplet;

public class BugZap extends PApplet {
    private float playerX=250;
    private float playerY=450;
    private float playerWidth=40;

    private float bugX=10;
    private float bugY=10;
    private float bugWidth=50;
    float halfPlayerWidth = playerWidth / 2;

    private boolean isShooting=false;
    private int frameShoot=0;

    private int score=0;

    //Start
    public void settings(){
        size(500, 500);//px
    }
    
    public void setup(){
        //colorMode(HSB);
        //Changes background of screen to black
        //background(255);
    }

    void drawPlayer(float x, float y, float w){
        fill(50, 92, 10);
        rect(x, y, 30, w);
    }
    
    
    void drawBug(float x, float y, float w){
        stroke(255);
        fill(0, 255, 0);
        ellipse(x, y, 50, 50);
    }

    void moveBug(){
        if ((frameCount % 60) == 0){
            bugX += Math.random() * 5;
            bugY += Math.random() * 5;
        }
    }
    
    //Run every second, 60 frames per second
    public void draw(){
        background(255);
        //fill(0, 255, 0);
        drawPlayer(playerX, playerY, playerWidth);
        shoot();
        drawBug(bugX, bugY, bugWidth);
        moveBug();
      

        text("Score: " + score, 20, 20);
    }

    public void keyPressed(){
		if (keyCode == LEFT ) {
            if(!(playerX > 450))
                playerX -=10;
		} if (keyCode == RIGHT) {
            if(!(playerX < 0))
                playerX +=10;
		} if (keyCode == ' ') {
            //System.out.println("SPACE key pressed");
            isShooting = true;
            frameShoot= frameCount;
		}
    }

    void resetBug() {
        bugX = random(bugWidth, width- bugWidth );
		bugY = 50;
	}

    public void shoot(){
        if(isShooting){
            if(playerX > bugX && playerY < bugY){
                System.out.println("Score");
                line(halfPlayerWidth, playerY, halfPlayerWidth, bugY);
				score ++;
                resetBug();
            }else {
                if(frameCount < frameShoot+30){
                    stroke(0, 255, 255);
                    strokeWeight(1);
                    line(playerX + halfPlayerWidth, playerY, playerX +halfPlayerWidth, playerY-500);
                } else {
                    isShooting = false;
                }
            }
        }
    }   
}

