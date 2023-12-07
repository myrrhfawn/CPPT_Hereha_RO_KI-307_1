from plane import Plane
from bomber import BomberPlane

def main():
    # Створення екземпляра базового класу "Літак"
    # Створення екземпляра базового класу "Літак"
    plane1 = Plane("Boeing", "747")
    plane1.fly()
    plane1.check_fuel_level()
    plane1.land()
    plane1.refuel()
    plane1.check_fuel_level()

    # Створення екземпляра похідного класу "Військовий літак"
    fighter_plane = BomberPlane("F-16", "Fighting Falcon", "Missiles")
    fighter_plane.fly()
    fighter_plane.check_fuel_level()
    fighter_plane.drop_bombs()
    fighter_plane.check_ammo_count()
    fighter_plane.defend()
    fighter_plane.reload_weapon()
    fighter_plane.check_ammo_count()

if __name__ == "__main__":
    main()