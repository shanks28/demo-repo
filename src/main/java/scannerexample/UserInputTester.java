package scannerexample;

import java.util.Scanner;

public class UserInputTester {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter a String:");
            String userinput=scanner.nextLine();
            System.out.println("User InputL:"+userinput);
        }
        catch (Exception exception){
            System.out.println(exception.getLocalizedMessage());
        }
        finally {        //this is done to prevent memory leaks
            scanner.close();
        }
    }
}
