import Concept.ClassA;
import Concept.ClassB;
import Concept.Person;
import ThreadConcept.CountPrinter;
import Utility.FirstNonRepeatingChar;
import Utility.SortNumberDsc;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;
import ThreadConcept.CallableMessage;

import javax.lang.model.element.Element;

public class Client {
    //private Semaphore first;
    static ExecutorService executor= Executors.newFixedThreadPool(2);
    public static void main(String[] args) throws InterruptedException {

        /*String inputstr="prepinsta";
        List<String> inp=new ArrayList<String>() ;
        inp.add("aap");
        inp.add("prepinsta");
        for(String e:inp)
        {
            System.out.println("string-"+e);
            FirstNonRepeatingChar obj=new FirstNonRepeatingChar(e);
            System.out.println("char is -"+obj.GetFirstNonRepeatingCharacter(e));
        }*/
        /*boolean flag=true;
        for(char i: inputstr.toCharArray()){
            if(inputstr.indexOf(i)==inputstr.lastIndexOf(i))
            {
                System.out.println("first non repeating character-"+i);
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("There is no non repeating character");
        }*/
        //ClassB objA=new ClassB();
        //objA.display();
        //List<String> out=list.stream().map(String::toUpperCase).distinct().forEach(System.out::println);
        /*for (int i = 1; i <= number; i++) {
            CountPrinter counterThread = new CountPrinter(i);
            Thread thread = new Thread(counterThread);
            thread.start();
            thread.join();
        }*/
        /*CallableMessage task=new CallableMessage();
        Future<String> message=executor.submit(task);
        try {
            System.out.println(message.get().toString());
        }catch (Exception e)
        {

        }*/
        //System.out.println("heelo");
    //List<Integer> number= Arrays.asList(4,5,7,3,5);
    //number.sort(new SortNumberAsc());
        //number.sort(new SortNumberDsc());
        //System.out.println(number);
       // int[] input=new int[100];
        //Arrays.sort(input);
        //System.out.println(input);
        //int[] range= IntStream.rangeClosed(1,100).toArray();
        //System.out.println(range);
        //Arrays.stream(range).unordered();//.sort(new SortNumberDsc());
        //Arrays.asList(range);
        /*List<Integer> number=Arrays.stream(range).boxed().toList();
        number.sort(new SortNumberDsc());
        System.out.println(number);
*/
        //Person person=new Person("Ruchi",40);
        //Person otherper=new Person(person);
        //System.out.println("name-"+person.toString());
    }
}
