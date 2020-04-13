/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.school.services;

import com.example.school.model.Trainers;
import com.example.school.repositories.TrainerRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Natasa
 */
@Service
@Transactional
public class TrainerInterfaceImplementation implements TrainerInterface {

    @Autowired
    TrainerRepository tr;

    @Override
    public void insertTrainer(Trainers t) {
        tr.save(t);
    }

    @Override
    public List<Trainers> getAllTrainers() {
        List<Trainers> result = (List<Trainers>) tr.findAll();
        return result;
    }

    @Override
    public Trainers getTrainerById(Integer id) {
    Trainers result = tr.findById(id).get();
        return result;
    }

    @Override
    public void updateTrainer(Trainers t) {
        tr.save(t);

    }

    @Override
    public void deleteTrainerById(Integer id) {
        tr.deleteById(id);
       
    }

}
