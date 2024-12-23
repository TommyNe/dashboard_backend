package com.d3v0n.d3v0n.repository;

import com.d3v0n.d3v0n.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Projects, String>{
}
