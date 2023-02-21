
package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
        Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
        Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
        Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
        Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
        Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
        Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
    /**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
    /**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
    /**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
    /**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /**
     * Test the OR function with two binary values of the same length
     */
    @Test public void OR1()
    {
        Binary binary1=new Binary("1110");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1110"));
    }

    /**
     * Test the OR function with a binary value that has a leading zero to test if the concatenation is resolved
     */
    @Test public void OR2()
    {
        Binary binary1=new Binary("0110");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1110"));
    }

    /*
     * Test the OR function with two binary values of different lengths
     */
    @Test public void OR3()
    {
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1011");
        Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1011"));
    }

    /*
     * Test the OR function with a binary object composed of invalid characters (not binary)
     */
    @Test public void OR4()
    {
        Binary binary1=new Binary("ABCD");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }

    /**
     * Test the OR function with a binary object equal to zero
     */
    @Test public void OR5()
    {
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }

    /**
     * Test the AND function with two binary objects of the same length
     */
    @Test public void AND1()
    {
        Binary binary1=new Binary("1110");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.AND(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }

    /*
     * Test the AND function with a binary value that has a leading zero to test if the concatenation is resolved
     */
    @Test public void AND2()
    {
        Binary binary1=new Binary("0110");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.AND(binary1,binary2);
        assertTrue( binary3.getValue().equals("10"));
    }

    /*
     * Test the AND function with binary objects of different lengths
     */
    @Test public void AND3()
    {
        Binary binary1=new Binary("1110");
        Binary binary2=new Binary("10");
        Binary binary3=Binary.AND(binary1,binary2);
        assertTrue( binary3.getValue().equals("10"));
    }

    /*
     * Test the AND function with a binary object composed of invalid characters (not binary)
     */
    @Test public void AND5()
    {
        Binary binary1=new Binary("ABCD");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.AND(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /*
     * Test the multiplication function with a binary value that has a leading zero to test if the concatenation is resolved
     */
    @Test public void mult1()
    {
        Binary binary1=new Binary("1110");
        Binary binary2=new Binary("0010");
        Binary binary3=Binary.mult(binary1,binary2);
        assertTrue(binary3.getValue().equals("11100"));
    }

    /*
     * Test the multiplication function with binary values of the same length
     */
    @Test public void mult2()
    {
        Binary binary1=new Binary("111");
        Binary binary2=new Binary("101");
        Binary binary3=Binary.mult(binary1,binary2);
        assertTrue(binary3.getValue().equals("100011"));
    }

    /*
     * Test the multiplication function with binary values of different lengths
     */
    @Test
    public void mult4()
    {
        Binary binary1=new Binary("101");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.mult(binary1,binary2);
        assertTrue(binary3.getValue().equals("1111"));
    }

    /*
     * Test the multiplication function with a binary object of value 0
     */
    @Test
    public void mult5()
    {
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.mult(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }
}
