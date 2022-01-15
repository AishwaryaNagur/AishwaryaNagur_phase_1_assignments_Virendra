package innertomethodloaclinner;


public class Car {
	String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        carName = name;
        carType = type;
    }

    // private method
    private String getCarName() {
        return carName;
    }

    void Engine() {
    class Engine {
        String engineType;
        
        void setEngine() {

           // Accessing the carType property of Car
            if(carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(getCarName().equals("Crysler")) {
                    engineType = "Smaller";
                } else {
                    engineType = "Bigger";
                }

            }else{
                engineType = "Bigger";
            }
        }
        
        String getEngineType(){
            return engineType;
        }
    }
    Engine engine11 = new Engine();
    engine11.setEngine();
    System.out.println("Engine Type for 8WD= " + engine11.getEngineType());
    
    Engine engine12 = new Engine();
    engine12.setEngine();
    System.out.println("Engine Type for 4WD = " + engine12.getEngineType());

}

public class Inner_Complex {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");
        car1.Engine();

        Car car2 = new Car("Crysler", "4WD");
        car2.Engine();
	}	
}

}
