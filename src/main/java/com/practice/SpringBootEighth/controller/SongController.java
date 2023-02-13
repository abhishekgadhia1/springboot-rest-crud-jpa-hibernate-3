package com.practice.SpringBootEighth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.SpringBootEighth.bean.Song;
import com.practice.SpringBootEighth.service.SongService;

@RestController
public class SongController {

	@Autowired
	private SongService songService;
	
	@RequestMapping("/songs")
	public List<Song> getAllSongs()
	{
		return songService.getAllMovies();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/songs")
	public void addSong(@RequestBody Song song)
	{
		songService.addSong(song);
	}
}
