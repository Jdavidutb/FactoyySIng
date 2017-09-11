package com.example.Clase;


public abstract class AbstractUser {
        public static final int AUDIO = 1;
        public static final int VIDEO = 2;
        // --------------------------------
    public abstract Usuario crear(int posicion, String Tipo, String Nombre,String Codigo,String cedula, int horasextras) throws Exception;{}
}

