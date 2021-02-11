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
        noStroke();
     
        switch (mode)
        {
             case 0:
                //ellipse(cx, cy, 100, 100);
                fill(50, 255, 255);
                
                //https://processing.org/reference/rect_.html
                //rect(cx, cy, 250, 250);
                if(mouseX < cx){
                    rect(0, 0, cx, height);
                }else{
                    rect(cx, 0, cx, height);
                }
             
                break;
             case 1:
                if(mouseX < cx && mouseY < cy){
                    rect(0, 0, cx, cy);
                } else if(mouseX > cx && mouseY < cy){
                    rect(cx, 0, cx, cy);
                } else if(mouseX < cx && mouseY > cy){
                    rect(0, cy, cx, cy);
                } else {
                    rect(cx, cy, cx, cx);
                }
                break;
            case 2:
            {
                int numRects = (int)(mouseX/ 10.0f);//Affects num of rects
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects;
                for(int i=0; i < numRects; i++ ){
                    //Please Look Over
                    fill(i * cgap, 255, 255);//cgap
                    //Please Look Over
                    rect(i * w, 0, w, height);
                }   
                break;
            }
            case 3:
            {
                int numCircles = (int)(mouseX / 60.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
                for(int i=0; i <numCircles; i++){
                    fill(i * cgap, 255, 255);
                   // ellipse(i* w, 0, w, cy);
                    ellipse(w /2 + ( i * w), cy, w, w);
                    // ellipse(w /2 + ( i * w), cy, w, w);
                    // ellipse(w /2 + ( i * w), cy, w, w);
                    // ellipse(w /2 + ( i * w), cy, w, w);
                }
                    
                break;
            }
            //Order Broken
            //Line diagonal
            case 4:
            {
                // int numSquares = (int)(mouseX / 60.0f);
                // float w = width / (float) numSquares;
                // float cgap = 255 / (float) numSquares;
                // for(int i=0; i <numSquares; i++){
                //     fill(i * cgap, 255, 255);
                //     rect(w, w, w, w);
                // }
                rectMode(CORNER);
                int numSquares = (int)(mouseX / 10.0f);
                float w = width / (float) numSquares;
                float cgap = 255 / (float) numSquares;
                for(int i=0; i <numSquares; i++){
                    fill(i * cgap, 255, 255);
                    rect(i * w, i * w, w, w);
                }
                break;
            }
            case 5:
            {
                rectMode(CORNER);
                int numSquares = (int)(mouseX / 10.0f);
                float w = width / (float) numSquares;
                float cgap = 255 / (float) numSquares;
                int j=numSquares;
                for(int i=0; i <numSquares; i++){
                    fill(i * cgap, 255, 255);
                    rect(i * w, i * w, w, w);
                    j--;
                    rect(j * w, i * w, w, w);
                }
                break;
            }
            case 6://Circle coming concentric
            {
                int numCircles = (int)(mouseX / 60.0f);//special num for circle
                int w=100;
                float cgap = 255 / (float) numCircles;
                for(int i=numCircles; i >0; i--){
                    fill(i * cgap, 255, 255);
                    ellipse(cx, cy, i*w , i*w);
                    w++;
                }
                break;
            }
            case 7://Circle in a square
            {
                int numCircles = (int)(mouseX / 30.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
               
                for(int i=0; i <numCircles; i++){
                    fill(i * cgap , 255, 255);
                    for(int j=0; j<numCircles; j++){
                        // float saturation = 255/i;
                        // float brightness = 255/j;
                      //100??? Max value
                       // fill(j * cgap , 255, 255);
                        ellipse(w /2 + ( i * w), w /2 + ( j * w), w, w);
                    }
                }
                break;
            }
            case 8:
            {
                
                break;
            }
            // case 9:
            // {
                
            //     break;
            // }
            // case 9:
            // {
            //     int numLines =5;
            //     float theta = TWO_PI / (float) numLines;
            //     float radius = 100;
            //     for(int i=0; i < numLines; i++){
            //         float angle = theta * i;
            //         float x = sin(angle) * radius;
            //         float y = cos(angle) * radius;
            //         line(cx, cy, cx+ x, cy+ y);
            //     }
            //     break;
            // }
            case 9:
            {
                int numLines =5;
                float theta = TWO_PI / (float) numLines;
                float radius = 100;
                for(int i=0; i < numLines; i++){
                    float angle = theta * i;
                    float x = sin(angle) * radius;
                    float y = cos(angle) * radius;
                    line(cx, cy, cx+ x, cy+ y);
                }
                break;
            }
        }
    }
}
