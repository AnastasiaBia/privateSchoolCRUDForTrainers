/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.school.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Natasa
 */
@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t"),
    @NamedQuery(name = "Trainers.findByTrainerId", query = "SELECT t FROM Trainers t WHERE t.trainerId = :trainerId"),
    @NamedQuery(name = "Trainers.findByTrainerName", query = "SELECT t FROM Trainers t WHERE t.trainerName = :trainerName"),
    @NamedQuery(name = "Trainers.findByTrainerLastname", query = "SELECT t FROM Trainers t WHERE t.trainerLastname = :trainerLastname"),
    @NamedQuery(name = "Trainers.findByTrainerSubject", query = "SELECT t FROM Trainers t WHERE t.trainerSubject = :trainerSubject")})
public class Trainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainer_id")
    private Integer trainerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "trainer_name")
    private String trainerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "trainer_lastname")
    private String trainerLastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "trainer_subject")
    private String trainerSubject;

    public Trainers() {
    }

    public Trainers(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public Trainers(Integer trainerId, String trainerName, String trainerLastname, String trainerSubject) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.trainerLastname = trainerLastname;
        this.trainerSubject = trainerSubject;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerLastname() {
        return trainerLastname;
    }

    public void setTrainerLastname(String trainerLastname) {
        this.trainerLastname = trainerLastname;
    }

    public String getTrainerSubject() {
        return trainerSubject;
    }

    public void setTrainerSubject(String trainerSubject) {
        this.trainerSubject = trainerSubject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerId != null ? trainerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainers)) {
            return false;
        }
        Trainers other = (Trainers) object;
        if ((this.trainerId == null && other.trainerId != null) || (this.trainerId != null && !this.trainerId.equals(other.trainerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.school.model.Trainers[ trainerId=" + trainerId + " ]";
    }
    
}
