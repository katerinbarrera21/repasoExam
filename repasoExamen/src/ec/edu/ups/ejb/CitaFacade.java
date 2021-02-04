package ec.edu.ups.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Cita;


@Stateless

public class CitaFacade extends AbstractFacade<Cita> {


	@PersistenceContext(unitName = "repasoExamen" )
	private EntityManager em; 
	
    public CitaFacade() {
        // TODO Auto-generated constructor stub
    	super(Cita.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
