/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.diamontinn.fesaragon;

/**
 *
 * @author Windows
 */
public class Reservacion {
    private String persona;
    private TipoHabitacion tipoDeHabitacion;
    private TipoVista tipoDeVista;
    private String fecha;
    private boolean visto;
    private int horaVisualizacion;

    public Reservacion(boolean visto, int horaVisualizacion) {
        this.visto = visto;
        this.horaVisualizacion = horaVisualizacion;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public TipoHabitacion getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(TipoHabitacion tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public TipoVista getTipoDeVista() {
        return tipoDeVista;
    }

    public void setTipoDeVista(TipoVista tipoDeVista) {
        this.tipoDeVista = tipoDeVista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getHoraVisualizacion() {
        return horaVisualizacion;
    }

    public void setHoraVisualizacion(int horaVisualizacion) {
        this.horaVisualizacion = horaVisualizacion;
    }
    

    

    
    
}
