package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaFacade;

//no autocompletar el primer facesConfig
/// importo en el segundo faces configo
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class CitaBean implements Serializable{


	private static final long serialVersionUID = 1L;
	//importar facades que creemes solo los que necesitamos, por ejemplo si es para citas el  ejb de citafacade
	
	@EJB
	private CitaFacade ejbCita;
	
	

	public CitaBean() {

    }

}
