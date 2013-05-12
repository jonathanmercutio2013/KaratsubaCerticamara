package certicamara;

import java.math.BigInteger;

import junit.framework.TestCase;

import org.junit.Test;

import certicamara.Karatsuba;

public class TestKaratsuba extends TestCase {
	public Karatsuba karatsuba;
		
	String string1 = "sapo";
	String string2 = "sap02";
	
	BigInteger x = new BigInteger(string1);
	BigInteger y = new BigInteger(string2);
	
	@Test
	public void testKaratsubaString() {
		
		
		
		try {
			
			BigInteger z = Karatsuba.karatsuba(x, y);
			
			fail("Karatsuba no acepta strings ni caracteres especiales");  
		} catch(NullPointerException expected) {
			
		}
	}
	
	@Test
	public void testKaratsubaSpecialChar() {
		
		String d = "$";
		String e = "%";
		BigInteger h = new BigInteger(d);
		BigInteger m = new BigInteger(e);
				
		try {
			
			BigInteger l = Karatsuba.karatsuba(h, m);
			fail("Karatsuba no acepta strings ni caracteres especiales");  
		} catch(NullPointerException expected) {
			
		}
	}
	
	@Test
	public void testKaratsubaNegative() {
		try {
			
			
			Integer neg = -2;
			Integer neg1 = -2345544;
			BigInteger bi = BigInteger.valueOf(neg.intValue());
			BigInteger bi1 = BigInteger.valueOf(neg1.intValue());
			
			BigInteger resul = Karatsuba.karatsuba(bi, bi1);
			fail("Karatsuba no acepta strings ni caracteres especiales");  
		} catch(NullPointerException expected) {
			
		}
	}
}
