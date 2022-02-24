package util;

import java.util.Scanner;

public class Input {
 private final Scanner scanner = new Scanner(System.in);





 public String getString() {
  System.out.println("Please enter something.");
  String response = scanner.nextLine();
  System.out.printf("You entered: %s", response);
  return response;
 }





 public String getString(String prompt) {
  System.out.println(prompt);
  String response = scanner.nextLine();
  System.out.printf("You entered: %s", response);
  return response;
 };





 public boolean yesNo() {
  System.out.println("Continue?");
  String response = scanner.next();
  return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("YES") || response.equalsIgnoreCase("yes");
 }




 public boolean yesNo(String prompt) {
  System.out.println(prompt);
  String response = scanner.next();
  return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("YES");
 }}














