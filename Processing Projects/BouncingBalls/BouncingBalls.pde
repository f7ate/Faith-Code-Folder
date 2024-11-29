Ball[] ballGroup;
int pos = 0;

void setup() { // Happens once at launch
    size(1280, 720);
    background(200,200,200);
    ballGroup = new Ball[100];
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);
    
    for (int i = 0; i < pos; i++) {
        ballGroup[i].display();
        ballGroup[i].move();
    }

}

void mousePressed() {
    if (pos<ballGroup.length) {
    ballGroup[pos] = new Ball(mouseX, mouseY, 200);
    pos++; //Next empty position
    }
}


class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity
    int cr, cg, cb; //RGB Values
    int grav; //Graviity

    //Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx; //Set the x cord
        y = tempy; //Set the y cord
        r = tempr; //Set the radius

    //Set the Colour
        cr = int (random (0, 255));
        cg = int (random (0, 255));
        cb = int (random (0, 255));

        //Set Velocity & Gravity
        dx = int(random(-10,20));
        dy = int(random(-10,20));
        grav = -2; //Apply gravity to y
    
    }

    void display() {
        fill(cr, cg, cb);
        circle(x,y,r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy + dx = grav;

        if (y >= height - r || y <= 0+r) {
            dy = dy * -1;
        }
        if (x >= width-r || x <= 0+r) {
            dx = dx * -1; 
        }
    }
}