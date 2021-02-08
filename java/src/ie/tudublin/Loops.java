package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    public void draw() {
        background(0);
        switch (mode)
        {
            // case 0:
            //     ellipse(cx, cy, 100, 100);
            //     break;
             case 0:
             {
                ellipse(cx, cy, 100, 100);
             }
             break;
            //  case 3:
            //  {
            //      int numCircles = (int)(mouseX / 10.0f);
            //      float w = width / (float) numCircles;
            //      float cgap = 255 / (float) numCircles;
            //      for(int i=0; i <numCircles; i++){
                     
            //      }
            //  }
            
        }
    }
}
