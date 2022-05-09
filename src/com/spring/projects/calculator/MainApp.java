package com.spring.projects.calculator;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.arithmeticoperations.BasicArithmeticOperations;

public class MainApp {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//initialising the container
		
		context.start();
		
		//factory method(getBean()) to demand the object."ba" obj must be same as id of the bean definition in xml
		BasicArithmeticOperations  cal = context.getBean("ba",BasicArithmeticOperations.class);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("\nWelcome to Spring Calculator");
				System.out.println("Press 1 for Addition");
				System.out.println("Press 2 for subtraction ");
				System.out.println("Press 3 for multiplication");
				System.out.println("Press 4 for division");
				System.out.println("Press 5 for exit");
				String res; res =scanner.nextLine();
				
				switch(res) {
				case "1":
				System.out.println("The addition is " + cal.add());
				//System.out.println("The address for addition is " + cal.hashCode());
				break;
				
				case "2":
					System.out.println("The subtraction is " + cal.subtract());
					//System.out.println("The address for sub is " + cal.hashCode());
					break;
					
				case "3":
					System.out.println("The multiplication is " + cal.multiply());
					break;
				
				case "4":
					System.out.println("The division is " +cal.divide());
					break;
					
				case "5":
					System.out.println("Thank you!!!");
					scanner.close();
					context.close();
				default:
					System.out.println("Invalid options");
					break;
					}
				}catch(Exception e) {
					System.out.println("somthing went wrong");
					break;
					}
			}
		}
	}
