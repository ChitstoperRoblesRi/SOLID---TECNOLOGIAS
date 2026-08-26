from abc import ABC, abstractmethod

class Personaje(ABC):

    def __init__(self, nombre, vida):
        self.nombre = nombre
        self.vida = vida

    def recibir_danio(self, cantidad):
        self.vida -= cantidad
        print(f"recibe {cantidad} de daño")
        print(f"vida restante: {self.vida}")

    @abstractmethod
    def atacar(self):
        pass


class ICurable(ABC):

    @abstractmethod
    def curar(self, objetivo):
        pass

class Guerrero(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con su espada")

class Mago(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con bola de fuego")

    def curar(self, objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} cura a {objetivo.nombre} +20 de vida")

class Soporte(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con baston")

    def curar(self, objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} cura a {objetivo.nombre} +20 de vida")


guerrero1 = Guerrero("Guerrero1", 100)
mago1 = Mago("Mago1", 60)
soporte1 = Soporte("Soporte1", 70)


guerrero1.atacar()
mago1.atacar()
soporte1.atacar()

guerrero1.recibir_danio(30)
mago1.curar(guerrero1)
soporte1.curar(guerrero1)

print(f"vida final de {guerrero1.nombre}: {guerrero1.vida}")