package cs2lab1;
import java.util.*;
public class lab1 {
	 public static void main(String[] args) {
	
		int z = 0;
		
		for (int i = 1; i <= 5; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.print(z+ " ");
				z++;
				
			}
			System.out.println();
			
		}
		method1(25,3);
	 }
		
		
    public static void method1(int a,int b) {
    	if (a<b) {
    		System.out.print(a);
	    	while (a<b) {
	    		System.out.print(","+(a+1));
	    		a++;
	    	}
	    	}
    	else {
    		System.out.print(b);
	    	while (b<a) {
	    		System.out.print(","+(b+1));
	    		b++;
	    	}
	    		
	    		
	    	}
	    }
    	
    }
				
	

