import java.io.*;
import java.util.*;


public class Minprice{
    public static void main(String args[]){
        Product obj1 = new Product();
        Product obj2 = new Product();
        Product obj3 = new Product();
        
       
        obj1.getData();
        obj2.getData();
        obj3.getData(); 

        if((obj1.price < obj2.price)&&(obj1.price<obj3.price)){
             System.out.println(obj1.pname + " has the lowest price");
         }
        else if((obj2.price < obj1.price)&&(obj2.price<obj3.price)){
             System.out.println(obj2.pname + " has the lowest price");
         }
        else{
             System.out.println(obj3.pname + " has the lowest price");
         }   
    }
}

class Product{
    int pcode;
    String pname;
    float price;

    Scanner sc = new Scanner(System.in);

    void getData(){
        System.out.println("Enter the product details");
        
        System.out.println("product name");
        pname = sc.nextLine();
        System.out.println("product Id");
        pcode = sc.nextInt();  
        System.out.println("product Price");     
        price = sc.nextFloat();
    }

   /* void lowestPrice(){
        
    }*/   

}
