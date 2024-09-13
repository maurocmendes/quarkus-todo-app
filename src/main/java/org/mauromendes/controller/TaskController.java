package org.mauromendes.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.mauromendes.model.Task;

import java.util.List;

@Path("/tasks")
public class TaskController {

    //GET request to /tasks will return all tasks in the database
    @GET
    @Produces("application/json")
    public List<Task> getAllTasks(){
        return Task.listAll();
    }

    //GET request to /tasks/completed return all completed tasks
    @GET
    @Path("/completed")
    @Produces("application/json")
    public List<Task> getCompletedTasks(){
        return Task.list("Completed", true); //Fetch tasks where completed is true
    }



}
