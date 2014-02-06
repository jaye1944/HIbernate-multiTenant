package hib.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TENANT")
public class Tenant {

	private int id;
	
	private String name;
	
	private String dbname;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	
	@Column(name = "DBNAME")
	public String getDbname() {
		return dbname;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
