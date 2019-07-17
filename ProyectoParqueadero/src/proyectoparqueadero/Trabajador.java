package proyectoparqueadero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LaboratorioFISI
 */
public class Trabajador {
        private String codigoDelTrabajador;
        private String nombreDelTrabajador;
        private float numeroMovil;

    public Trabajador(String codigoDelAlumno, String nombreDelAlumno, float numeroMovil) {
        this.codigoDelTrabajador = codigoDelAlumno;
        this.nombreDelTrabajador = nombreDelAlumno;
        this.numeroMovil = numeroMovil;
    }

    public String getCodigoDelTrabajador() {
        return codigoDelTrabajador;
    }

    public void setCodigoDelTrabajador(String codigoDelAlumno) {
        this.codigoDelTrabajador = codigoDelAlumno;
    }

    public String getNombreDelTrabajador() {
        return nombreDelTrabajador;
    }

    public void setNombreDelTrabajador(String nombreDelAlumno) {
        this.nombreDelTrabajador = nombreDelAlumno;
    }

    public float getNumeroDelTrabajador() {
        return numeroMovil;
    }

    public void setNumeroDelTrabajador(float numeroMovil) {
        this.numeroMovil = numeroMovil;
    }
    
    
}
