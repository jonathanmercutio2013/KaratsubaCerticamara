package certicamara;

import java.math.BigInteger;
import java.util.Random;

import org.junit.runners.JUnit4;

import certicamara.Karatsuba;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
        
        BigInteger a = new BigInteger(30, random);
        BigInteger b = new BigInteger(30, random);
        

        // Multiplicacion de numeros muy grandes
        BigInteger c = Karatsuba.karatsuba(a, b);
        BigInteger d = a.multiply(b);
                
        // verificacion de que los resultados son iguales
        System.out.println((c.equals(d)));
        
        System.out.println(a + " * " + b + " = " + c);
        
        
    }

}
