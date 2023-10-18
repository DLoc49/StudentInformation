
package common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
    public String inputString(String title){
        String s = "";
        while(s.isBlank() || s.isEmpty()){
            System.out.print(title+": ");
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
        }
        return s;
    }
    
    public String inputStringMatch(String title, String regex){
        String s = "";
        while(!s.matches(regex)){
            System.out.print(title+": ");
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
        }
        return s;
    }
    
    public int inputInt(String title, int min, int max){
        int a = -1;
        while(a < min || a > max){
            Scanner sc = new Scanner(System.in);
            System.out.print(title+": ");
            try{
                a = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.err.println("Enter digit(0<a<10)");
                a = -1;
            }
        }
        return a;
    }
}