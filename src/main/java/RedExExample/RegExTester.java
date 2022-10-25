package RedExExample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String [] args){
        String emailRegex="^(.+)@(.+).com$";
        Pattern pattern=Pattern.compile(emailRegex);
        String email="Jeff@gmail.co";
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Go sleep");
        }




    }
}
