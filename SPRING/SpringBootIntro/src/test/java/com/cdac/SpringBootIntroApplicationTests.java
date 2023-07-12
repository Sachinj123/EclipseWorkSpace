package com.cdac;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.entity.Album;
import com.cdac.entity.Song;
import com.cdac.respository.AlbumRepository;
import com.cdac.respository.SongRepository;

@SpringBootTest
class SpringBootIntroApplicationTests {

	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongRepository songRepository;
	
	@Test
	void addAlbum() {
		
		Album album = new Album();
		album.setName("Hits of 2023");
		album.setReleaseDate(LocalDate.of(2023, 7, 23));
		album.setCopyWrite("T-Series");
		
		albumRepository.save(album);
 }

	@Test
	void addSong() 
	
	{
		Album album = albumRepository.findById(1).get();
		//1 --- > Album id
		
		Song song = new Song();
		song.setTitle("First Time");
		song.setArtist("Ellie Goulding");
		song.setDuration(3.55);
		song.setAlbum(album);
		
		songRepository.save(song);
		
	}
	
	@Test
	void fetchsong()
	{
		List<Song> list = songRepository.findSongByArtist("Ellie Goulding");
		for(Song song : list)
		{
			System.out.println(song.getTitle()+" "+song.getDuration());
		}
	}
	
	// This is for when we doesnt follow naming convention
	@Test
	void fetchSong1()
	{
		List<Song> list = songRepository.fetchSongsSungBy("Ellie Goulding");
		for(Song song : list)
		{
			System.out.println(song.getTitle()+" "+song.getDuration());
		}
	}
}
