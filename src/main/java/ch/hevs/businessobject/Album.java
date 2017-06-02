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
	

	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	
	public int getAlbum_year() {
		return album_year;
	}
	public void setAlbum_year(int album_year) {
		this.album_year = album_year;
	}
	
	
	
}
