package ie.tudublin;

import processing.core.PApplet;

public class MapFunction extends PApplet {
    public float map1(float from, float start1, float stop1, float start2, float stop2) {
        float range1 = stop1 - start1;//10
        float range2 = stop2 - start2;//500
        float howFar = from - start1;//-8
        return start2 + (howFar / range1) * range2;//here
    }

     public void settings() {
        size(500, 500);

        // Testing the map function
        float f = map1(2, 0, 10, 0, width);
        println(f); // Should print 100

        f = map1(9, 0, 1, 0, 10);
        println(f); // Should print 90

        f = map1(250, 200, 300, 400, 500);
        println(f); // Should print 450

        f = map1(5, 0, 10, 1000, 2000);
        println(f); // Should print 1500

    }


}
