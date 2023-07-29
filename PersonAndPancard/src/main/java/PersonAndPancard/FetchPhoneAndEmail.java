package PersonAndPancard;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchPhoneAndEmail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Phone number: ");
		long phone=sc.nextLong();
		System.out.println("Please enter Email Id : ");
		String email=sc.next();

		  String qry= "select p from Person p where p.phone=?1 and p.email=?2";
		     EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
		     Query q=manager.createQuery(qry);
		     
		  q.setParameter(1, phone);
		  q.setParameter(2, email);
		  
		     List<Person> person= q.getResultList();
		     
		     if(person.size() >0 )
		    	 
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