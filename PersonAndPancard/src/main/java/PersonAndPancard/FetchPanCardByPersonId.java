package PersonAndPancard;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchPanCardByPersonId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Person Id:");
		int id = sc.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Person p=manager.find(Person.class, id);
		if(p!=null)
		{
			PanCard pc=p.getPcard();
			if(pc !=null) {
				System.out.println("Person name="+p.getName());
				
    		System.out.println("Pan Card id:"+pc.getId());
    		System.out.println(" Pan Card Number:"+pc.getNumber());
    		System.out.println("Pan card Dob:"+pc.getDob());
    		System.out.println("Pan card City:"+pc.getCity());
    		System.out.println(" Pan card Country:"+pc.getCountry());
    		System.out.println("Pan Card State:"+pc.getState());
    		System.out.println("Pan Card Pincode:"+pc.getPincode());
    	 
		}else
		{
			System.err.println("No data found");
		}
		}else {
			System.out.println("Person not exist in database");
		}
}}
