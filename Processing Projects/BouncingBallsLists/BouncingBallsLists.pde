ArrayList<Ball> ballGroup = new ArrayList<Ball>();
//Ball[] ballGroup;
//int pos = 0;

void setup() { // Happens once at launch
    size(1500, 720);
    background(200,200,200);
    ballGroup = new ArrayList<Ball>();
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);
    
    for (Ball theBall : ballGroup) {
      theBall.move();
      
      for (Ball otherBall : ballGroup) {
        theBall.checkCollision(otherBall);
      }
      theBall.display();
    }
    //Old Loop
    //for (int i = 0; i < ballGroup.size(); i++) {
    //    ballGroup.get(i).display();
    //    ballGroup.get(i).move();
    //}

}

void mousePressed() {
    ballGroup.add (new Ball(mouseX, mouseY, 70, false));
    }

void keyPressed() {
  if (key == 'c') {
    for (int i = ballGroup.size()-1; i >= 0; i--) {
      ballGroup.remove(i);
    }
  }
  
  //Inject infected object
  else if (key == 'j') {
    ballGroup.add(new Ball (width/2, height/2, 50, true));
  }
  
}
class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity
    int cr, cg, cb; //RGB Values
    int grav; //Gravity
    
    boolean infected;

    //Constructor
    Ball(int tempx, int tempy, int tempr, boolean tempinf) {
        x = tempx; //Set the x cord
        y = tempy; //Set the y cord
        r = tempr; //Set the radius
        
        infected = tempinf;

    //Set the Colour
        cr = int (random (0, 255));
        cg = int (random (0, 255));
        cb = int (random (0, 255));

        //Set Velocity & Gravity
        dx = int(random(-10,10));
        dy = int(random(-10,10));
        grav = 0; //Apply gravity to y
    
    }

    void display() {
        if (infected == true) {
        cr = 255;
        cg = 0;
        cb = 0;
        }
        
        fill(cr, cg, cb);
        circle(x,y,r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy = dy + grav;

        if (y >= height - r || y <= 0+r) {
            dy = dy * -1;
        }
        if (x >= width-r || x <= 0+r) {
            dx = dx * -1; 
        }
    }
    
    void checkCollision(Ball otherBall) {
      double distanceApart = dist(x, y, otherBall.x, otherBall.y);
      double threshold = r + otherBall.r;
      
      //Bounce the ball
      if (distanceApart < threshold) {
        //Store the first velocity
        int tempdx = dx;
        int tempdy = dy;
        
        //Ball 1 gets Velocity 2
        dx = otherBall.dx;
        dy = otherBall.dy;
        
        //Ball 2 gets Velocity 1
        otherBall.dx = tempdx;
        otherBall.dy = tempdy;
        
        //Pass the infection
        if (otherBall.infected == true) {
          infected = true;
        }
        
        else if (otherBall.infected == false && infected == true) {
          otherBall.infected = true;
        }
        
      }
      
    }
    
}
