/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_c4;

import java.util.Objects;

/**
 *
 * @author 
 */
public class Game extends Companyia{
    private String nombre;
    private String companyia;
    private int anyo;

    public Game(String nombre, String companyia, int anyo) {
        super(companyia);
        this.nombre = nombre;
        this.anyo = anyo;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Game{" + "nombre=" + nombre + ", companyia=" + companyia + ", anyo=" + anyo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

   
    
    
    
    
}
