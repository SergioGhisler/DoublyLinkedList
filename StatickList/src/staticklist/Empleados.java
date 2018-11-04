/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticklist;

/**
 *Esta clase es la que nos permite generar los empleados de nuestra Empresa

 * @author Sergio
 */
public class Empleados {

    private String nombre;
    private int edad;
    private String Dni;
    private int id;
    private String puesto;
    private String fechaComienzo;

    public Empleados(String nombre, int edad, String Dni, int id, String puesto, String fechaComienzo) {
        this.nombre = nombre;
        this.edad = edad;
        this.Dni = Dni;
        this.id = id;
        this.puesto = puesto;
        this.fechaComienzo = fechaComienzo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return Dni;
    }

    public int getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getFechaComienzo() {
        return fechaComienzo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setFechaComienzo(String fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", Dni=" + Dni + ", id=" + id + ", puesto=" + puesto + ", fechaComienzo=" + fechaComienzo ;
    }
    
}