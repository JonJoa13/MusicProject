package ch.hevs.businessobject;

import javax.persistence.*;

@Entity
@Table(name="Song")
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name="title")
	private String title;
	@Column(name="style")
	private String style;
	
	/**
	 * Relations
	 */
	
	//Many songs can be in a an Album or not if it's a single.
	@ManyToOne(cascade = CascadeType.DETACH)
	@Column(nullable = true)
	private Album album;
	
	//Getter and Setter for Album
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	
	//If it's a single, owned by the singer_band
	@ManyToOne
	private Singer_Band singer_band;
	
	public Singer_Band getSinger_band() {
		return singer_band;
	}
	public void setSinger_band(Singer_Band singer_band) {
		this.singer_band = singer_band;
	}
	
	/**
	 * Getter and Setter
	 */
		
	//id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Name
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//Style
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	
	/**
	 * Constructors
	 */
	
	public Song(){
	
	}
	
	public Song(String title, String style){
		this.title = title;
		this.style = style;
	}
	
	

	
	
	
	
}
