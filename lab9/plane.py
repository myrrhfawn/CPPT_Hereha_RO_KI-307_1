from datetime import datetime

class Plane:
    def __init__(self, make, model):
        self.make = make
        self.model = model
        self.fuel_level = 100  # Початковий рівень пального

    def fly(self):
        if self.fuel_level > 0:
            print(f"[{datetime.now()}][{self.make}][{self.model}] is flying")
            self.fuel_level -= 10
        else:
            print("Not enough fuel. Please refuel.")

    def land(self):
        print(f"[{datetime.now()}][{self.make}][{self.model}] is landing")

    def refuel(self):
        print(f"[{datetime.now()}][{self.make}][{self.model}] is being refueled")
        self.fuel_level = 100  # Повне заповнення пального

    def check_fuel_level(self):
        print(f"[{datetime.now()}][{self.make}][{self.model}] fuel level: {self.fuel_level}%")