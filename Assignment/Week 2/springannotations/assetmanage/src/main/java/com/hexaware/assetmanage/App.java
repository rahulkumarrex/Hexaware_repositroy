package com.hexaware.assetmanage;

import com.hexaware.assetmanage.config.AppConfig;
import com.hexaware.assetmanage.model.User;
import com.hexaware.assetmanage.service.IUserServices;
import com.hexaware.assetmanage.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static Scanner sc = new Scanner(System.in);

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IUserServices service = context.getBean(UserServiceImp.class);

        boolean flag = true;

        while (flag){
            System.out.println("****WELCOME USER Management System ***");
            System.out.println("1. INSERT");
            System.out.println("2. SELECT BY USERNAME");
            System.out.println("3. SELECT ALL");
            System.out.println("4. EXIT");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    User user = readData();

                    boolean isInserted = service.insertUser(user);

                    if (isInserted) {
                        System.out.println("Record inserted successfully...");
                    } else {

                        System.err.println("Insert fail");
                    }

                    break;

                case 2:
                    System.out.println("Enter Username");

                    String username = sc.next();

                    User userFound = service.selectByName(username);

                    if (userFound != null) {
                        System.out.println(userFound);
                    } else {


                        // throw  new ProductNotFoundExp();
                        System.err.println("Product Not Found");
                    }

                    break;
                case 3:
                    List<User> list = service.selectAll();

                    for (User use : list) {

                        System.out.println(use);

                    }
                    break;



                case 4:

                    flag = false;
                    System.out.println("Thank you, Visit Again");

                    break;

                default:
                    break;
            }
        }
    }
    public static User readData() {

        User user = new User();

        System.out.println("Enter User Id");
        user.setUserID(sc.nextInt());
        System.out.println("Enter Username");
        user.setUsername(sc.next());
        System.out.println("Enter User Password");
        user.setPassword(sc.next());
        System.out.println("Enter Name of User");
        user.setName(sc.next());
        System.out.println("Enter Gender");
        user.setName(sc.next());
        System.out.println("Enter Contact Number");
        user.setName(sc.next());
        System.out.println("Enter Address");
        user.setName(sc.next());

        return user;
    }
}
