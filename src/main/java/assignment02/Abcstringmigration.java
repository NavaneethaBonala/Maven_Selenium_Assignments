package assignment02;

public class Abcstringmigration {

	/*

	 *
	 * .
	 * 
	 *
	 * 
	 * 
	 * ▪Validate if the ‘a’ variable start with “ab” and the ‘b’ variable should not ends with “yz”.
	 * ▪Validate if the ‘c’ variable contains space and should not contain9.Note:All the operations will be performed under a single class named AbcStringMigration.class.Enhancements for code
	 * ▪Follow basic Java programming standards and naming conventions.

	 */


	public static void main(String[] args) {
		
		String a= "abcdef";
		String b= "xyz1234";
		String c= "abcxy";

		int Alength = a.length();
		int Blength = b.length();
		int Clength = c.length();
		

System.out.println("verify the length of the ‘a’ variable should be greater than the length of the c variable and should be less than the length of the b variable.");

//Validated if the length of the ‘a’ variable is greater than the length of‘b’ and less than the length of the ‘c’ variable
		System.out.println("A Length is "+ Alength + "\n"+"B Length is "+ Blength + "\n"+"C Length is "+ Clength + "\n");
		if((Alength > Clength) && (Alength < Blength)) {
			System.out.println(" C < A < B");
		}else {
			System.out.println("Length of String a doesnt satisfy the condition");
		}

		System.out.println("\n\n");
		
		System.out.println("'a' variable should not be the same as the ‘b’ variable and ‘c’ variable.");
		
		System.out.println("A = "+ a +"\n"+ "B = "+b+"\n"+"C = "+c+"\n");
		if (!a.equals(b) && !a.equals(c)) {
			System.out.println("'a' variable is not same as 'b' and 'c' variable");
		} else {
			System.out.println("'a' variable is same as 'b' and 'c' variable");
		}
		
				System.out.println("\n\n");


		System.out.println("convert the ‘b’ variable into uppercase and verify it should contain “Z” andshould not contains “z”.");
		System.out.println("B = "+ b );
		String UpperCaseB = b.toUpperCase();
		System.out.println("B UpperCase = " + UpperCaseB);
				if(UpperCaseB.contains("Z") && !UpperCaseB.contains("z")) {
					System.out.println("'b' variable contain 'Z' and doesnt contains 'z' after variable 'b' is converted to Upper Case");
				}else {
					System.out.println("'b' variable contain 'z' and doesnt contains 'Z' after variable 'b' is converted to Upper Case");
				}
				
		

		System.out.println("\n\n");
		
		System.out.println("Validated if the length of the ‘a’ variable is greater than the length of‘b’ and less than the length of the ‘c’ variable");
		
		System.out.println("A Length is "+ Alength + "\n"+"B Length is "+ Blength + "\n"+"C Length is "+ Clength );
		
		   if (Alength > Blength && Alength < Clength) {
	            System.out.println("The length of 'a' is between the lengths of 'b' and 'c'.");
	        } else {
	           System.out.println("'a' is not greater than 'b' and not less then 'c'");
	        }

			System.out.println("\n\n");

		 System.out.println("‘c’ variable should be the same as a variable irrespective of the case");
			System.out.println("C = "+ c );

			String UpperCaseC = c.toUpperCase();
			System.out.println("C UpperCase = "+ UpperCaseC );

			if(UpperCaseC.equals(c)) {

				System.out.println("‘c’ variable should be the same as a variable irrespective of the case");

			}
			else {
				System.out.println("'c' variable is not same variable, irrespective of the case");
			}		
		
		System.out.println("\n\n");

		System.out.println("‘a’ variable should contain cd and should not contain xy.");
		
		System.out.println("A = "+ a );

		if(a.contains("cd") && !a.contains("xy")) {
			System.out.println("‘a’ variable contains cd and  not contain xy");
		}else {
			System.out.println("'a' variable doesnt contains 'cd'");
		}		
		System.out.println("\n\n");
		
		System.out.println("Perform concatenate on ‘a’ and ‘b’ variables and verify the length is less than the ‘c’ variable’s length or greater than 5.");
		System.out.println("A = "+ a );
		System.out.println("B = "+ b );

		String concate = a+b;
		System.out.println("A and B Concatenation = " +concate);
		if(concate.length()<Clength) {
			System.out.println("Length of 'a'and 'b'together is less than length of 'c' variable");
		}else {
			System.out.println("Length of 'a' and 'b' together is greater than 5 i.e, "+concate.length());
		}
		
		System.out.println("\n\n");

		System.out.println("Validate if the ‘a’ variable start with “ab” and the ‘b’ variable should not ends with “yz”.");
		
		System.out.println("A = "+ a );
		System.out.println("B = "+ b );
		
		if(a.startsWith("ab") && !b.endsWith("yz")) {
			System.out.println("'a' starts with 'ab' and 'b' doesnt end with 'yz'");
		}
		else {
			System.out.println("'a' and 'b' doesnt meet the requirement");
		}
		
		System.out.println("\n\n");

		System.out.println("Validate if the ‘c’ variable contains space and should not contain 9");
		
		System.out.println("C = "+ c );

		if(c.contains(" ") && !c.contains("9")) {
			System.out.println("‘c’ variable contains space and doesnt contain 9");
		}else if(!c.contains(" ") ){
			System.out.println("‘c’ variable doesnt contains space");
		}
		
		
	}

}
