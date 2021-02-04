package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity
public class SignosVitales implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSignoVital;
	private double presion;
	private double frecuenciaCardiaca;
	private double frecuenciaRespiratoria;
	private double Temperatura;
	private double saturacion;
	private String alergias;
	private String enfermedadesPrevias;
	
	@ManyToOne
	@JoinColumn
	private Paciente personaSignoVital;
	// como no es lista el constructor debe tener este atributo
	
	public SignosVitales() {
		super();
	}


	

	// primer public con todo porque no es una lista


	public SignosVitales(int idSignoVital, double presion, double frecuenciaCardiaca, double frecuenciaRespiratoria,
			double temperatura, double saturacion, String alergias, String enfermedadesPrevias,
			Paciente personaSignoVital) {
		super();
		this.idSignoVital = idSignoVital;
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		Temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
		this.personaSignoVital = personaSignoVital;
	}

	
	//public sin id para no pedir id

	public SignosVitales(double presion, double frecuenciaCardiaca, double frecuenciaRespiratoria, double temperatura,
			double saturacion, String alergias, String enfermedadesPrevias, Paciente personaSignoVital) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		Temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
		this.personaSignoVital = personaSignoVital;
	}


	//public solo de atributos ni id ni relaciones


	public SignosVitales(double presion, double frecuenciaCardiaca, double frecuenciaRespiratoria, double temperatura,
			double saturacion, String alergias, String enfermedadesPrevias) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		Temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
	}
	
	
	//este es sin el atributo de realacion pero si el id

	public SignosVitales(int idSignoVital, double presion, double frecuenciaCardiaca, double frecuenciaRespiratoria,
			double temperatura, double saturacion, String alergias, String enfermedadesPrevias) {
		super();
		this.idSignoVital = idSignoVital;
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		Temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
	}




	public int getIdSignoVital() {
		return idSignoVital;
	}




	public void setIdSignoVital(int idSignoVital) {
		this.idSignoVital = idSignoVital;
	}




	public double getPresion() {
		return presion;
	}




	public void setPresion(double presion) {
		this.presion = presion;
	}




	public double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}




	public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}




	public double getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}




	public void setFrecuenciaRespiratoria(double frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}




	public double getTemperatura() {
		return Temperatura;
	}




	public void setTemperatura(double temperatura) {
		Temperatura = temperatura;
	}




	public double getSaturacion() {
		return saturacion;
	}




	public void setSaturacion(double saturacion) {
		this.saturacion = saturacion;
	}




	public String getAlergias() {
		return alergias;
	}




	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}




	public String getEnfermedadesPrevias() {
		return enfermedadesPrevias;
	}




	public void setEnfermedadesPrevias(String enfermedadesPrevias) {
		this.enfermedadesPrevias = enfermedadesPrevias;
	}




	public Paciente getPersonaSignoVital() {
		return personaSignoVital;
	}




	public void setPersonaSignoVital(Paciente personaSignoVital) {
		this.personaSignoVital = personaSignoVital;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Temperatura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((alergias == null) ? 0 : alergias.hashCode());
		result = prime * result + ((enfermedadesPrevias == null) ? 0 : enfermedadesPrevias.hashCode());
		temp = Double.doubleToLongBits(frecuenciaCardiaca);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(frecuenciaRespiratoria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + idSignoVital;
		result = prime * result + ((personaSignoVital == null) ? 0 : personaSignoVital.hashCode());
		temp = Double.doubleToLongBits(presion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(saturacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		SignosVitales other = (SignosVitales) obj;
		if (Double.doubleToLongBits(Temperatura) != Double.doubleToLongBits(other.Temperatura))
			return false;
		if (alergias == null) {
			if (other.alergias != null)
				return false;
		} else if (!alergias.equals(other.alergias))
			return false;
		if (enfermedadesPrevias == null) {
			if (other.enfermedadesPrevias != null)
				return false;
		} else if (!enfermedadesPrevias.equals(other.enfermedadesPrevias))
			return false;
		if (Double.doubleToLongBits(frecuenciaCardiaca) != Double.doubleToLongBits(other.frecuenciaCardiaca))
			return false;
		if (Double.doubleToLongBits(frecuenciaRespiratoria) != Double.doubleToLongBits(other.frecuenciaRespiratoria))
			return false;
		if (idSignoVital != other.idSignoVital)
			return false;
		if (personaSignoVital == null) {
			if (other.personaSignoVital != null)
				return false;
		} else if (!personaSignoVital.equals(other.personaSignoVital))
			return false;
		if (Double.doubleToLongBits(presion) != Double.doubleToLongBits(other.presion))
			return false;
		if (Double.doubleToLongBits(saturacion) != Double.doubleToLongBits(other.saturacion))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "SignosVitales [idSignoVital=" + idSignoVital + ", presion=" + presion + ", frecuenciaCardiaca="
				+ frecuenciaCardiaca + ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", Temperatura="
				+ Temperatura + ", saturacion=" + saturacion + ", alergias=" + alergias + ", enfermedadesPrevias="
				+ enfermedadesPrevias + ", personaSignoVital=" + personaSignoVital + "]";
	}
	

   
}
