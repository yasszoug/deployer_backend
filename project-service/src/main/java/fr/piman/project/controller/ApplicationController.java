package fr.piman.project.controller;


import fr.piman.project.domain.Application;
import fr.piman.project.domain.Project;
import fr.piman.project.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;

	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Application getApplicationByName(@PathVariable String name) {
		return applicationService.findByTitle(name);
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.PUT)
	public void saveApplication(@PathVariable String name, @Valid @RequestBody Application app) {
		applicationService.saveChanges(app.getName(), app);
	}
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Application createNewApplication(@Valid @RequestBody Application app) {
		return applicationService.create(app);
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.DELETE)
	public void deleteApplicationByName(@PathVariable String name){ applicationService.deleteApplicationByName(name);
	}

	@RequestMapping(path = "/demo", method = RequestMethod.GET)
	/*
	public void test() {
		System.out.println("project service khedam");
	}
	 */

	public Application demo(){

		Application p= new Application();
		p.setName("application test reussi");
		//mapped to hostname:port/home/index/
		return p;
	}

}
