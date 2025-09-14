class Car {
    private final String color;
    private final String engine;
    private final int seats;

    private Car(String color, String engine, int seats) {
        this.color = color;
        this.engine = engine;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                '}';
    }

    // Fluent Builder
    public static class Builder {
        private String color;
        private String engine;
        private int seats;

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder withSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(color, engine, seats);
        }
    }
}