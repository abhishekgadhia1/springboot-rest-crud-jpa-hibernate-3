package com.practice.SpringBootEighth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.SpringBootEighth.bean.Song;
import com.practice.SpringBootEighth.repository.SongRepository;

@Service
public class SongService {

	@Autowired
	private SongRepository songRepository;
	
	public List<Song> getAllMovies() {
		
		List<Song> songs = new ArrayList<>();
		songRepository.findAll().forEach(songs :: add);
		return songs;
	}

	public void addSong(Song song) {
		songRepository.save(song);
		
	}
}
