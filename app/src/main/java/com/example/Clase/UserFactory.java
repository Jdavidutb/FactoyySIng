package com.example.Clase;



public class UserFactory extends AbstractUser {

    public void UserFactory() {

    }


    private Estudiante[] estudiantes;
    private Profesor profesores[];
    private Empleado empleados[];

    public UserFactory(int n) {
        profesores = new Profesor[n];

        estudiantes = new Estudiante[n];
        empleados = new Empleado[n];
        for (int y = 0; y < n; y++) {

        }
    }

    public Usuario crear(int posicion, String Nombre, String Tipo, String Codigo, String cedula, int horasextras) throws Exception {


        if (posicion >= estudiantes.length) {
            Exception Ex = new Exception("La posición seleccionada no se encuentra en el Salon");
            throw Ex;
        }

        if (estudiantes[posicion] != null) {
            Exception Ex = new Exception("La posición seleccionada está ocupada");
            throw Ex;
        }

        estudiantes[posicion].setnombre(Nombre);
        estudiantes[posicion].setcodigo(Codigo);
        estudiantes[posicion].setsexo(posicion);


        if (posicion >= profesores.length) {
            Exception Ex = new Exception("La posición seleccionada no se encuentra");
            throw Ex;
        }

        if (profesores[posicion] != null) {
            Exception Ex = new Exception("La posición seleccionada está ocupada");
            throw Ex;
        }

        profesores[posicion].setnombre(Nombre);
        profesores[posicion].setcedula(cedula);
        profesores[posicion].setsexo(posicion);
        profesores[posicion].sethorasextras(horasextras);


        if (posicion >= empleados.length) {
            Exception Ex = new Exception("La posición seleccionada no se encuentra en el Salon");
            throw Ex;
        }

        if (empleados[posicion] != null) {
            Exception Ex = new Exception("La posición seleccionada está ocupada");
            throw Ex;
        }

        empleados[posicion].setnombre(Nombre);
        empleados[posicion].setcedula(cedula);
        empleados[posicion].setsexo(posicion);
        empleados[posicion].sethorasextras(horasextras);


    }
}