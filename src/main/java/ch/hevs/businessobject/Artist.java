package ch.hevs.businessobject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Artist")
public class Artist implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	
}
