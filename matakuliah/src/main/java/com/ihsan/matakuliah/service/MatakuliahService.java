/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ihsan.matakuliah.service;

import com.ihsan.matakuliah.entity.Matakuliah;
import com.ihsan.matakuliah.repository.MatakuliahRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */

@Service
public class MatakuliahService {
    @Autowired
    private MatakuliahRepository matakuliahRepository;
    
    
    
    public List<Matakuliah> getAll(){
        return matakuliahRepository.findAll();
    }
    
    public Matakuliah getMatakuliahById(Long id){
        return matakuliahRepository.findById(id).get();
    }
    
    public void insert(Matakuliah matakuliah){
        matakuliahRepository.save(matakuliah);
              
    }
}
