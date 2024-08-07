package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class EvenList {
    public static void main (String []args){
        List<Integer>arr= Arrays.asList(1,2,3,4,5,6,9,12,7,8,98,78,9,12);
//1        List<Integer> even=arr.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(even);
  //2      List<String> start=arr.stream().map(String::valueOf).filter(n-> n.startsWith("1")).collect(Collectors.toList());
    //           System.out.println(start);                     // here the output coming as a list
 //  2     arr.stream().map(String::valueOf).filter(n-> n.startsWith("9")).forEach(System.out::println);         // the output comes as a normal lines
        Set<Integer> set=new HashSet<>();
        arr.stream().filter(n-> !set.add(n)).forEach(System.out::println);
    }
}
