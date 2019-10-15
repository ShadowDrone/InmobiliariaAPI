package ar.com.api.inmobiliaria.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Locatario
 */
public class Locatario {

    
    @Id
    @Column(name="locatario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int locatarioId;
    List<Reserva> reservas = new ArrayList<Reserva>();
    Usuario usuario;

    public int getLocatarioId() {
        return locatarioId;
    }

    public void setLocatarioId(int locatarioId) {
        this.locatarioId = locatarioId;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}