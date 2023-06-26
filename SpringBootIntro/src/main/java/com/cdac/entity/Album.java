package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_album1")

public class Album {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private LocalDate releaseDate;
	private String CopyWrite;
	
	@OneToMany(mappedBy = "album", cascade = CascadeType.PERSIST)
	
	private List<Song> songs;
	
}
