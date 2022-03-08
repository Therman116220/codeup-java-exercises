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


 public boolean yesNo() {
  System.out.println("Continue?");
  String response = scanner.next();
  return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("YES") || response.equalsIgnoreCase("yes");
 }


 public int getInt(int min, int max) {
  int numInput;
  do {
   System.out.println("Please enter a integer ranging between 1 and 5");
   numInput = scanner.nextInt();
  } while (numInput < min || numInput > max);
  System.out.println("good choice!");
  return numInput;

 }

 public int getInt() {
  try {
   return Integer.parseInt(getString());
  } catch (Exception e) {
   System.out.println("Please enter an number.");
   return getInt();
  }
 }
}

















