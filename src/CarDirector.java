class CarDirector {
    public Car buildSportsCar() {
        return new Car.Builder()
                .withColor("Red")
                .withEngine("V8")
                .withSeats(2)
                .build();
    }

    public Car buildSUV() {
        return new Car.Builder()
                .withColor("Black")
                .withEngine("V6 Hybrid")
                .withSeats(7)
                .build();
    }

    public Car buildSedan() {
        return new Car.Builder()
                .withColor("Blue")
                .withEngine("I4 EcoBoost")
                .withSeats(5)
                .build();
    }
}