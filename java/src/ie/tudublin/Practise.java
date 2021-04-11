package ie.tudublin;

import processing.core.PApplet;

public class Practise extends PApplet{
    int cx,cy;
    public void settings()
	{
		// If you want to use the width and 
		// height variables, they have to be after settings 
		// is called
		size(1600, 1600);
       

	}

	
	public void setup() {
        colorMode(HSB);
		cx= height/2;
        cy= width/2;
        
	}

	// These are fields in the class now and can be used in 
	// any of the methods in the HelloProcessing2 class 
	

    public int clickColour;
	public void draw()
	{	
        clickColour =(int)mouseX/ 360;
        background(0, 100, 100);
        fill(50 * clickColour, 100, 100);
        circle(cx, cy, cx);
        fill(180 * clickColour, 100, 100);
        //triangle(400, 200, 200, 600, 600, 600);
        triangle(cx/1.0f, cy/2.0f, cx/2.0f, cy*1.5f, cx*1.5f, cy*1.5f);
        fill(0 * clickColour, 0, 70);
        ellipse(cx, cy, cx/2.0f, cy/4.0f);
        fill(0 * clickColour, 0, 0);
        circle(cx, cy, cx/8.0f);
	}
}

// public class Practise extends PApplet {

//     Minim minim; // Connect to minim
//     AudioInput ai; // How to connect to mic
//     AudioPlayer ap;
//     AudioBuffer ab; // Samples

//     float[] lerpedBuffer;

//     public void settings() {
//         size(1000, 1000, P3D);
//         //fullScreen(P3D, SPAN); // Try this for full screen multiple monitor support :-) Be careful of exceptions!
//     }

//     float y = 200;
//     float lerpedY = y;

//     int which = 0;

//     public void setup() {
//         minim = new Minim(this);
//         //ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
//         ap = minim.loadFile("heroplanet.mp3", width);
//         ap.play();
//         ab = ap.mix; // Connect the buffer to the mp3 file
//         //ab = ai.mix; 
//         colorMode(HSB);
//         lerpedBuffer = new float[width];

//     }

//     public void keyPressed() {
//         if (keyCode >= '0' && keyCode <= '6') {
//             which = keyCode - '0';
//         }
//         if (keyCode == ' ') {
//             if (ap.isPlaying()) {
//                 ap.pause();
//             } else {
//                 ap.rewind();
//                 ap.play();
//             }
//         }
//         if (keyCode == UP)
//         {
//             twoCubes = ! twoCubes;
//         }
//     }

//     float lerpedAverage = 0;
//     private float angle = 0;

//     private boolean twoCubes = false;

//     public void draw() {
//         background(0);
//         stroke(255);
//         float halfHeight = height / 2;
//         float average = 0;
//         float sum = 0;

//         // Calculate the average of the buffer
//         for (int i = 0; i < ab.size(); i ++)
//         {
//             sum += abs(ab.get(i));
//         }
//         average = sum / ab.size();
//         // Move lerpedAverage 10% closer to average every frame
//         lerpedAverage = lerp(lerpedAverage, average, 0.1f);

//         switch (which)
//         {
//             case 0:
//             {
//                 // Iterate over all the elements in the audio buffer
//                 for (int i = 0; i < ab.size(); i++) {

//                     float c = map(i, 0, ab.size(), 0, 255);
//                     stroke(c, 255, 255);
//                     lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);
        
//                     line(i, halfHeight - lerpedBuffer[i] * halfHeight * 4, halfHeight + lerpedBuffer[i] * halfHeight * 4, i);
//                 }        
//                 break;
//             }   
//             case 1:
//             {
              
//                 break;
//             }
//             case 2:
//             {
              
//                 break;
//             }
//             case 3:
//             {
               
//                 break;
//             }
//             case 4:
//             {
               
//                 break;
//             }
//             case 5:
//             {
                
//                 break;
//             }
//         }        
//     }
// }