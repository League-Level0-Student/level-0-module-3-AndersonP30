
void setup() {
 
  // set the size of your sketch
  size(600, 600);
}

void draw() {
  
  //Starting with the lar;gest ellipse, use a for loop to draw a bullseye with ellipses.
  int x=400;
  int y=400;
  //Use an if statement and modulo to alternate the color of your rings.
  for(int i = 0; i<= 6; i++){
   if (i % 2 == 0){
     fill(250, 1, 1);
   }
   else
   fill(1, 1, 250);
   ellipse(300, 300, x, y);
   x-=50;
   y-=50;
  }
}
