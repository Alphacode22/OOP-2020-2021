package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

/*This file is for educational purposes*/

class SnakeGame extends PApplet {
    ArrayList<Integer> x = new ArrayList<Integer>(), y = new ArrayList<Integer>();// This is for the snake body
    //initial values
    int w=30, h=30,     //weight and height of screen
    blocks=20,          //the size of "each side" of the snake
    direction=2,        //direction of snake
    foodx=15, foody=15, //food position
    speed = 8,          //snake speed
    fc1 = 255, fc2 = 255, fc3 = 255; // food colours
    int[]x_direction={0, 0, 1, -1}, y_direction={1, -1, 0, 0}; //direction for x and y
    boolean gameover=false; //Is game over?

    //Called first by applet?
    public void settings(){
        size(600, 600);
    }

    public void setup() {
        // snake start position
        x.add(0); 
        y.add(15);  
    }

    public void draw() {
        background(0);
        // snake color green
        fill(0, 255, 0);//green
        //for each blocks of the snake we need to draw
        for (int i = 0; i < x.size(); i++)
            // snake 
            rect(x.get(i) * blocks, y.get(i) * blocks, blocks, blocks);

        //if game ended
        if (!gameover) {
            // food color red
            fill(fc1, fc2, fc3); 
             // food which allows is relatively distanced to the snake
            ellipse(foodx * blocks + 10, foody * blocks + 10, blocks, blocks);

             // score screnn
            textAlign(LEFT);
            textSize(25);
            fill(255);
            text("Score: " + x.size(), 10, 10, width - 20, 50);

            //?
            if (frameCount % speed == 0) {
                // make the snake longer
                x.add(0, x.get(0) + x_direction[direction]); 
                y.add(0, y.get(0) + y_direction[direction]);

                // if we hit a wall;
                if (x.get(0) < 0 || y.get(0) < 0 || x.get(0) >= w || y.get(0) >= h)
                    gameover = true;

                // for all of our body parts
                for (int i = 1; i < x.size(); i++)
                    // if we hit ourselves
                    if (x.get(0) == x.get(i) && y.get(0) == y.get(i))
                        gameover = true;
                // new food if we touch
                if (x.get(0) == foodx && y.get(0) == foody) { 
                    // we eat food
                    if (x.size() % 5 == 0 && speed >= 2)
                        // every 5 points speed increase
                        speed -= 1; 

                    //spawn new food
                    // new food
                    foodx = (int) random(0, w); 
                    foody = (int) random(0, h);
                    
                    // new food color
                    fc1 = (int) random(254);
                    fc2 = (int) random(254);
                    fc3 = (int) random(254); 
                } else {
                    //remove that body parts as it is moving across screen
                    x.remove(x.size() - 1);
                    y.remove(y.size() - 1);
                }
            }
        } else {
            //Death screen
            fill(200, 200, 0);
            textSize(30);
            textAlign(CENTER);
            text("GAME OVER \n Your Score is: " + x.size() + "\n Press ENTER", width / 2, height / 3);

            //if we press enter
            if (keyCode == ENTER) {
                //new game
                x.clear();
                y.clear();
                x.add(0);
                y.add(15);
                direction = 2;
                speed = 8;
                gameover = false;
            }
        }
    }

   
    public void keyPressed() {
         //Take input from keyboard
        int newdir = keyCode == DOWN ? 0 : (keyCode == UP ? 1 : (keyCode == RIGHT ? 2 : (keyCode == LEFT ? 3 : -1)));
        
        //if no input facing same direction
        if (newdir != -1)
            direction = newdir;
    }
}