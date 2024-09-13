package org.mauromendes.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Task extends PanacheEntity {

    @NotBlank
    public String title;

    public String description;
    public boolean completed = false; //Default value is false for every task created

    //toString method is overridden for better logging

    public String toString(){
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }


}
