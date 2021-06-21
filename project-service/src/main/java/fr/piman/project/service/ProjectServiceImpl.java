package fr.piman.project.service;

import fr.piman.project.domain.Project;
import fr.piman.project.repository.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class ProjectServiceImpl implements ProjectService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private ProjectRepository repository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Project findByTitle(String projectTitle) {
		Assert.hasLength(projectTitle);
		return repository.findByTitle(projectTitle);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Project create(Project project) {

		Project existing = repository.findByTitle(project.getTitle());
		Assert.isNull(existing, "Project already exists: " + project.getTitle());

		Project p = new Project();
		p.setTitle(project.getTitle());
		p.setDescription(project.getDescription());
		p.setAdmins(project.getAdmins());
		p.setMembers(project.getMembers());
		p.setApplications(project.getApplications());

		repository.save(p);
		log.info("new account has been created: " + p.getTitle());

		return p;
	}


	@Override
	public void saveChanges(String title, Project update) {

		Project p = repository.findByTitle(title);
		Assert.notNull(p, "can't find account with name " + title);

		p.setApplications(update.getApplications());
		p.setDescription(update.getDescription());
		p.setAdmins(update.getAdmins());
		p.setTitle(update.getTitle());
		p.setMembers(update.getMembers());

		repository.save(p);

		log.debug("The project {} changes has been saved", p.getTitle());
	}

	@Override
	public void deleteProjectByTitle(String title) {

		Project p = repository.findByTitle(title);
		repository.delete(p);
		Assert.notNull(p, "Project " + p.getTitle()+ " deleted");
		log.debug("Project {} has been deleted", p.getTitle());
	}
}
