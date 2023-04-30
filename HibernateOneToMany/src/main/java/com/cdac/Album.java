package com.cdac;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_album")
public class Album {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDate releasedate;
	private String copywrite;
	
	@OneToMany(mappedBy = "album",cascade = CascadeType.PERSIST)
	
	private List<Song> songs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(LocalDate releasedate) {
		this.releasedate = releasedate;
	}

	public String getCopywrite() {
		return copywrite;
	}

	public void setCopywrite(String copywrite) {
		this.copywrite = copywrite;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	

}
