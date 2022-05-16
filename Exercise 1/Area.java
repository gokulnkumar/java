import java.util.*;

public class Area{
    public static void main(String args[]){
    Rectangle obj1 = new Rectangle();
    Rectangle obj2 = new Rectangle();
 
    System.out.println("Area = " +obj1.rectArea());
    System.out.println("Area = " +obj2.rectArea());       
        
    }
} 

class Rectangle{
    int length,breadth;

    Scanner sc = new Scanner(System.in);

    void getdata()
   {
    System.out.println("Enter the length and breadth ");
    length = sc.nextInt();
    breadth = sc.nextInt();
   } 

   int rectArea(){
    getdata();
    int area = length * breadth;
    return area;
    
   }
}
       
