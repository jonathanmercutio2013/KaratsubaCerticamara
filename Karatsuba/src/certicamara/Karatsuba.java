package certicamara;

import java.math.BigInteger;

class Karatsuba {
	
	
	public static BigInteger karatsuba (BigInteger x, BigInteger y)
	{
		int n = Math.max (x.bitLength(), y.bitLength());
		if (n <= 1500) return x.multiply (y);
		
		n = n / 2;
		BigInteger xH = x.shiftRight (n);
		BigInteger xL = x.subtract   (xH.shiftLeft(n));
		BigInteger yH = y.shiftRight (n);
		BigInteger yL = y.subtract   (yH.shiftLeft(n));
		
		BigInteger p1 = karatsuba (xH, yH);
		BigInteger p2 = karatsuba (xL, yL);
		BigInteger p3 = karatsuba (xL.add (xH), yL.add (yH));
		
		return p1.shiftLeft (2*n).add (p3.subtract (p1).subtract (p2).shiftLeft (n)).add (p2);
	}
	
}