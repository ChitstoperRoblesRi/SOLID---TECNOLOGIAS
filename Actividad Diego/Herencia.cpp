#include <iostream>
using namespace std;

class Animal{
    public:
        string nombre;

        Animal(string nombre) : nombre(nombre){
            cout << "Animal constructor" << endl;
        }

        void virtual andar(){
            cout<< nombre << " esta andando" << endl;
        }
};

class Perro : public Animal{
    public:
        Perro(string nombre) : Animal(nombre){}

        void virtual ladrar(){
            cout << nombre << " esta ladrando" << endl;
        }
};

class Volador : virtual public Animal{
    public:
        Volador(string nombre) : Animal(nombre){}

        void andar(){
            cout << nombre << " esta volando" << endl;
        }
};

class Nadador : virtual public Animal{
    public:   
        Nadador(string nombre) : Animal(nombre){}

        void andar(){
            cout << nombre << " esta nadando" << endl;
        }
};

class Pato : public Volador, public Nadador{
    public:
        Pato(string nombre) : Nadador(nombre), Volador(nombre), Animal(nombre){}

        void graznar(){
            cout << nombre << " esta graznando" << endl;
        }

        void andar(){
            cout << nombre << " esta caminando" << endl;
        }

};

int main(){
    Perro perro1("Pako");
    perro1.ladrar();
    perro1.andar();

    Pato pato1("Justin");
    pato1.Nadador::andar();
    pato1.Volador::andar();
    pato1.graznar();

    Volador volador1("Vane");
    Nadador nadador1("Ale");

    volador1.andar();
    nadador1.andar();

};