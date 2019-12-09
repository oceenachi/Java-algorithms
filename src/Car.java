import org.w3c.dom.ls.LSOutput;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    class Nissan extends Car {
        public Nissan(String name, int cylinders) {
            super(name, cylinders);
        }
//        @Override
//        public String startEngine() {
//        if you wanna use the super class first before other things this is how you use it
//            return super.startEngine();
//        }

        @Override
        public String startEngine() {
            return "Nissan -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Nissan -> accelerate()";
        }

        @Override
        public String brake() {
            return "Nissan -> brake()";
        }
    }
    public static void main(String[] args) {
        Car car = new Car("Nissan", 3);
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());

    }


}
