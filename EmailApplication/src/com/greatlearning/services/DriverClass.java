package com.greatlearning.services;
import java.util.Scanner;
import com.greatlearning.model.*;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Sonali","Sagar");
		CredentialService creds = new CredentialService();

		String dept = " ";
		String generatedEmail;
		char[] generatedPassword;
		int opt;
		System.out.println("Please enter the department from following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		
		opt = sc.nextInt();
		if(opt >=1 && opt <= 4) {
			switch(opt)
			{
			case 1:
				dept = "tech";
				break;
			case 2:
				dept = "adm";
				break;
			case 3:
				dept = "hr";
				break;
			case 4: 
				dept = "legal";
				break;
			default:
					break;
			}
			generatedEmail = creds.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), dept);
			generatedPassword = creds.generateRandomPassword();
			creds.showCredentials(emp, generatedEmail, generatedPassword);
		}
		else {
			System.out.println("Enter valid dept code");
		}
		
		sc.close();
	}

}
