from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AMS234", Account("Ivan Serrano", "SECI900801Q31"))
    print(vars(car))
    print(vars(car.driver))
    
# if __name__ == "__main__":
#     print("Hola Mundo")
#     car = Car()
#     car.license = "AMS234"
#     car.driver = "Ivan Serrano"
#     print(vars(car))

#     car2 = Car()
#     car2.license = "QWE567"
#     car2.driver = "Kiara Gomez"
#     print(vars(car2))

