package fr.piman.project.repository;

import fr.piman.project.domain.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, String> {

    Application findByName(String name);

}