package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cita
 *
 */
@Entity

public class Cita implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCita;
	
	private Calendar fechaInicio;
	private Calendar fechaFin;
	private String descripcion; 
	
	@ManyToOne
	@JoinColumn
	private Paciente personaCita;

	public Cita() {
		super();
	}

	public Cita(int idCita, Calendar fechaInicio, Calendar fechaFin, String descripcion, Paciente personaCita) {
		super();
		this.idCita = idCita;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.personaCita = personaCita;
	}

	public Cita(Calendar fechaInicio, Calendar fechaFin, String descripcion, Paciente personaCita) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.personaCita = personaCita;
	}

	public Cita(int idCita, Calendar fechaInicio, Calendar fechaFin, String descripcion) {
		super();
		this.idCita = idCita;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
	}

	public Cita(Calendar fechaInicio, Calendar fechaFin, String descripcion) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Paciente getPersonaCita() {
		return personaCita;
	}

	public void setPersonaCita(Paciente personaCita) {
		this.personaCita = personaCita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + idCita;
		result = prime * result + ((personaCita == null) ? 0 : personaCita.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (idCita != other.idCita)
			return false;
		if (personaCita == null) {
			if (other.personaCita != null)
				return false;
		} else if (!personaCita.equals(other.personaCita))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descripcion="
				+ descripcion + ", personaCita=" + personaCita + "]";
	}
	
	
	
	
   
}
