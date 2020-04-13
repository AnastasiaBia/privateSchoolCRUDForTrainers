/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.school.services;

import com.example.school.model.Trainers;
import java.util.List;


/**
 *
 * @author Natasa
 */
public interface TrainerInterface {
     public void insertTrainer(Trainers t);
     
     public List<Trainers> getAllTrainers();
     
     
     public Trainers getTrainerById(Integer id);
     
   public void updateTrainer(Trainers t);
   
   public void deleteTrainerById(Integer id);
   
   

}
