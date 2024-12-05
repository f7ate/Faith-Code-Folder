grid g;

void setup() {
  size(1700, 800);
  g = new grid(10,10);
}

void draw () {
  background(220);
  g.displayGrid();
}

void mousePressed() {
  g.click(mouseX, mouseY);
}

void keyPressed() {
  if(key == 'c') {
    g.clear();
  }
  if(key == 'b') {
    g.blackout();
  }
  else if (key =='5') {
    g.five();
  }
  else if (key == '6') {
    g.six();
  }
  else if (key =='7') {
    g.seven();  
  }
}


class grid {
  int ROWS, COLS;
  boolean[][] gridarray;
  
  //Constructor
  grid(int tempr, int tempc) {
    ROWS = tempr;
    COLS = tempc;
    gridarray = new boolean[ROWS][COLS];
    
    for (int y = 0; y < ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        gridarray[y][x] = false;
      
      }
    }
    
  }
  
  void displayGrid() {
    
    for (int y = 0; y < ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        
        if (gridarray[y][x] == false) {
          fill(255); //White fill if false
        }
        else {
          fill(0); //Black fill if true
        }
        
        int cellWidth = width / COLS;
        int cellHeight = height / ROWS;
        
        //Starts drawing from top left corner of Rectangle
        rect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
      }
    }  
  }
  
  void click(int mx, int my) {
    int cellWidth = width / COLS;
    int cellHeight = height / ROWS;
    
    int x = mx / cellWidth;
    int y = my / cellHeight;
    
    if (gridarray[y][x] == false) {
      gridarray[y][x] = true; //Make it true if it is false
    }
    else { gridarray[y][x] = false; //Make it false if it is true
    }
    
  }
  
  void clear() {
    for (int y = 0; y < ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        gridarray[y][x] = false;
  }
 }
}

  void blackout() {
  for (int y = 0; y < ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        gridarray[y][x] = true;
      }
    }
  }
 
 void five() {
   for (int y = 0; y < ROWS; y++) {
     for (int x = 0; x < COLS; x++) {
       
       if(y == 5 || x == 5) {
         gridarray[y][x] = true;
         
       }
     }
   }
 }
 
 void six() {
   for (int y = 0; y < ROWS; y++) {
     for (int x = 0; x < COLS; x++) {
     
         if(y == 6 || x == 6) {
           gridarray[y][x] = true;
         }
       }
     }
   }

 void seven() {
   for (int y = 0; y < ROWS; y++) {
     for (int x = 0; x < COLS; x++) {
       
       if(y == 7 || x == 7) {
         gridarray[y][x] = true;
         
       }
     }
   }
 }
 
}
