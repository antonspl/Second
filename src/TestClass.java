public class TestClass {
    public static void main(String[] args) {

//        Person anton = new Person("pizda");
//        System.out.println(anton.name);
//        System.out.println(anton.getName());

        Person[] persons = new Person[3];

        persons[0] = new Human();
        persons[1] = new Robot();
        persons[2] = new Human();

        for (Person a : persons) {
            a.eat();
        }

    }
}
