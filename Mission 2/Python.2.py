import os 

class Rectangle :
    def __init__(self, longueur, largeur) :
        self._longueur = longueur
        self._largeur = largeur

        def Perimetre(self) : 
        return 2*(self._largeur + self._longueur)

        def Aire(self):
            return self._longeueur*self._largeur
            
monRectangle = Rectangle(7,4)

print(monRectangle.Aire())
print(monRectangle.Perimetre())
os.system