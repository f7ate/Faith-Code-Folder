Ball redball;

void setup() { //Happens once at launch
    size(1280, 720);
    background(200, 200, 200);
    redball = new Ball();

}
void draw() { //Happens constantly (Screen Refresh)
    background(200, 200, 200);
    redball.display();
    redball.move();
}

class Ball {
    int x, y, r;

    //Constructor
    Ball() {
        x = 300:
        y = 300;
        r = 100;
    }

    void display() {
        circle(x, y, r*2);
    }

    void move() {
        if (y <= height-r) {
            y++;
            x++;
        }
    }
}