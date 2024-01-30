package org.prajjwal.SpringRestdemo.repository;

import java.util.List;

import org.prajjwal.SpringRestdemo.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    
    List<Album> findByAccount_id(long id);
}
