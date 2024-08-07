package collections;

import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.*;
//import java.lang.*;
import java.util.stream.Collectors;

//interface Siri{
    //public void add(String name);
//}
public class Exercise {
    public static void main(String []args){
//        List<String> list=Arrays.asList("aPple","banAna","orange","mango");
//       list.replaceAll(str-> str.toLowerCase());
  //      List<String> li=list.stream().map(String::toLowerCase).collect(Collectors.toList());
   //   System.out.println(li);
    //  List<String> li1=list.stream().map(String::toUpperCase).collect(Collectors.toList());
     // System.out.println(li1);
//        list.forEach(System.out::println);
//        list.replaceAll(str->str.toUpperCase());
////        list.forEach(System.out::println);
//        List<Integer> list=Arrays.asList(1,2,3,4,5,6,98,45,34,67,8);
//        List<Integer> li=list.stream().filter(str-> str%2==0).collect(Collectors.toList());
//        System.out.println(li);
//        List<Integer> li2=list.stream().filter(str-> str%2!=0).collect(Collectors.toList());
//        System.out.println(li2);
//        List<String> list=Arrays.asList("siri", "himaja","keerthana","bhavani");
//        List<String> li=list.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
//        System.out.println(li);
//        List<Double> list=Arrays.asList(2.3,4.5,7.8,8.9,9.4);
//        Double average=list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
//        System.out.println("the average of the list numbers are: "+average);

//        List<Integer> list=Arrays.asList(1,2,3,4,5,3,4,5,6,7,8,7,9,10);
//        List<Integer> unique=new ArrayList<>();
//        list.stream().distinct().forEach(unique::add);
//        System.out.println(unique);
//        LongUnaryOperator factorial = n-> {
//            long result = 1;
//            for (long i = 1; i <= n; i++) {
//                result = result * i;
//            }
//            return result;
//        };
//        long n=7;
//        long results=factorial.applyAsLong(n);
//        System.out.println(results);

        Predicate<Integer> is_Prime=n-> {
            if(n<=1){
                return false;
            }
            for(int i=2; i<=Math.sqrt(n); i++){

                if(n%i==0){
                    return false;
                }
            }
            return true;
        };
        int [] n={1,2,45,34,5,6,23,11,65,13};
        for(int num:n){
            System.out.println(num+""+is_Prime.test(num));
        }
        //int n=5
        //boolean isprime=is_Prime.test(n);
        //System.out.println(isprime);

    }
}
