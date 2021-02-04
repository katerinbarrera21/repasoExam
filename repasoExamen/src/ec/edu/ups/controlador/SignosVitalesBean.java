package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.SignosVitalesFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped


public class SignosVitalesBean implements Serializable {


	private static final long serialVersionUID = 1L;
	@EJB
	private SignosVitalesFacade ejbSignosVitales;

	public SignosVitalesBean() {
    }

}
