package com.ontariotechu.sofe3980U;
import java.lang.StringBuilder;
import java.sql.SQLOutput;

/**
 * Unsigned integer Binary variable
 *
 */
public class Binary
{
	private String number="0";  // string containing the binary value '0' or '1'
	/**
	 * A constructor that generates a binary object.
	 *
	 * @param number a String of the binary values. It should conatins only zeros or ones with any length and order. otherwise, the value of "0" will be stored.   Trailing zeros will be excluded and empty string will be considered as zero.
	 */
	public Binary(String number) {
		for (int i = 0; i < number.length(); i++) {
			// check each character if it's not 0 or 1
			char ch=number.charAt(i);
			if(ch!='0' && ch!='1') {
				number="0"; // if not store "0" and end the function
				return;
			}
		}
		// remove any trailing zeros
		int beg;
		for (beg = 0; beg < number.length(); beg++) {
			if (number.charAt(beg)!='0')
				break;
		}
		//beg has the index of the first non zero digit in the number
		this.number=number.substring(beg); // exclude the trailing zeros if any
		// uncomment the following code

		if(this.number=="") { // replace empty strings with a single zero
			this.number="0";
		}

	}
	/**
	 * Return the binary value of the variable
	 *
	 * @return the binary value in a string format.
	 */
	public String getValue()
	{
		return this.number;
	}
	/**
	 * Adding two binary variables. For more information, visit <a href="https://www.wikihow.com/Add-Binary-Numbers"> Add-Binary-Numbers </a>.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary add(Binary num1,Binary num2)
	{
		// the index of the first digit of each number
		int ind1=num1.number.length()-1;
		int ind2=num2.number.length()-1;
		//initial variable
		int carry=0;
		String num3="";  // the binary value of the sum
		while(ind1>=0 ||  ind2>=0 || carry!=0) // loop until all digits are processed
		{
			int sum=carry; // previous carry
			if(ind1>=0){ // if num1 has a digit to add
				sum += (num1.number.charAt(ind1)=='1')? 1:0; // convert the digit to int and add it to sum
				ind1--; // update ind1
			}
			if(ind2>=0){ // if num2 has a digit to add
				sum += (num2.number.charAt(ind2)=='1')? 1:0; // convert the digit to int and add it to sum
				ind2--; //update ind2
			}
			carry=sum/2; // the new carry
			sum=sum%2;  // the resultant digit
			num3 =( (sum==0)? "0":"1")+num3; //convert sum to string and append it to num3
		}
		Binary result=new Binary(num3);  // create a binary object with the calculated value.

		return result;

	}


	/*
	 * Method computers the OR operation of two Binary values.
	 * Parameters must be two Binary Objects.
	 */
	public static Binary OR(Binary num1, Binary num2)
	{

		String s1 = num1.getValue();
		String s2 = num2.getValue();

		// In the case of numbers of different digit amounts, equalize them by adding 0's the the front of the shorter number

		if (s1.length() != s2.length()){

			//temp will have the appropriate amount of 0's added and be concatenated to the shorter number
			String temp = "";
			if (s1.length() > s2.length()){
				for(int i = s1.length()-s2.length(); i > 0; i--){
					temp += "0";
				}
				s2 = temp + s2;
			}
			else{
				for(int i = s2.length()-s1.length(); i > 0; i--){
					temp += "0";
				}
				s1 = temp + s1;
			}
		}

		//Compute the OR value
		String result = "";
		for (int i = 0; i < s1.length(); i++)
		{
			char b1 = s1.charAt(i); //get character from first binary object at position i
			char b2 = s2.charAt(i); //get character from second binary object at position i
			result += ((Integer.parseInt(String.valueOf(b1)) | Integer.parseInt(String.valueOf(b2)))); //add the result of the bitwise OR operation to the string holding the result
		}
		Binary resultBinary =new Binary(result); //create a binary object of the resulting string to return the final value
		return resultBinary;
	}

	/*
	 * Method computes the AND operation of two Binary values.
	 * Parameters must be two Binary Objects.
	 */
	public static Binary AND(Binary num1, Binary num2)
	{
		//convert the binary objects to strings
		String s1 = num1.getValue();
		String s2 = num2.getValue();

		// In the case of numbers of different digit amounts, equalize them by adding 0's the the front of the shorter number

		if (s1.length() != s2.length()){

			//temp will have the appropriate amount of 0's added and be concatenated to the shorter number
			String temp = "";
			if (s1.length() > s2.length()){
				for(int i = s1.length() - s2.length(); i > 0; i--){
					temp += "0";
				}
				s2 = temp + s2;
			}
			else{
				for(int i = s2.length() - s1.length(); i > 0; i--){
					temp += "0";
				}
				s1 = temp + s1;
			}
		}

		//Compute the AND value
		String result = "";
		for (int i = 0; i < s1.length(); i++)
		{
			char b1 = s1.charAt(i); //get character from the first binary object at position i
			char b2 = s2.charAt(i); //get character from the second binary object at position i
			result += ((Integer.parseInt(String.valueOf(b1)) & Integer.parseInt(String.valueOf(b2)))); //add the result of the bitwise OR operation to the string holding the result

		}

		Binary resultBinary =new Binary(result); //create a binary object of the resulting string to return the final value
		return resultBinary;

	}

	/*
	 * Method performs the multiplication of two Binary values.
	 * Parameters must be two Binary Objects.
	 */
	public static Binary mult(Binary a, Binary b) {
		Binary result = new Binary("0");


		String s1 = a.getValue();
		String s2 = b.getValue();

		// In the case of numbers of different digit amounts, equalize them by adding 0's the the front of the shorter number

		if (s1.length() != s2.length()){

			//temp will have the appropriate amount of 0's added and be concatenated to the shorter number
			String temp = "";
			if (s1.length() > s2.length()){
				for(int i = s1.length() - s2.length(); i > 0; i--){
					temp += "0";
				}
				s2 = temp + s2;
			}
			else{
				for(int i = s2.length() - s1.length(); i > 0; i--){
					temp += "0";
				}
				s1 = temp + s1;
			}
		}

		//Create two binary objects from the string values
		Binary m = new Binary(s1);
		Binary q = new Binary(s2);

		//update the binary objects to have the updated and not concatenated string values as their number
		m.number = s1;
		q.number = s2;

		//Checks  from left to right if each digit the second binary number is 1.
		for (int i = 0; i < q.getValue().length(); i++) {
			if (q.getValue().charAt(i) == '1') {
				result = add(result, m.shiftLeft(m.getValue().length()-1-i)); //If the value is 1, then shift the values of the first binary object so it's last digit is aligned with the current 1's digit in s1.
				//Then perform the bitwise add of the current result value and the shifted binary object.
			}
		}
		return result;
	}

	/*
	*This method shifts a string of binary values left by appending a given number of zeros.
	*Parameter: n - an integer representing the number of zeros to be appended.
	*/
	public Binary shiftLeft(int n) {
		StringBuilder shifted = new StringBuilder();

		shifted.append(this.getValue()); //add the original binary string to the new string
		for (int i = 0; i < n; i++) {
			shifted.append("0"); //add the necessary number of zeros
		}
		return new Binary(shifted.toString()); //return the shifted string
	}
}