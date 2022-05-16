import java.io.*;
import java.util.*;

public class Matrix{
    public static void main (String args []){
		matrixAddition obj1 = new matrixAddition();
		matrixAddition obj2 = new matrixAddition();

		obj1.getMatrix();
		obj2.getMatrix();

		System.out.println("The first matrix ");
		obj1.display();
		System.out.println("The second matrix ");
        obj2.display();

		System.out.println("The matrix after addition ");
		obj1.matrixSum(obj2);

    }
}

class matrixAddition{
    int i,j,size1,size2;
	int[][] mat = new int[5][5];
    Scanner in = new Scanner(System.in);
	
    void getData(){
        System.out.println("Enter the size of matrix ");
        size1 = in.nextInt();
        System.out.println("Enter the size of matrix ");
        size2 = in.nextInt();
        }
    
    void getMatrix(){
		getData();
        System.out.println("Enter the matrix ");
        for(i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
            	mat[i][j] = in.nextInt();
                }
			}
		}

	 void display(){
		for(i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
            	System.out.print(mat[i][j]+" ");
                }
      		System.out.println("");
			}				
	}
	
	void matrixSum(matrixAddition obj1){
		int[][] sum = new int[5][5];
		for (i = 0; i < size1; ++i){
    		for (j = 0; j < size2; ++j) {
      			sum[i][j] = this.mat[i][j] + obj1.mat[i][j];
    		}
		}
		for(i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
            	System.out.print(sum[i][j]+" ");
                }
      		System.out.println("");
			}			
	}

}
		
            
