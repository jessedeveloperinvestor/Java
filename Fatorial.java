import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone {
	public static void main (String[] args) throws java.lang.Exception {
		int numero=5;
		System.out.println("O fatorial de "+numero+" é "+fatorial(numero)+".");
	}
	public static int fatorial(int num) {
		if(num <= 1) {
			return 1;
		} else {
			return fatorial(num - 1)*num;
		}
	}
}