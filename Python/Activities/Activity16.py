class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")


# Creating 3 different car objects
car1 = Car("Toyota", "Corolla", "Sedan", "Automatic", "Red")
car2 = Car("Ford", "Mustang", "Coupe", "Manual", "Blue")
car3 = Car("Tesla", "Model S", "Sedan", "Automatic", "Black")

# Using the methods
car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()
