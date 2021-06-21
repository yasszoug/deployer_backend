package fr.piman.project.repository;

import fr.piman.project.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends CrudRepository<Project, String> {

    Project findByTitle(String title);

}
