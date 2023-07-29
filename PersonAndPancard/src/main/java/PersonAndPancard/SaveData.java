package PersonAndPancard;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {

	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Person p=new Person();
		p.setEmail("Sdcd@gmail.com");
		p.setName("Prince");
		p.setPhone(1234567890);
		
		
		PanCard pc= new PanCard();
        pc.setCity("Mumbai");
        pc.setCountry("INDIA");
        pc.setDob(LocalDate.parse("1998-07-09"));
        pc.setNumber(26585);
        pc.setPincode(71262);
        pc.setState("West Bengal");
        
        pc.setPerson(p);
        p.setPcard(pc);
        manager.persist(p);
        transaction.begin();
        transaction.commit();
		
		
		
	}

}
