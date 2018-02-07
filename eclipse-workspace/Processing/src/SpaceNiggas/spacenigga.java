package SpaceNiggas;

import processing.core.PApplet;
import processing.core.PImage;

public class spacenigga extends PApplet {
	public static void main(String[] args) {
		PApplet.main("spaceNiggas");
	}
	PImage myImage;
	int x =0;
	int y =0;
	int screenx = 400;
	int screeny = 400;
	int oldDirectionx= 0;
	int oldDirectionY =0;

	public void setup(){
	  size(400,400);
	  background(255);
	  myImage = loadImage("spacer.GIF");
	  image(myImage,x,y);
	}
	int oldY = myImage.height;
	public void draw(){
	  background(255);
	  move();
	  image(myImage,x,y);
	}
	  
	public void move(){
	  if(x+myImage.width<screenx){
	    if(oldDirectionx < x){
	      x++;
	    }
	    else{
	      if(x!=0){
	        x--;
	      }
	      else{
	        x++;
	        oldDirectionx = x-1;
	      }
	    }
	  }
	  else{
	    if(myImage.height != y-oldDirectionY){
	      y++;
	    }
	    else{
	      x--;
	      oldDirectionY = y;
	      oldDirectionx = x+1;
	    }
	  }
	}
}

