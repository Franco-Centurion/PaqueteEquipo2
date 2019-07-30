/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

import java.util.ArrayList;

/**
 *
 * @author DesarrolloWeb
 */
public class GestorDePaquetesDeProyectores {
    private ArrayList<PaqueteProyectores>Paquetes;
    private String nombreDeEmpresa;

    public GestorDePaquetesDeProyectores(String nombreDeEmpresa) {
        this.nombreDeEmpresa = nombreDeEmpresa;
    }

    public String getNombreDeEmpresa() {
        return nombreDeEmpresa;
    }

    public void setNombreDeEmpresa(String nombreDeEmpresa) {
        this.nombreDeEmpresa = nombreDeEmpresa;
    }
    public void agregarPaquete(PaqueteProyectores paqueteNuevo){
    Paquetes.add(paqueteNuevo);
    }
    
}
