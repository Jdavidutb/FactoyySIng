package com.example.Clase;

/**
 * Created by JOSELIN GASTELBONDO on 1/09/2017.
 */

public class Estudiante extends Persona {
        private String codigo;

        public Estudiante(String nombre, String cedula, String codigo, int sexo) {
            super(nombre, cedula, sexo);
            this.codigo = codigo;

        }

        public void setcodigo(String cod) {
            codigo = cod;
        }

        public String getcodigo() {
            return codigo;
        }

    }
