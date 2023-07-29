package PersonAndPancard;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class FetchPersonID {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your id to find details:");
int id =sc.nextInt();
EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
Person p=manager.find(Person.class, id);
if(p!=null)
{
	System.out.println("id:"+p.getId());
	System.out.println("Name:"+p.getName());
	System.out.println("phone:"+p.getPhone());
	System.out.println("Email:"+p.getEmail());
	
}else {
	System.err.println("Number not valid");
}
	}

}