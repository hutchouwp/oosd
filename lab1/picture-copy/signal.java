
/**
 * Write a description of class signal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class signal
{
    private Square bord1;
    private Square bord2 ;
    private Square bord3 ;
    private Circle red ;
    private Circle yellow ;
    private Circle green ;

    
    public signal()
    {
        // initialise instance variables
        
    }

    public void draw(){
        bord1 = new Square();
        bord1.moveVertical(-50);
        bord1.changeSize(100);
        bord1.makeVisible();
        bord1.changeColor("black");
        
        bord2 = new Square();
        bord2.moveVertical(60);
        bord2.changeSize(100);
        bord2.makeVisible();
        bord2.changeColor("black");
        
        bord3 = new Square();
        bord3.moveVertical(170);
        bord3.changeSize(100);
        bord3.makeVisible();
        bord3.changeColor("black");

        red = new Circle();
        red.moveVertical(-50);
        red.moveHorizontal(50);
        red.changeSize(80);
        red.makeVisible();
        red.changeColor("red");
        
        yellow = new Circle();
        yellow.moveVertical(60);
        yellow.moveHorizontal(50);
        yellow.changeSize(80);
        yellow.makeVisible();
        yellow.changeColor("yellow");
        
        green = new Circle();
        green.moveVertical(170);
        green.moveHorizontal(50);
        green.changeSize(80);
        green.makeVisible();
        green.changeColor("green");
    }
    
}
