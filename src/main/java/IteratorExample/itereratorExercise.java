package IteratorExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class itereratorExercise {
    public static void main(String [] args){
        List<String> list=new LinkedList<String>();
        list.add("Mike");
        list.add("Bob");
        list.add("Alive");

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){  //the has next command is used to return a true or false value
            System.out.println(iterator.next()); //this is used to retuen the next item
        }
    }
}
