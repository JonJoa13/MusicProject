package ch.hevs.businessobject;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Song")
public class Song implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name="name")
	private String name;

	
	//Relations
	
	//One song can be in a an Album or not if it's a single.
	
	
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
