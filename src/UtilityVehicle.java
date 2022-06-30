public class UtilityVehicle extends CAR{
    boolean fourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public UtilityVehicle(int vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);

    }
}
