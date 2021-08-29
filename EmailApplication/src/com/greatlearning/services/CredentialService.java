package com.greatlearning.services;
import com.greatlearning.model.*;
import java.util.Random;

public class CredentialService{
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName + lastName + "@" + department + ".itsa.com";
	}
	
	public char[] generateRandomPassword() {
		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialChars = "!@#$%^&*"; 
		String allChar = upperCaseLetters + lowerCaseLetters + specialChars + number;
		//use of random utility
		Random random = new Random();
	
		char[] password = new char[16];
	
		for (int i=0; i < 16; i++) {
			//use of charAt() method 
			password[i] = allChar.charAt(random.nextInt(allChar.length()));
		}
	
		return password;
	}
	
	public void showCredentials(Employee emp, String email, char[] generatedPassword) {
		System.out.println("Dear "+ emp.getFirstName() + " your generated credentials are as follows" + 
				"\n Email --> "+ email +
				"\n Password --> " + generatedPassword);
	}
	
}
