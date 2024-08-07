package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employe {
  public  static void main(String [] args){
        List<Depart> employ= Arrays.asList(new Depart(1,"sireesha",35000, "Manager"),
                new Depart(1,"sireesha",35000, "Manager"),
                new Depart(2,"keerthana",45000, "Hr"),
                new Depart(3,"bhavani",20000, "It"),
                new Depart(4,"himaja",25000, "Manager"),
                new Depart(5,"jaisri",45000, "Hr"),
                new Depart(6,"latha",15000, "It"),
                new Depart(7,"sravani",55000, "Manager"),
                new Depart(8,"vedadri",40000, "Hr"),
                new Depart(9,"naveen",40000, "software"),
        new Depart(9,"joshith",60000, "software")

        );
        String dep="Hr";
        Predicate<Depart> emp=e->!e.getDepartment().equals(dep);
        //List<Depart> de=employ.stream().filter(emp).collect(Collectors.toList());
        //System.out.println(de);
      employ.stream().filter(emp).forEach(System.out::println);
        Map<String, List<Depart>> li= employ.stream().collect(Collectors.groupingBy(e->e.department));
      Map<String, Double> li1= employ.stream().collect(Collectors.groupingBy(e->e.department,Collectors.averagingDouble(Depart::getSalary)));

       // System.out.println(li);
    li.forEach((department, emplist)->{
          System.out.println(department+" "+emplist);
      });

        li1.forEach((department, avgsalary)->{
            System.out.println(department+":$ "+avgsalary);
        });
            Map<String, Depart> li2=employ.stream().collect(Collectors.groupingBy(Depart::getDepartment, Collectors.collectingAndThen(Collectors.maxBy((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())),
      optional->optional.orElse(null)
              )
      ));
            li2.forEach((department,employee)->System.out.println(department+ ": "+(employee!=null ?employee:"no employ"))
);



  }
}

