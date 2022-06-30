public class Truck extends CAR{
    int towingCapacity;

    public Truck(int vinNumber, String make, String model, int mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public Truck(int vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);

    }
}
