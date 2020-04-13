/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.school.controllers;

import com.example.school.model.Trainers;
import com.example.school.services.TrainerInterface;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Natasa
 */
@Controller
public class TrainerController {

    @Autowired
    TrainerInterface ti;

//    Set startpage.jsp as default
    @GetMapping(value = "/")
    public String showStartPage() {

        return "startpage";
    }

    //Method to retrieve a list of all trainers and go to alltrainers.jsp
    @GetMapping(value = "/getalltrainers")
    public String fetchalltrainers(ModelMap mm) {

        List<Trainers> result = ti.getAllTrainers();
        mm.addAttribute("olatrainers", result);
        return "alltrainers";
    }

    //Method to retrieve a list of all trainers and go to updatetrainers.jsp
    @GetMapping(value = "/updatetrainers")
    public String updatetrainers(ModelMap mm) {

        List<Trainers> result = ti.getAllTrainers();
        mm.addAttribute("olatrainers", result);
        return "updatetrainers";
    }

    //Method to retrieve a list of all trainers and go to deletetrainers.jsp
    @GetMapping(value = "/deletetrainers")
    public String deletetrainers(ModelMap mm) {

        List<Trainers> result = ti.getAllTrainers();
        mm.addAttribute("olatrainers", result);
        return "deletetrainers";
    }

    //Method to create a Trainer before going to inserttrainerform.jsp
    @GetMapping(value = "/preinserttrainer")
    public String preinsertTrainer(ModelMap mm) {
        Trainers t = new Trainers();
        mm.addAttribute("trainer", t); // This will go in modelAttribute in the form

        return "inserttrainerform";
    }

    //Method that gets the form posting and inserts trainer in database
    @PostMapping(value = "/inserttrainer")
    //Gets the trainer entity with  Modelattribute
    //BindingResult  stores all the data of the form that is connected with the Entity

    public String insertProduct(@Valid @ModelAttribute("trainer") Trainers t, BindingResult br, ModelMap mm) {

        //ServerSide Validation 
        if (br.hasErrors()) {

            return "inserttrainerform";
        }
        ti.insertTrainer(t);

        return "startpage";
    }

    //Method to create a Trainer before going to updateform.jsp
    @GetMapping(value = "preupdate/{id}")
    public String preupdate(@PathVariable(name = "id") Integer id,
            ModelMap mm) {

        mm.addAttribute("trainer", ti.getTrainerById(id));

        return "updateform";
    }

    //Method to create a Trainer before going to deleteform.jsp
    @GetMapping(value = "predelete/{id}")
    public String predelete(@PathVariable(name = "id") Integer id,
            ModelMap mm) {

        mm.addAttribute("trainer", ti.getTrainerById(id));

        return "deleteform";
    }

    //Method that gets the form posting and updates trainer in database
    @PostMapping(value = "/updatetrainer")
    public String updateTrainer(ModelMap mm, @RequestParam(name = "trainerId") Integer trainerId, @RequestParam(name = "trainerName") String trainerName,
            @RequestParam(name = "trainerLastname") String trainerLastname, @RequestParam(name = "trainerSubject") String trainerSubject) {
        Trainers t = new Trainers();
        t.setTrainerId(trainerId);
        t.setTrainerName(trainerName);
        t.setTrainerLastname(trainerLastname);
        t.setTrainerSubject(trainerSubject);
        ti.updateTrainer(t);

        return "redirect: updatetrainers";
    }

    //Method that gets the form posting and deletes trainer in database
    @PostMapping(value = "/deletetrainer")
    public String deleteTrainer(ModelMap mm, @RequestParam(name = "trainerId") Integer trainerId) {

        ti.deleteTrainerById(trainerId);

        return "redirect: deletetrainers";
    }

}
