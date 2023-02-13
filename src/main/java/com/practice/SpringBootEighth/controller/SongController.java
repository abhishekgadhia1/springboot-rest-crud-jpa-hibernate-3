package com.practice.SpringBootEighth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(method=RequestMethod.PUT, value="/songs/{id}")
	public void updateSong(@PathVariable String id, @RequestBody Song song)
	{
		songService.updateSong(id, song);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/songs/{id}")
	public void deleteMovie(@PathVariable String id)
	{
		songService.deleteSong(id);
	}
}
