package hib.dao;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
public class Customer implements Serializable {
     
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	 
	private String firstName,lastName;
	
	
	public Long getId() {
	    return id;
	}
	
	public void setId(Long id) {
	    this.id = id;
	}
	
	
	public String getFirstName() {
	    return firstName;
	}
	
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	
	public String getLastName() {
	    return lastName;
	}
	
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
}

