package util;

import java.util.Scanner;

public class Input {
 private Scanner scanner = new Scanner(System.in);

 public String getString() {
  System.out.println("Please enter something.");
  String userResponse = scanner.nextLine();
  System.out.printf("You have entered: %s", userResponse);
  return userResponse;
 }

 public String getString(String prompt) {
  System.out.println(prompt);
  String userResponse = scanner.nextLine();
  System.out.printf("You have entered: %s", userResponse);
  return userResponse;
 }

 public boolean yesNo() {
  System.out.println("Would you like to continue?");
  String userResponse = scanner.next();
  if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
   return true;
  } else {
   return false;
  }
 }

 public boolean yesNo(String prompt) {
  System.out.println(prompt);
  String userResponse = scanner.next();
  if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
   return true;
  } else {
   return false;
  }
 }














