
package TestePratico;

//import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
    	int n1=0, n2=1, n3=0, num=10;
    	while(num> n3) {
    		n3 = n1 + n2;
    		n1 = n2;
    		n2 = n3;
    	}
    	
    	if(num == 0) {
    		System.out.println("O numero 0 est� na sequencia de fibonacci. \nO pr�ximo numero �: 1");
    	}else if(num == n3) {
    		System.out.println("o numero "+ num + " est� na fibonacci.");
    	}else {
    		System.out.println("Este num n�o faz parte da fibonacci");
    	}
    }

}
