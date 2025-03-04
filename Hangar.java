
public class Hangar {

    public static void main(String[] args) {

        Vehicle lamborghini = new Car("Lamborghini", 5);
        Vehicle ferrari = new Car("Ferrari", 18);
        Vehicle lotus = new Car("Lotus", 26);

        Vehicle titanic = new Boat("Titanic", 586);
        Vehicle kraken = new Boat("Kraken", 1824);

        System.out.println(lamborghini.doStuff());
        System.out.println(ferrari.doStuff());
        System.out.println(lotus.doStuff());
        System.out.println(titanic.doStuff());
        System.out.println(kraken.doStuff());

    }
}
