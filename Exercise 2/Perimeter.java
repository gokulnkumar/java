import java.util.*;

public class Perimeter{
    public static void main(String args[]){
    Rectangle obj1 = new Rectangle();
    Rectangle obj2 = new Rectangle(100,200);
 
    System.out.println("Area = " +obj1.rectPeri());
    System.out.println("Area = " +obj2.rectPeri());       
        
    }
} 

class Rectangle{
    int length,breadth;
    Scanner sc = new Scanner(System.in);

    Rectangle()
    {
    System.out.println("Enter the length and breadth ");
    length = sc.nextInt();
    breadth = sc.nextInt();
    } 

    Rectangle(int l,int b)
    {
    length = l;
    breadth = b; 
    } 


   int rectPeri(){   
    return((2*(length + breadth)));
     
   }
}
       
