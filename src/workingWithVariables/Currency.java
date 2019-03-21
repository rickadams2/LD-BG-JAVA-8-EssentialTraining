package workingWithVariables;

import java.math.BigDecimal;

public class Currency { 

 public static void main(String[] args) {
	 
	 double value = .012; 
	 
	 double primitiveSum = value + value + value; 
	 
	 System.out.println("Sum of primitievs: " +primitiveSum);
	 
	 String stringValue = Double.toString(value); 
	 System.out.println("stringValue: "  + stringValue);
	 BigDecimal bigValue = new BigDecimal(stringValue);
	 
	 BigDecimal BigSum = bigValue.add(bigValue).add(bigValue);
	 
	 System.out.println("Sum of BigDecimals " + BigSum.toString());
	 
 }
}
