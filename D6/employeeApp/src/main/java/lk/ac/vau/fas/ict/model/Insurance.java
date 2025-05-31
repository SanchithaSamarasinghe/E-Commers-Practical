package lk.ac.vau.fas.ict.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Insurance {

//	Attributes
	@Id
	private String insID;
	private String pkgType;
	private int noOfYears;
	
	@OneToOne(mappedBy = "insurence")
	private Employee employee;
}
