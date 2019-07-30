/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

/**
 *
 * @author DesarrolloWeb
 */
public class PaqueteProyectores {
   private int codPaqueteDeProyectos;
   private String destinatario;
   private float costoEnvio;
   private boolean enTransito;
   private String destino;

    public PaqueteProyectores(int codPaqueteDeProyectos, String destinatario, float costoEnvio, String destino) {
        this.codPaqueteDeProyectos = codPaqueteDeProyectos;
        this.destinatario = destinatario;
        this.costoEnvio = costoEnvio;
        this.destino = destino;
    }

    public int getCodPaqueteDeProyectos() {
        return codPaqueteDeProyectos;
    }

    public void setCodPaqueteDeProyectos(int codPaqueteDeProyectos) {
        this.codPaqueteDeProyectos = codPaqueteDeProyectos;
    }

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
  
   
}
