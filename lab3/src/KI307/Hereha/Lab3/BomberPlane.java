package KI307.Hereha.Lab3;

public class BomberPlane extends Plane implements Bomber {
    private int bombCapacity;
    private Plane.Engine engine;
    private Plane.Pilot pilot;
    private Plane.AircraftFactory factory;


	
	
	public BomberPlane(String model, String engineType,
    		int enginePower, int passengerCapacity,
    		String firstName, String lastName, int flightCount,
    		String country, String state, String name, int bombCapacity) {
        super(model, engineType, enginePower, passengerCapacity,
        		firstName, lastName, flightCount, country, state, name);
        this.bombCapacity = bombCapacity;
        this.engine = super.getEngine(); // Отримуємо екземпляр Engine
        this.pilot = super.getPilot(); // Отримуємо екземпляр Pilot
        this.factory = super.getFactory(); // Отримуємо екземпляр AircraftFactory
        
    }
	
	@Override
    public void takeOff() {
        logActivity("Бомбардувальний літак " + getModel() + " вилетів.");
    }

    @Override
    public void land() {
        logActivity("Бомбардувальний літак " + getModel() + " приземлився.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Бомбардувальний літак: " + getModel());
        System.out.println("Двигун: " + engine.getType() + ", Потужність: " + engine.getPower());
        System.out.println("Пасажиромісткість: " + getPassengerCapacity());
        System.out.println("Пілот: " + pilot.getFullName());
        System.out.println("Створено: " + factory.getDataAboutFactory());
        System.out.println("Кількість бомб: " + bombCapacity);
    
    }

    @Override
    public void dropBombs() {
    	if(bombCapacity != 0) {
            logActivity("Бомбардувальний літак " + getModel() + " скинув бомбу. Залишилось " + bombCapacity + " бомб." );
            bombCapacity--;
    	} else {
            logActivity("Бомбардувальний літак " + getModel() + " скинув всі бомби. Потрібна перезарядка." );
    	}
    }
	
}
