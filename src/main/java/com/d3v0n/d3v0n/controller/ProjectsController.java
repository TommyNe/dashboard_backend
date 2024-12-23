package com.d3v0n.d3v0n.controller;

import com.d3v0n.d3v0n.model.Projects;
import com.d3v0n.d3v0n.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectsController {

    @Autowired
    ProjectRepository projectRepository;

    @PostMapping
    public String create(@RequestBody Projects projects) {
        projectRepository.save(projects);
        return "Project created successfully";
    }

    @GetMapping
    public List<Projects> getAllProjects() {
        List<Projects> projects = projectRepository.findAll();
        return projects;
    }
}
