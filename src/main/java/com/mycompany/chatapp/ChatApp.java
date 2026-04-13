/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class ChatApp {
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login signIn = new Login();
        System.out.println("===Register===");
        
        
        System.out.println("Enter Username: ");
        String userName = input.nextLine();
        
        
        System.out.println("Enter password: ");
        String password = input.nextLine();
        
        
        System.out.println("Enter phone number (+27): ");
        String phoneNumber = input.nextLine();
        
        
        String registerMessage = signIn.registerUser(userName,password,phoneNumber);
        System.out.println(registerMessage);
        
        
        System.out.println("===Login===");
        System.out.println("Enter userName: ");
        String userLogin = input.nextLine();
        String loginPass = input.nextLine();
        
        
        boolean success = signIn.loginUser(userLogin,loginPass);
        String message = signIn.returnLoginStatus(success, "Lebone", "Lebepe");
        System.out.println(message);
        
        input.close();
        
    }
}
