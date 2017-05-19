package ch.hevs.businessobject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Album")
public class Album implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name="album_name")
	private String album_name;
	@Column(name="album_year")
	private int album_year;
	
	//Relations
	

	
	
}
