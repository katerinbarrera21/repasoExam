package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "personaSignoVital")
	private List<SignosVitales> persona_SignoVital = new ArrayList<SignosVitales>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "personaCita")
	private List<Cita> persona_Cita = new ArrayList<Cita>();
	
	//siempre un constructor vacio al inicio

	public Paciente() {
		super();
	}

	// genero todo pero no las relaciones
	public Paciente(int idPaciente, String cedula, String nombre, String apellido, String telefono, String direccion,
			String email) {
		super();
		this.idPaciente = idPaciente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}

	public Paciente(String cedula, String nombre, String apellido, String telefono, String direccion, String email) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<SignosVitales> getPersona_SignoVital() {
		return persona_SignoVital;
	}

	public void setPersona_SignoVital(List<SignosVitales> persona_SignoVital) {
		this.persona_SignoVital = persona_SignoVital;
	}

	public List<Cita> getPersona_Cita() {
		return persona_Cita;
	}

	public void setPersona_Cita(List<Cita> persona_Cita) {
		this.persona_Cita = persona_Cita;
	}
	
	
	//estos para las relaciones 
	public void addPersonaCita(Cita persona_Cita) {
		this.persona_Cita.add(persona_Cita);
		
	}
	

	public void addPersona_SignoVital(SignosVitales persona_SignoVital) {
		this.persona_SignoVital.add(persona_SignoVital);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + idPaciente;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((persona_Cita == null) ? 0 : persona_Cita.hashCode());
		result = prime * result + ((persona_SignoVital == null) ? 0 : persona_SignoVital.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Paciente other = (Paciente) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idPaciente != other.idPaciente)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (persona_Cita == null) {
			if (other.persona_Cita != null)
				return false;
		} else if (!persona_Cita.equals(other.persona_Cita))
			return false;
		if (persona_SignoVital == null) {
			if (other.persona_SignoVital != null)
				return false;
		} else if (!persona_SignoVital.equals(other.persona_SignoVital))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email
				+ ", persona_SignoVital=" + persona_SignoVital + ", persona_Cita=" + persona_Cita + "]";
	}
	
   
	
}
