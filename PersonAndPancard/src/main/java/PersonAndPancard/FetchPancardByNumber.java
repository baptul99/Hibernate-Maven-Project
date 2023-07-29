package PersonAndPancard;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchPancardByNumber {

public static void main(String[] args)
{
	String qry= "select pc from PanCard pc where pc.number=:ph";
     EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
     Query q=manager.createQuery(qry);
    q.setParameter("ph", 26585L);
   
    	try {
    		PanCard pc =(PanCard) q.getSingleResult(); 
    		System.out.println("id:"+pc.getId());
    		System.out.println("Number:"+pc.getNumber());
    		System.out.println("Dob:"+pc.getDob());
    		System.out.println("City:"+pc.getCity());
    		System.out.println("Country:"+pc.getCountry());
    		System.out.println("State:"+pc.getState());
    		System.out.println("Pincode:"+pc.getPincode());
    	 
    	 }catch(NoResultException e) {
    		 System.err.println("Invalid number");
     }


	}

}