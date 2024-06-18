import java.awt.*;
import java.util.*;

class Ball extends Rectangle{
    Random random;
    int xVelocity; // speeds of the ball in x and y coordinates.
    int yVelocity;
    int initialSpeed = 2;

    

    Ball(int x, int y, int width, int height){
        super(x, y, width, height);
        random = new Random();

        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0){
            randomXDirection--;
        }setXDirection(randomXDirection * initialSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0){
            randomYDirection--;
        }setYDirection(randomYDirection * initialSpeed);

    }
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }
    public void move(){
        x+= xVelocity;
        y+= yVelocity;
    }
    public void draw(Graphics g){
        random = new Random();
        g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        g.fillOval(x, y, width, height);
    }

}