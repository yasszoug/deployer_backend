package fr.piman.project.controller;


import fr.piman.project.domain.Project;
import fr.piman.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	//@PreAuthorize("#oauth2.hasScope('server') or #name.equals('demo')")
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Project getProjectByTitle(@PathVariable String name) {
		return projectService.findByTitle(name);
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.PUT)
	public void saveProject(@PathVariable String name, @Valid @RequestBody Project project) {
		projectService.saveChanges(project.getTitle(), project);
	}
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Project createNewProject(@Valid @RequestBody Project project) {
		return projectService.create(project);
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.DELETE)
	public void deleteProjectByName(@PathVariable String name){ projectService.deleteProjectByTitle(name);
	}

	@RequestMapping(path = "/demo1", method = RequestMethod.GET)
	/*
	public void test() {
		System.out.println("project service khedam");
	}
	 */

	public Project demo(){

		Project p = new Project();
		p.setTitle("Project test reussi");
		//mapped to hostname:port/home/index/
		return p;
	}

}
