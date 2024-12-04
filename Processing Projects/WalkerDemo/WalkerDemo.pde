// Walker Demo
// Intro to keyboard input for movement
Walker joe, jane, sally, tim, sandra;

void setup() {
    size(1500, 700);
    //Users
    joe = new Walker(width/2, height/2, false);
    jane = new Walker (width/2+30, height/2-70, false);
    //NPCs or Computers
    sally = new Walker((int)random(0, width), (int)random(0, height), true);
    tim = new Walker((int)random(0, width), (int)random(0, height), true);
    sandra = new Walker((int)random(0, width), (int)random(0, height), true);
}

void draw() {
    background (255);
    joe.display();
    jane.display();

    sally.display();
    sally.move(0);
    tim.display();
    tim.move(0);
    sandra.display();
    sandra.move(0);

}

void mousePressed() {

}

void keyPressed() {
    //For arrows, use 'keyCode' and UP, DOWN, ENTER, etc.. *Special Keys*
    //For ACSII char's, use 'key' and'a', 'w', etc.. *Special Characters*

    //Joe / Arrow Key Input
    if (keyCode == UP) {
        joe.move(0);
    }
    else if (keyCode == RIGHT) {
        joe.move(1);
    }
    else if (keyCode == DOWN) {
        joe.move(2);
    }
    else if (keyCode == LEFT) {
        joe.move(3);
    }
    
    //Jane/ WASD Input
    if (key == 'w') {
        jane.move(0);
    }
    else if (key == 'd') {
        jane.move(1);
    }
    else if (key == 's') {
        jane.move(2);
    }
    else if (key == 'a') {
        jane.move(3);
    }


}