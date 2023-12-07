from plane import Plane
from datetime import datetime

class BomberPlane(Plane):
    def __init__(self, make, model, weapon):
        super().__init__(make, model)
        self.weapon = weapon
        self.bombs = 10  # Початкова кількість боєприпасів

    def drop_bombs(self):
        if self.bombs > 0:
            print(f"[{datetime.now()}][{self.make}][{self.model}] is drop bombs")
            self.bombs -= 1
        else:
            print("Out of bombs. Please reload.")

    def defend(self):
        print(f"[{datetime.now()}][{self.make}][{self.model}] is defending")

    def reload_weapon(self):
        print(f"[{datetime.now()}][{self.make}][{self.model}] weapon is being reloaded")
        self.bombs = 10  # Повне заповнення боєприпасів

    def check_ammo_count(self):
        print(f"[{datetime.now()}][{self.make}][{self.model}] bombs count: {self.bombs}")