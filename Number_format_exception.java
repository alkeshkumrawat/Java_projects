package Number_Format_Exception;

import java.io.*;

public class Number {

	public static void main(String[] args) throws NumberFormatException , IOException
	{
		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the value");
		int value = Integer.parseInt(i.readLine());
		System.out.println("output is"+value);

	}

}
