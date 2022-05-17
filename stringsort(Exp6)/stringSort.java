import java.io.*;
import java.util.*;

class stringSort{
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to be sorted: ");
        String str =(in.nextLine());//to lowercase
        String[] arr =str.split(" ");
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n;j++){
                if((arr[j].compareTo(arr[i]))<0){
                    String temp = arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        String s =String.join(",",arr);
        System.out.println("the sorted string is "+s);
        
    }
}