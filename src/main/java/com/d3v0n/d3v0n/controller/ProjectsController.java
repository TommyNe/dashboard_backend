package com.d3v0n.d3v0n.controller;

import com.d3v0n.d3v0n.controller.dto.Response;
import com.d3v0n.d3v0n.model.Projects;
import com.d3v0n.d3v0n.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectsController {

    @Autowired
    ProjectRepository projectRepository;

    @PostMapping
    public Response create(@RequestBody Projects projects) {
        LocalDateTime now = LocalDateTime.now();
        projects.setCreated_at(now.toString());
        projectRepository.save(projects);
        Response response = new Response();
        response.setMessage("Project created successfully");
        response.setStatus(200);
        return response;
    }

    @PutMapping
    public String update(@RequestBody Projects projects) {
        projects.setUpdated_at(LocalDateTime.now().toString());
        projectRepository.save(projects);
        return "Project updated successfully";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        projectRepository.deleteById(id);
        return "Project deleted successfully";
    }

    @GetMapping
    public List<Projects> getAllProjects() {
        List<Projects> projects = projectRepository.findAll();
        return projects;
    }
}
