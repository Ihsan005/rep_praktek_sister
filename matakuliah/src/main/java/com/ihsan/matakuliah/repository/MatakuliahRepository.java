package com.ihsan.matakuliah.repository;


import com.ihsan.matakuliah.entity.Matakuliah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Asus
 */
@Repository
public interface MatakuliahRepository extends JpaRepository<Matakuliah, Long> {

   
}