package com.example.Clase;


public class Persona {



        private String nombre;
        private String cedula;
        private int sexo;
        public Persona (String nombre,String cedula, int sexo){
            this.nombre=nombre;
            this.cedula=cedula;
            this.sexo=sexo;
        }


        public void setnombre(String nom){
            nombre=nom;

        }

        public void setsexo(int sex){
            sexo=sex;
        }

        public String getnombre(){
            return nombre;
        }

        public int getsexo(){
            return sexo;
        }

        }



