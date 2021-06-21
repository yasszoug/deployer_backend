package fr.piman.project.service;

import fr.piman.project.domain.Application;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Override
    public Application findByTitle(String name) {
        return null;
    }

    @Override
    public Application create(Application app) {
        return null;
    }


    @Override
    public void saveChanges(String name, Application update) {

    }


    @Override
    public void deleteApplicationByName(String name) {

    }
}
