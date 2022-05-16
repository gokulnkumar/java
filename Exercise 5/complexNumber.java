import java.io.*;
import java.util.*;

class ComplexNumber {
	Scanner in = new Scanner(System.in);
	int real, image;

	public ComplexNumber()
	{
		System.out.println("Enter the Real number ");
		this.real = in.nextInt();
                System.out.println("Enter the image number ");
		this.image = in.nextInt();
	}
	public ComplexNumber(int r, int i)
        {
	        this.real = r;
	        this.image = i;
	}

	
	public void showC()
	{
		System.out.println(this.real + " +i" + this.image);
	}

	
	public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
	{
		ComplexNumber res = new ComplexNumber(0, 0);
		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;
		return res;
	}

	public static void main(String arg[])
	{
		
		ComplexNumber c1 = new ComplexNumber();
		ComplexNumber c2 = new ComplexNumber();

		System.out.print("first Complex number: ");
		c1.showC();
		
		System.out.print("\nSecond Complex number: ");
		c2.showC();

		ComplexNumber res = add(c1, c2);
		
		System.out.println("\nAddition is :");
		res.showC();
	}
}

