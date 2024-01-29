package com.hexaware.usermanage;

import java.util.Scanner;

import com.hexaware.hiibernate.service.UserService;
import com.hexaware.usermanage.entity.Users;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
    	UserService service = new UserService();
        boolean flag = true;
   		while(flag) {
    		System.out.println("****WELCOME to User Manageement ***");
    		System.out.println("1. INSERT");
    		System.out.println("2. SELECT BY ID");
    		System.out.println("3. SELECT ALL");
    		System.out.println("4. DELETE BY ID");
    		System.out.println("5. EXIT");
    		
    		int choice = sc.nextInt();
    		sc.nextLine();
    		switch (choice) {
    		case 1:
    			 System.out.println("Enter user details:");
    			 System.out.println("Enter User ID: ");
    			 int userId = sc.nextInt();
                 System.out.println("Enter username: ");
                 String username = sc.next();
                 System.out.println("Enter password:");
                 String password = sc.next();
                 System.out.println("Enter name:");
                 String name = sc.next();
                 System.out.println("Enter gender:");
                 String gender = sc.next();
                 System.out.println("Enter contact number:");
                 String contactNumber = sc.next();
                 System.out.println("Enter address:");
                 String address = sc.next();
    			Users user = new Users(userId,username, password, name, gender, contactNumber, address);
    			 service.addUser(user);
                 System.out.println("User added successfully!");
    			break;
    		case 2:
    			System.out.println("Enter User ID");
    			int userId1 = sc.nextInt();
    			Users user1 = service.getUserById(userId1);
    			System.out.println(user1);
    			
    			break;
			case 3:
				System.out.println("Users from Database:");
		        service.getAllUsers().forEach(System.out::println);
				break;

			case 4:
				System.out.println("Enter Userr ID to Delete: ");
				int userId2 = sc.nextInt();
				sc.nextLine();
				service.deleteById(userId2);
				break;
				
			case 5:
				flag = false;
				break;
			default:
				break;
			}
   		}
    }
}
