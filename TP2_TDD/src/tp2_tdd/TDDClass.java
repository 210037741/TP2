/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2_tdd;

import java.util.Objects;

/**
 *
 * @author Guest
 */
public class TDDClass {
    private String name;
    private String surname;
    
    public TDDClass ObjectsTheSame() {
        TDDClass object = new TDDClass("Constance","Simon");
        return object;
    }

    public TDDClass(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public TDDClass(){
        name = "";
        surname = "";
    }

    public TDDClass(TDDClass concatenate) {
        name = concatenate.getName();
        surname = concatenate.getSurname();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.surname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TDDClass other = (TDDClass) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }
    
    
}
