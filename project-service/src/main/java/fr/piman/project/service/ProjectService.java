package fr.piman.project.service;

import fr.piman.project.domain.Project;
import org.springframework.stereotype.Service;

public interface ProjectService {

	Project findByTitle(String projectName);
	/**
	 * Finds Project by given name
	 *
	 * @param project Name
	 * @return found Project
	 */


	Project create(Project project);

	/**
	 * Checks if account with the same name already exists
	 * Invokes Auth Service user creation
	 * Creates new account with default parameters
	 *
	 * @return created project
	 */

	void saveChanges(String name, Project update);

	/**
	 * Validates and applies incoming project updates
	 *
	 * @param & update
	 */

    void deleteProjectByTitle(String name);
	/**
	 * Validates and delete incoming project
	 *
	 * @param name
	 */
}
