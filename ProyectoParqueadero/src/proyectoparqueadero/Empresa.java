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
public class Empresa {
     Trabajador trabajadores[];
     int TAM_TABLA = 20;
    

    public Empresa()
    {
        
        trabajadores= new Trabajador[TAM_TABLA];
        for (int i = 0; i < TAM_TABLA; i++) {
            trabajadores[i] = new Trabajador("","",0);
        }
    }
    
    public  void setCodigoDelTrabajador (String codigo, int i)
    {
        trabajadores[i].setCodigoDelTrabajador(codigo);
    }
    public  String getCodigoDelTrabajador (int i)
    {
        return trabajadores[i].getCodigoDelTrabajador();
    }
    
    public  void setNombreDelTrabajador (String nombre, int i)
    {
        trabajadores[i].setNombreDelTrabajador(nombre);
    }
     public  String getNombreDelTrabajador (int i)
    {
        return trabajadores[i].getNombreDelTrabajador();
    }
    public void setNumeroDelTrabajador (float movil, int i)
    {
        trabajadores[i].setNumeroDelTrabajador(movil);
    }
     public  float getNumeroDelTrabajador(int i)
    {
      return trabajadores[i].getNumeroDelTrabajador();
    }
    public  int getNumeroDeTrabajadores()
    {
      return TAM_TABLA;
    }
    //*************************************************
    public  int hash(String clave)
    {
       int x = 0;
        for (int i = 0; i < clave.length(); i++) {
                   x += clave.codePointAt(i);
        }
        System.out.println("Sin Módulo..."+x+":: ConMódulo "+x%19);
        return x % 19;
    }
    
    //*********************************************************
    //INSERTAR MODULO DIVISION
    public  boolean Insertar(String codigo, String nombre, float numero)
    {
        int pos, pos_sigte;
        pos = hash(codigo);
        //caso encuentra a la 1ra
    if (this.getCodigoDelTrabajador(pos).equals(""))
    {
        setCodigoDelTrabajador(codigo, pos);
        setNombreDelTrabajador(nombre, pos);
        setNumeroDelTrabajador(numero, pos);
        return true;
    }
    else //Se produce colisión: Solución por reasignación por prueba lineal
    {
        pos_sigte = pos + 1;
    while(pos_sigte < this.getNumeroDeTrabajadores() &&
        this.getCodigoDelTrabajador(pos_sigte).equals("")==false &&
         pos_sigte!=pos)
    {
         pos_sigte++;
    if ( pos_sigte == this.getNumeroDeTrabajadores() - 1)
        pos_sigte=0;
    }
    if (this.getCodigoDelTrabajador(pos_sigte).equals(""))//encuentra posicion disponible
    {
        this.setCodigoDelTrabajador(codigo, pos_sigte);
        this.setNombreDelTrabajador(nombre, pos_sigte);
        this.setNumeroDelTrabajador(numero, pos_sigte);
        return true;
    }
    else
        return false;
    }
    }
    
    public int Buscar(String codigo)//PRUEBA LINEAL
    {
        int pos, pos_sigte;
        pos = hash (codigo);
        if (getCodigoDelTrabajador(pos).equals(codigo))
            return pos;
        else //Se produce colisión: Solución por reasignación por prueba lineal
        {
            pos_sigte = pos + 1;
        while(pos_sigte < getNumeroDeTrabajadores() &&
            getCodigoDelTrabajador(pos_sigte).equals("")== false&&
            pos_sigte!=pos &&
            getCodigoDelTrabajador(pos).equals(codigo)== false)
        {
            pos_sigte++;
            if ( pos_sigte == getNumeroDeTrabajadores())
            pos_sigte=0;
        }
        if (getCodigoDelTrabajador(pos_sigte).equals("") || pos_sigte==pos)
        {
            return -1; //código no existe
        }
        else
            return pos_sigte;
        }
    }
    
    public int eliminar(String codigo){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (getCodigoDelTrabajador(pos).equals(codigo)){
            this.setCodigoDelTrabajador("", pos);
            this.setNombreDelTrabajador("", pos);
            this.setNumeroDelTrabajador(0, pos);
            return 1;
        }
        else //Se produce colisión: Solución por reasignación por prueba lineal
        {
            pos_sigte = pos + 1;
        while(pos_sigte < getNumeroDeTrabajadores() && getCodigoDelTrabajador(pos_sigte).equals("")== false &&
            pos_sigte!=pos && getCodigoDelTrabajador(pos).equals(codigo)== false)
        {
            pos_sigte++;
            if ( pos_sigte == getNumeroDeTrabajadores())
            pos_sigte=0;
        }
        if (getCodigoDelTrabajador(pos_sigte).equals("") || pos_sigte==pos)
        {
            return -1; //código no existe
        }
        else{
            this.setCodigoDelTrabajador("", pos_sigte );
            this.setNombreDelTrabajador("", pos_sigte );
            this.setNumeroDelTrabajador(0, pos_sigte );
            return 1;
            }
        }
    }   
}
