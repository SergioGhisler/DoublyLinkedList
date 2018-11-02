/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author sergio
 */
public class UsuariosBanco {

    private String nombre;
    private int edad;
    private String dni;
    private double cantidadDinero;

    public UsuariosBanco(String nombre, int edad, String dni, double cantidadDinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.cantidadDinero=cantidadDinero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    

    public double getCantidadDinero() {
		return cantidadDinero;
	}

	public void setCantidadDinero(double cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}
	
	public boolean compareTo(UsuariosBanco obj) {
		if (getDni()==obj.getDni()) {
		return true;
		}
		return false;
	}
	@Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }

    
}
