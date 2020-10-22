void setup() {
	size(500, 500);
}

void draw() {
a = 255;
y = 120;
x = 420;
p = 0;
q = 175;
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

  background(a);
  stroke(p);
  fill(175);
 r = random(p,a);
 g = random(p,a);
 b = random(p,a);
 fill(r,g,b);
 ellipse(y,y,y,y);
 ellipse(y,x,y,y);
 ellipse(x,y,y,y);
 ellipse(x,x,y,y);
 variable3 = variable3 + 2
}