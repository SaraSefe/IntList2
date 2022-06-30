
    public abstract class CAR {
        private int VinNumber;
        private String make;
        private String model;
        private int mileage;

        public int getVinNumber() {
            return VinNumber;
        }

        public void setVinNumber(int vinNumber) {
            VinNumber = vinNumber;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public CAR(int vinNumber, String make, String model, int mileage) {
            VinNumber = getVinNumber();
            this.make = getMake();
            this.model = getModel();
            this.mileage = getMileage();

        }
    }

}
