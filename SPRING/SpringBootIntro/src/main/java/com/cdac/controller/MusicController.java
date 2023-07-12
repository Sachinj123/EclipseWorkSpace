package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Album;
import com.cdac.entity.Song;
import com.cdac.service.MusicService;


@RestController
public class MusicController {
	
	@Autowired
	private MusicService musicService;

	//GET -- > Retrive the data
	//POST -- > Create a RSET API Resource
	//PUT -- > Update the REST API Resource
	//DELETE --- > Delete the REST API resource
	
	@PostMapping("/add-album")
	/*
	 * url passed in the POST "post" --- > localhost:8080/add-album
	 * 
	 * data passed in the JOSN (BODY ---> RAW --> JSON)
	 
	 {
   "name" : "Hits of 2022",
   "releaseDate" : "2022-12-25",
   "copywrite" : "Sony Music" 
      }
	  
	 * */
	 
	public String addAlbum(@RequestBody Album album)
	{
		musicService.saveAlbum(album);
		return "Album Added Successfully !!";
	}
	
	
	/**
	 *ADD SONG 
	  {
    "title" : "Pal",
    "artist" : "Arijit Singh",
    "duration" : "5.20",
    "album" : {
        "id" : 1
         }
      }
	 */
	
	@PostMapping("/add-song")
	public String addSong(@RequestBody Song song)
	{
		musicService.saveSong(song);
		return "Song Added Successfully !!";
		
	}
	
	/**
	 * UPDATE
	 *{
    "id" : "6",
    "title" : "Pal",
    "artist" : "Arijit Singh..",
    "duration" : "4.30",
    "album" : {
        "id" : 1
        }
     }
	 */
	
	@PutMapping("/update-song")
	public String updateSong(@RequestBody Song song)
	{
		musicService.saveSong(song);
		return "Song Updated SuccessFully !!";
	}
	
	/*
	 * localhost:8080/delete-song?id=6
	 * 
	 */
	@DeleteMapping("/delete-song")
	public String deleteSong(@RequestParam ("id") int id)
	{
		musicService.deleteSong(id);
		return "Song Deleted Successfully !!";
	}
}
