package Utility;

import java.util.Random;



public class emailGenerator {
	
	
	public static String generateEmail(){
		
	
		Random rand = new Random();

		char a = (char)(rand.nextInt((90-65) + 1) + 65);
		char b = (char)(rand.nextInt((90-65) + 1) + 65);
		char c = (char)(rand.nextInt((90-65) + 1) + 65);
		char d = (char)(rand.nextInt((90-65) + 1) + 65);
		char e = (char)(rand.nextInt((90-65) + 1) + 65);
		char f = (char)(rand.nextInt((90-65) + 1) + 65);
		char g = (char)(rand.nextInt((90-65) + 1) + 65);
		char h = (char)(rand.nextInt((90-65) + 1) + 65);
		char i = (char)(rand.nextInt((90-65) + 1) + 65);
		
		return ""+a+b+c+ "@" + d+e+f + "." + g+h+i;
	}

}
