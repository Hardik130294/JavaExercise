package ApnaCollage.com.io.advance;

class Pen {
    String color;
   
    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}
  
 public class OopsPen {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
  
        Pen p2 = new Pen();
        p2.color = "black";
  
        Pen p3 = new Pen();
        p3.color = "red";
  
        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
 
