package main;

import java.util.Scanner;

public class vowels {
	
	public static void main(String[] args) {

        char ch ;
        
       Scanner sc = new Scanner(System.in);   
        System.out.print("Please enter: "); 
        ch = sc.next().charAt(0);   

	
	char z=Character.toUpperCase(ch);
	switch(z) 
	{
	case '0':System.out.println(ch+" is a number.");
				break;
	case '1':System.out.println(ch+" is a number.");
				break;
	case '2':System.out.println(ch+" is a number.");
				break;
	case '3':System.out.println(ch+" is a number.");
				break;
	case '4':System.out.println(ch+" is a number.");
				break;
	case '5':System.out.println(ch+" is a number.");
				break;
	case '6':System.out.println(ch+" is a number.");
				break;
	case '7':System.out.println(ch+" is a number.");
				break;
	case '8':System.out.println(ch+" is a number.");
				break;
	case '9':System.out.println(ch+" is a number.");
				break;
	case 'A':System.out.println(ch+" is a Vowel.");
				break;
	case 'E':System.out.println(ch+" is a Vowel.");
				break;
	case 'I':System.out.println(ch+" is a Vowel.");
				break;
	case 'O':System.out.println(ch+" is a Vowel.");
				break;
	case 'U': System.out.println(ch+" is a Vowel.");
				break;
	
	default: System.out.println(ch+" is a consonant.");
	}
}

}

