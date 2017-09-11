package com.example.Clase;

/*
* this clase is unique, this example is for singleton
* */
public class PersonaAdmin implements Usuario {
    private String Tipo;
    private String Nombre;
    private static PersonaAdmin amUnique;

    private PersonaAdmin(String Nombre, String Tipo) {
        this.Nombre=Nombre;
        this.Tipo=Tipo;
//        super(Tipo, Nombre);
    }
    public PersonaAdmin(){}

    public String getTipo() {
        return Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public static PersonaAdmin getSingletonInstance(String Nombre, String Tipo) throws Exception {
        if (amUnique == null){
            amUnique = new PersonaAdmin(Nombre,Tipo);
        }
        else {
            throw new Exception("An administrative user has already been created");
        }
        return amUnique;
    }
    public String Saludar() {
        return "Hello I am "+this.getNombre()+", and "+this.getTipo()+", and a singleton object.";
    }

}
