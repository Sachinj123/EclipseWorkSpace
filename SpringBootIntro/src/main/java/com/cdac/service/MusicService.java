package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Album;
import com.cdac.entity.Song;
import com.cdac.respository.AlbumRepository;
import com.cdac.respository.SongRepository;

import jakarta.transaction.Transactional;

@Service // --- > Instead of @Component
@Transactional //--- > Ethe pass kelya var method la pass karaychi garaj nahi
public class MusicService {
	
	@Autowired
	private SongRepository songRepository;
	
	@Autowired
	private AlbumRepository albumRepository;
	
	//SAVE method is responsible for insert,update
	public void saveAlbum(Album album)
	{
		albumRepository.save(album);
	}
	
	public void saveSong(Song song)
	{
		songRepository.save(song);
	}
	
	public Album fetchAlbum(int id)
	{
		return albumRepository.findById(id).get();
	}
	
	public Song fetchSong(int id)
	{
		return songRepository.findById(id).get();
	}
	
	public void deleteAlbum(int id)
	{
		albumRepository.deleteById(id);
	}
	
	public void deleteSong(int id)
	{
		songRepository.deleteById(id);
	}
	

}
