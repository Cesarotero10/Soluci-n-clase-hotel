/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.diamontinn.fesaragon;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class Reserva  {
    
    private String persona;
    private TipoHabitacion tipoDeHabitacion;
    private TipoVista tipoDeVista;
    private boolean incluirTodo;
    private Date fechaDate;

    public Reserva(TipoHabitacion tipoDeHabitacion, TipoVista tipoDeVista, boolean incluirTodo) {
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.tipoDeVista = tipoDeVista;
        this.incluirTodo = incluirTodo;
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

    public boolean isIncluirTodo() {
        return incluirTodo;
    }

    public void setIncluirTodo(boolean incluirTodo) {
        this.incluirTodo = incluirTodo;
    }

    public Date getFechaDate() {
        return fechaDate;
    }

    public void setFechaDate(Date fechaDate) {
        this.fechaDate = fechaDate;
    }

    
    
    
    
}
