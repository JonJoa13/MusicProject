package ch.hevs.businessobject;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Group")
public class Group extends Artist{
	
	
	@Column(name="groupName")
	private String name;
	@Column(name="groupMember")
	private List<Artist> groupMember;

}
