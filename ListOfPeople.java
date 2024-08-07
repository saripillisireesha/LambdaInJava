package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class ListOfPeople {
   public static void main(String[] args){
        List<People> arrayList=new ArrayList<>();
        People p1=new People("Joshi",22,"Male",23);
        People p2=new People("Sireesha",17,"female",19);
        People p3=new People("bhavani",18,"female",18);
        People p4=new People("naveen",19,"Male",16);
        People p5=new People("vedadri",16,"Male",17);
        People p6=new People("jaisri",18,"female",18);
        People p7=new People("himaja",20,"female",16);
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
        arrayList.add(p6);
        arrayList.add(p7);
        System.out.println(arrayList);
       List<People> li = arrayList.stream().filter(person -> person.getAge() < 18).sorted(Comparator.comparingInt(People::getAge)).map(person ->new People(person.getName().toUpperCase(), person.getAge(), person.getGender(), person.getMobile()) ).collect(Collectors.toList());
        System.out.println("People aged 18 or older:");
        li.forEach(System.out::println);


    }
}
