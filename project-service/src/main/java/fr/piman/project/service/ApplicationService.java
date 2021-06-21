package fr.piman.project.service;

import fr.piman.project.domain.Application;
import org.springframework.stereotype.Service;


public interface ApplicationService {

	Application findByTitle(String name);
	/**
	 * Finds Project by given name
	 *
	 * @return found application
	 */


	Application create(Application app);

	/**
	 * Checks if account with the same name already exists
	 * Invokes Auth Service user creation
	 * Creates new account with default parameters
	 *
	 * @return created application
	 */

	void saveChanges(String name, Application update);

	/**
	 * Validates and applies incoming project updates
	 *
	 * @param & update
	 */

    void deleteApplicationByName(String name);
	/**
	 * Validates and delete incoming project
	 *
	 * @param name
	 */
}
