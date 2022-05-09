int time = 0;
float y1,y2,y3,y4,y5,y6,y7,x1,x2,x3,x4,x5,x6,x7,r,theta,theta1,niji;
int colrd;
void setup(){
  size(400, 400);
  frameRate(60);
  smooth();
  background(0);
  y1 = -10;
  y2 = -110;
  y3 = -210;
  y4 = -310;
  y5 = -410;
  y6 = -510;
  y7 = -610;
  x1 = -10;
  x2 = -110;
  x3 = -210;
  x4 = -310;
  x5 = -410;
  x6 = -510;
  x7 = -610;
  r=200;
  theta=180;
  theta1=1;
}

void draw(){
  if(0<=time && time<=50) en();
  if(50<=time && time<=51) background(0);
  if(51<=time && time<=151) sikakutate();
  if(151<=time && time<=251) sikakuyoko();
  if(251<=time && time<=252) background(#B3DFEC);
  if(252<=time && time<=432) niji();
  if(432<=time && time<=613) niji2();
  if(614<=time && time<=702) haikei();
  if(702<=time) nijien();
  time += 1;
}

void en(){
  float en = random(100);
  noStroke();
  colorRandom();
  ellipse(random(width), random(height), en, en);
}

void colorRandom() {
  color[] c = new color[7];
  c[0] = color(255,0,0);
  c[1] = color(255,150,0);
  c[2] = color(255,240,0);
  c[3] = color(0,135,0);
  c[4] = color(0,145,255);
  c[5] = color(0,100,190);
  c[6] = color(145,0,130);
  
   colrd = int(random(0, 6));    
  switch(colrd) {
    case 0:
    fill(c[0]);
    break;
    case 1: 
    fill(c[1]);
    break;
    case 2: 
    fill(c[2]);
    break;
    case 3: 
    fill(c[3]);
    break;
    case 4: 
    fill(c[4]);
    break;
    case 5: 
    fill(c[5]);
    break;
    case 6: 
    fill(c[6]);
    break;
    }
}

void sikakutate(){
  y1 += 10;
  fill(255,0,0);
  rect(0, y1, 57, 10);
  y2 += 10;
  fill(255,150,0);
  rect(57, y2, 57, 10);
  y3 += 10;
  fill(255,240,0);
  rect(114, y3, 57, 10);
  y4 += 10;
  fill(0,135,0);
  rect(171, y4, 57, 10);
  y5 += 10;
  fill(0,145,255);
  rect(228, y5, 57, 10);
  y6 += 10;
  fill(0,100,190);
  rect(285, y6, 57, 10);
  y7 += 10;
  fill(145,0,130);
  rect(342, y7, 58, 10);
}

void sikakuyoko(){
  x1 += 10;
  fill(255,0,0);
  rect(x1, 0, 10, 57);
  x2 += 10;
  fill(255,150,0);
  rect(x2, 57, 10, 57);
  x3 += 10;
  fill(255,240,0);
  rect(x3, 114, 10, 57);
  x4 += 10;
  fill(0,135,0);
  rect(x4, 171, 10, 57);
  x5 += 10;
  fill(0,145,255);
  rect(x5, 228, 10, 57);
  x6 += 10;
  fill(0,100,190);
  rect(x6, 285, 10, 57);
  x7 += 10;
  fill(145,0,130);
  rect(x7, 342, 10, 58);
}

void niji(){
  theta=theta+1;
  translate(0,200);
  strokeWeight(15);
  stroke(255,0,0);
  point(200+r*cos(radians(theta)),200+r*sin(radians(theta)));
  stroke(255,150,0);
  point(200+(r-15)*cos(radians(theta)),200+(r-15)*sin(radians(theta)));
  stroke(255,240,0);
  point(200+(r-30)*cos(radians(theta)),200+(r-30)*sin(radians(theta)));
  stroke(0,135,0);
  point(200+(r-45)*cos(radians(theta)),200+(r-45)*sin(radians(theta)));
  stroke(0,145,255);
  point(200+(r-60)*cos(radians(theta)),200+(r-60)*sin(radians(theta)));
  stroke(0,100,190);
  point(200+(r-75)*cos(radians(theta)),200+(r-75)*sin(radians(theta)));
  stroke(145,0,130);
  point(200+(r-90)*cos(radians(theta)),200+(r-90)*sin(radians(theta)));
}

void niji2(){
  theta1=theta1-1;
  translate(0,200);
  strokeWeight(16);
  stroke(#B3DFEC);
  point(200+r*cos(radians(theta1)),200+r*sin(radians(theta1)));
  stroke(#B3DFEC);
  point(200+(r-15)*cos(radians(theta1)),200+(r-15)*sin(radians(theta1)));
  stroke(#B3DFEC);
  point(200+(r-30)*cos(radians(theta1)),200+(r-30)*sin(radians(theta1)));
  stroke(#B3DFEC);
  point(200+(r-45)*cos(radians(theta1)),200+(r-45)*sin(radians(theta1)));
  stroke(#B3DFEC);
  point(200+(r-60)*cos(radians(theta1)),200+(r-60)*sin(radians(theta1)));
  stroke(#B3DFEC);
  point(200+(r-75)*cos(radians(theta1)),200+(r-75)*sin(radians(theta1)));
  stroke(#B3DFEC);
  point(200+(r-90)*cos(radians(theta1)),200+(r-90)*sin(radians(theta1)));
}

void haikei(){
  frameRate(10);
  if(615<=time && time<=625) background(0);
  if(625<=time && time<=626) background(#FF0000);
  if(626<=time && time<=636) background(0);
  if(636<=time && time<=637) background(#FFA500);
  if(637<=time && time<=647) background(0);
  if(647<=time && time<=648) background(#FFFF00);
  if(648<=time && time<=658) background(0);
  if(658<=time && time<=659) background(#008000);
  if(659<=time && time<=669) background(0);
  if(669<=time && time<=670) background(#00FFFF);
  if(670<=time && time<=680) background(0);
  if(680<=time && time<=681) background(#0000FF);
  if(681<=time && time<=691) background(0);
  if(691<=time && time<=692) background(#800080);
  if(692<=time && time<=702) background(0);
}

void nijien(){
  translate(0,0);
  fill(255,0,0);
  rect(0, 0, 400, 57);
  fill(255,150,0);
  rect(0, 57, 400, 57);
  fill(255,240,0);
  rect(0, 114, 400, 57);
  fill(0,135,0);
  rect(0, 171, 400, 57);
  fill(0,145,255);
  rect(0, 228, 400, 57);
  fill(0,100,190);
  rect(0, 285, 400, 57);
  fill(145,0,130);
  rect(0, 342, 400, 58);
}