package exceptionExample;

import static java.lang.System.out;

public class PhoneExceptionTester {
    public static void main(String[] arg) {
        String[] number = {"123-456", null, "234-4567", "345-5678"};
        for(int i=0;i<number.length;i++){
            try{
                Phone phone=new Phone("iphone",number[i]);
                out.println(phone);
            }
            catch (IllegalArgumentException exception){
                out.println(exception.getLocalizedMessage());
            }

        }




    }
}
