package auto;

import java.util.HashSet;
import java.util.TreeSet;

public class AutomobilService {

    public void task2(){
        HashSet<Automobil> automobilHashSet = new HashSet<>();
        automobilHashSet.add(new Automobil("mazda",2010));
        automobilHashSet.add(new Automobil("mazda",2012));
        automobilHashSet.add(new Automobil("mazda",2014));
        automobilHashSet.add(new Automobil("mazda",2018));
        automobilHashSet.add(new Automobil("mazda",2020));
        automobilHashSet.add(new Automobil("BMW",2010));
        automobilHashSet.add(new Automobil("BMW",2012));
        automobilHashSet.add(new Automobil("BMW",2014));
        automobilHashSet.add(new Automobil("BMW",2018));
        automobilHashSet.add(new Automobil("BMW",2020));
        automobilHashSet.add(new Automobil("Mercedes",2010));
        automobilHashSet.add(new Automobil("Mercedes",2012));
        automobilHashSet.add(new Automobil("Mercedes",2014));
        automobilHashSet.add(new Automobil("Mercedes",2018));
        automobilHashSet.add(new Automobil("Mercedes",2020));

        automobilHashSet.stream()
                .sorted((a1,a2) ->a1.getAnProducere() - a2.getAnProducere())
                .forEach(car -> System.out.println(car));

        System.out.println("\nsortam dupa nume\n");
        automobilHashSet.stream()
                .sorted((a1,a2) -> a1.getDenumirea().compareTo(a2.getDenumirea()))
                .forEach(System.out::println);





    }


    public void task3(){
        TreeSet<Automobil> automobilTreeSet = new TreeSet<>();
        automobilTreeSet.add(new Automobil("mazda",2010));
        automobilTreeSet.add(new Automobil("BMW",2010));
        automobilTreeSet.add(new Automobil("BMW",2012));
        automobilTreeSet.add(new Automobil("BMW",2020));
        automobilTreeSet.add(new Automobil("Mercedes",2018));
        automobilTreeSet.add(new Automobil("Mercedes",2020));

        for (Automobil car : automobilTreeSet) {
            System.out.println(car);
        }


    }
}
