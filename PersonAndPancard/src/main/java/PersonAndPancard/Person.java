package PersonAndPancard;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
@GeneratedValue (strategy =GenerationType.IDENTITY)
private int id;
private String name;
private long phone;
private String email;
@OneToOne(cascade =CascadeType.ALL)
@JoinColumn(name = "pancard_id")
private PanCard  pcard;

public PanCard getPcard() {
	return pcard;
}
public void setPcard(PanCard pcard) {
	this.pcard = pcard;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
