
/**
* lab 2 package
*/
package KI307.Hereha.Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
* Клас що реалізує предметну область Літаку у вигляді класу.
*/
public class Plane {
    // Поля класу, що описують складові частини літака
    private String model;
    private Engine engine;
    private Pilot pilot;
    private AircraftFactory factory;
    private int passengerCapacity;
    
    // Конструктори
    public Plane(String model, Engine engine, Pilot pilot, AircraftFactory factory, int passengerCapacity) {
        this.model = model;
        this.engine = engine;
        this.pilot = pilot;
        this.factory = factory;		
        this.passengerCapacity = passengerCapacity;
    }

    public Plane(String model, String engineType,
    		int enginePower, int passengerCapacity,
    		String firstName, String lastName, int flightCount,
    		String country, String state, String name
    		) 
    {
        this.model = model;
        this.engine = new Engine(engineType, enginePower);
        this.pilot = new Pilot(firstName, lastName, flightCount);
        this.factory = new AircraftFactory(country, state, name);
        this.passengerCapacity = passengerCapacity;
    }

    // Методи для доступу до полів класу
    public String getModel() {
        return model;
    }

    // Метод класу, що відповідає за отримання типу двигуна
    public Engine getEngine() {
        return engine;
    }
    
    // Метод класу, що відповідає за отримання пілота
    public Pilot getPilot() {
		return pilot;
	}
    
    // Метод класу, що відповідає за отримання авіазаводу
    public AircraftFactory getFactory() {
		return factory;
	}
    
    // Метод класу, що відповідає за отримання кількості пасажирів
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Метод для запису протоколу в файл
    public void logActivity(String message) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(new Date() + ": " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Інші методи класу, що відповідають предметній області
    public void takeOff() {
        logActivity("Літак " + model + " вилетів.");
    }
    
    // Метод класу, що відповідає за логування посадки
    public void land() {
        logActivity("Літак " + model + " приземлився.");
    }
    
    // Метод класу, що відповідає за логування додавання кількості пасажирів
    public void addPassengers(int count) {
        passengerCapacity += count;
        logActivity("До літака " + model + " додано " + count + " пасажирів.");
    }

    // Інші методи

    // Методи, які демонструють роботу класу
    public void displayInfo() {
        System.out.println("Літак: " + model);
        System.out.println("Двигун: " + engine.getType() + ", Потужність: " + engine.getPower());
        System.out.println("Пасажиромісткість: " + passengerCapacity);
        System.out.println("Пілот: " + pilot.getFullName());
        System.out.println("Створено: " + factory.getDataAboutFactory());
    
    }

    


	// Внутрішній клас для представлення двигуна
    class Engine {
        private String type;
        private int power;

        public Engine(String type, int power) {
            this.type = type;
            this.power = power;
        }

        public String getType() {
            return type;
        }

        public int getPower() {
            return power;
        }
    }
    
	// Внутрішній клас для представлення пілота
    class Pilot {
        private String firstName;
        private String lastName;
        private int flightCount;

        public Pilot(String firstName, String lastName, int flightCount) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.flightCount = flightCount;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public int getExperience() {
            return flightCount;
        }
    }
        
	// Внутрішній клас для представлення авіазаводу
    class AircraftFactory{
        private String country;
        private String state;
        private String name;

        public AircraftFactory(String country, String state, String name) {
            this.country = country;
            this.state = state;
            this.name = name;
        }

        public String getDataAboutFactory() {
            return country + ", " + state + ", " + name;
        }
    }

}