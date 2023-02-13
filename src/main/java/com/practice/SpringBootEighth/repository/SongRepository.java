package com.practice.SpringBootEighth.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.SpringBootEighth.bean.Song;

public interface SongRepository extends CrudRepository<Song, String>{

}
