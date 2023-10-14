package KI307.Hereha.Lab3;


/**
* Клас драйвер для демонстрації роботи класу літака
*/
public class PlaneDriver {
    public static void main(String[] args) {
    	BomberPlane plane1 = new BomberPlane("F-16", "Jet", 10000, 2, "Rostyslav", "Hereha", 100, "UA", "Kharkiv", "\r\n"
        		+ "Kharkiv Aviation Plant", 4);
        plane1.displayInfo();
        plane1.takeOff();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.land();        
    }
}