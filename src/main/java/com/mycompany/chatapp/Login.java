/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
public class Login {
    String userName;
    String password;
    String cellPhoneNumber;
    
  //method to checkk userName
    public boolean checkUserName(String userName){
        return userName.contains("_")&& userName.length()<=5;
    }
    //method to check passwordvalidation
    public boolean checkPasswordComplexity(String password){
        return password.length() >=8 &&password.matches(".*[A-Z].*") &&password.matches(".*[0-9].*") &&password.matches(".*[$,@]*.");
    }  
    //method to check cell phone number 
    public boolean checkcellPhoneNumber(String cellPhoneNumber){
        return cellPhoneNumber.matches("^\\+[0-9][1,3][0-9][1,10]");
    }
      
    public String registerUser(String userName , String password , String cellPhoneNumber){
        if(checkUserName(userName)){
            return "Username is not correctly formatted , Please ensure that your username contains an underscore and is no more than 5 characters";
        }
        else if (!checkPasswordComplexity(password)){
            return "Password is not correctly formatted. Please ensure that password contains capital letters,number,special character";
            
        }
        else if (!checkcellPhoneNumber(cellPhoneNumber)){
            return "cell phone number incorrectly formatted or does not contain an international code";
        }
        this.userName = userName;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        return "User successfully registered";
        
    }
    public boolean loginUser(String userName, String password){
        return this.userName.equals(userName)&&this.password.equals(password);
    }
    public String returnLoginStatus(boolean success, String firstName, String lastName){
        if(success){
            return "Welcome"+ firstName +""+ lastName+"Great to see you again";
        }
        else{
            return "Username or password incorrect please try again";
        } 
    
    
    