class Walker {   //Doesn't need parentheses ()
int x, y; //Posistion Variables
int size;
int speed;
int cr, cg, cb;
boolean npc; //"Is this a computer?"

    //Constructor
    Walker(int tempx, int tempy, boolean tempnpc) {
        x = tempx;
        y = tempy;
        size = 25;
        speed = 5;
        npc = tempnpc; //If true, automate!
        cr = (int) random(0, 255);
        cg = (int) random(0, 255);
        cb = (int) random(0, 255);


    }
    
    void display() {
        fill(cr, cg, cb);
        //rect (xpos, ypos, width, height)
        rect(x, y, size, size);

    }

    //direction variable --> 0 = up, 1 = right, 2 = down, 3 = left
    void move(int dir) {

        //Computer Movement
        if (npc) {
            dir = (int) random(0,3);

        }

        //User Movement
        
            //move up
            if (dir == 0 && y >= 0) {
                y = y - speed;
            }
            //move right
            else if (dir == 1 && x < width) {
                x = x + speed;
            }
            //move down
            else if (dir == 2 && y < height) {
                y = y + speed;
            }
            //move left
            else if (dir == 3 && x > 0) {
                x = x - speed;
        }
    }
}