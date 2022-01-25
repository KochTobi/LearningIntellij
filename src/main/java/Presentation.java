import java.util.ArrayList;
import java.util.List;

public class Presentation {

  enum Power {
    ON, OFF,
  }

  public static void main(String[] args) {

    Person person = new Person("Tobias", "Koch");
    Person max = new Person("Max", "Mustermann");

    List<Person> persons = new ArrayList<>();
    List<Person> criminals = new ArrayList<>();

    //<editor-fold desc="CompleteStatement">

    //<editor-fold desc="Over-dot completion">

    // p.f ->
    //  String firstName = person.firstName();

    //</editor-fold>

    //<editor-fold desc="Static completion">

    //now ->
    //Instant someTime = now();

    //</editor-fold>

    //<editor-fold desc="Smart completion">

    //ds -> doStuff(_) ->
    //doStuff(max.lastName());

    //</editor-fold>

    //<editor-fold desc="Tab completion">

    doSomePowerStuff(Power.OFF);
    //dsodoSomePowerStuff(Power.OFF); ->
    //doSomeOtherPowerStuff(Power.OFF);

    //</editor-fold>

    //</editor-fold>

    //<editor-fold desc="Surround with">

    //    if (doBooleanStuff()) {
    //      doStuff();
    //    }

    //</editor-fold>

    //<editor-fold desc="Postfix Completion">

    // dbs.if ->
    //    if (doBooleanStuff()) {
    //      doStuff();
    //    }

    //persons.for ->
    //    for (Person person1 : persons) {
    //      System.out.println("person1 = " + person1);
    //    }

    //persons.iter ->
    //    for (Person person1 : persons) {
    //      System.out.println("person1 = " + person1);
    //    }

    //</editor-fold>

    //<editor-fold desc="Live Templates">

    //<editor-fold desc="iter">

    //iter ->
//    for (Person person1 : persons) {
//        doStuff();
//    }

    //</editor-fold>

    // log4j
    // logslf
    // logv


    //</editor-fold>
  }

  private static void timesTwo(int test) {
    var result = test * 2;
  }

  private static boolean doBooleanStuff() {
    return false;
  }

  private static void doStuff(String lastName) {

  }

  private static void doStuff() {

  }

  private static void doSomePowerStuff(Power power) {

  }

  private static void doSomeOtherPowerStuff(Power power) {

  }

}
