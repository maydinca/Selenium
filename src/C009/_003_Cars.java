package C009;

public abstract class _003_Cars {
    String fuelType;

    public _003_Cars(String fuelType) {
        this.fuelType = fuelType;
    }

    abstract void fuelType();

}

class Toyota extends _003_Cars {

    public Toyota(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Toyota drives using " + fuelType);
    }
}

class Honda extends _003_Cars {

    public Honda(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Honda drives using " + fuelType);
    }
}

class Tesla extends _003_Cars {
    public Tesla(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Tesla drives using " + fuelType);
    }
}