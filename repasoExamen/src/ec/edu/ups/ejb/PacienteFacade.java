package ec.edu.ups.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Paciente;


@Stateless
//borar todo menos el stateless
public class PacienteFacade extends AbstractFacade<Paciente> {

	//nombre que este en persistence en la parte de name
	@PersistenceContext(unitName = "repasoExamen" )
	private EntityManager em; 
	
    public PacienteFacade() {
        // TODO Auto-generated constructor stub
    	super(Paciente.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
