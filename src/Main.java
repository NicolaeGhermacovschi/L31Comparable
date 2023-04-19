import auto.AutomobilService;
import person.PersonService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        PersonService personService = new PersonService();
      //  personService.personTask();

        AutomobilService automobilService = new AutomobilService();
        automobilService.task2();
        System.out.println("======================================");
        automobilService.task3();
    }
}