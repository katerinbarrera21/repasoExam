package ec.edu.ups.test;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.entidades.Paciente;

//copiar la parte de arriba de los beans

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped

public class CreacionDatos implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;
	//necesita todos los ejb
	@EJB
	private PacienteFacade ejbPaciente;
	
	@EJB
	private CitaFacade ejbCita;
	
	@EJB
	private SignosVitalesFacade ejbSignosVitales;

	public CreacionDatos(){
		
	}
	
	// como esta en el nombre en el metodo creacionDatos.creacionPrincipal
	public void creacionPrincipal() {
		//sin id
		//esto es porque en ya pide al paciente desde la base
		Paciente p = new Paciente("0106114309", "Katy", "Barrera", "0980990592", "Paute", "katyBarrera@.com");
		Paciente p2 = new Paciente("0106114308", "Katy1", "Barrera1", "0980990593", "Paute", "katyBarrera1@.com");
		Paciente p3 = new Paciente("0106114307", "Katy2", "Barrera2", "0980990594", "Paute", "katyBarrera2@.com");
		
		ejbPaciente.create(p);
		ejbPaciente.create(p2);
		ejbPaciente.create(p3);
		
		//crear los que pida la practica e ir a la base de datos
		//verificar que no haya nada en la base/... drop database, luego create database, use y show 
		//verificar que el glassfish no tenga nada
		
	}

}
