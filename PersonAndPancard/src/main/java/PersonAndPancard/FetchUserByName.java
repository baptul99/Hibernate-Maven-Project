package PersonAndPancard;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchUserByName {
	public static void main(String[] args) 
	{
     String qry= "select p from Person p where p.name=?1";
     EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
     Query q=manager.createQuery(qry);
     q.setParameter(1, "Prince");
     List<Person> person= q.getResultList();
     if(person.size()>0)
     {
    	 for (Person p :person) 
    	 {
    		 System.out.println("id:"+p.getId());
    			System.out.println("Name:"+p.getName());
    			System.out.println("phone:"+p.getPhone());
    			System.out.println("Email:"+p.getEmail());
    	 }
    	 }else {
    		 System.err.println("Invalid number");
     }


	}

}
