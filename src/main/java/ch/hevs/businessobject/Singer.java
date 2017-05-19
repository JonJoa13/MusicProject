package ch.hevs.businessobject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Singer")
public class Singer extends Artist {
	
	
	@Column(name="name")
	private String name;
	@Column(name="birthDate")
	private String birthDate;
	

}
