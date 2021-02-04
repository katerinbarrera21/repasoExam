package ec.edu.ups.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.SignosVitales;


@Stateless

public class SignosVitalesFacade extends AbstractFacade<SignosVitales> {

  
	@PersistenceContext(unitName = "repasoExamen" )
	private EntityManager em; 
	
    public SignosVitalesFacade() {
        // TODO Auto-generated constructor stub
    	super(SignosVitales.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
