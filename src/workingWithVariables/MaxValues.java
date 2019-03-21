package workingWithVariables;

public class MaxValues {
	public static void main(String[] args) 
	{
		byte b = 127; 
		System.out.println("Byte: " + b );
		
		if(b < Byte.MIN_VALUE)
		{
			b++;	
		}
		 
		System.out.println("Byt: " + b);
		
	}
}
