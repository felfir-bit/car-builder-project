public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        Car sportsCar = director.buildSportsCar();
        Car suv = director.buildSUV();
        Car sedan = director.buildSedan();

        System.out.println("Sports Car: " + sportsCar);
        System.out.println("SUV: " + suv);
        System.out.println("Sedan: " + sedan);

        Car custom = new Car.Builder()
                .withColor("White")
                .withEngine("Electric")
                .withSeats(4)
                .build();

        System.out.println("Custom Car: " + custom);
    }
}