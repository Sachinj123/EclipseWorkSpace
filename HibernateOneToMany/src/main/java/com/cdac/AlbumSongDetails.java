package com.cdac;

import java.time.LocalDate;
import java.util.List;

public class AlbumSongDetails {

	public static void main(String[] args) {
		
		
			AlbumSongDao dao = new AlbumSongDao();
			
			Song song = new Song();
			
			song.setTitle("Aanewala Pal Janewala Hai");
			song.setArtist("Rafi Sahab");
			song.setDuration(5.20);
			//song.setAlbum(album);
			
			
			Album album = new Album();
			album.setName("Old");
			album.setCopywrite("T-Series");
			album.setReleasedate(LocalDate.of(1997, 12, 12));
			

			dao.add(album);
			dao.add(song);
		

	}
}
