package KI307.Hereha.Lab2;


/**
* Клас драйвер для демонстрації роботи класу літака
*/
public class PlaneDriver {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boeing 747", "Jet", 10000, 400, "Rostyslav", "Hereha", 100, "UA", "Kharkiv", "\r\n"
        		+ "Kharkiv Aviation Plant");
        plane1.displayInfo();
        plane1.takeOff();
        plane1.land();
        plane1.addPassengers(50);

        // To create an instance of the inner class Engine, use the outer class instance.
        Plane.Engine engine1 = plane1.new Engine("Turbofan", 7500);
        Plane.Pilot pilot1 = plane1.new Pilot("Ostap", "Mahora", 0);
        Plane.AircraftFactory factory1 = plane1.new AircraftFactory("UA", "Kyiv", "Antonov");
        Plane plane2 = new Plane("Airbus A320", engine1, pilot1, factory1, 200);
        plane2.displayInfo();
        plane2.takeOff();
        plane2.land();
        plane2.addPassengers(30);
    }
}