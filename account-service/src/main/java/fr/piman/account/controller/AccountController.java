package fr.piman.account.controller;

import fr.piman.account.domain.Account;
import fr.piman.account.domain.User;
import fr.piman.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	//@CrossOrigin(origins = "http://localhost:4200")
	//@PreAuthorize("#oauth2.hasScope('server') or #name.equals('demo')")
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Account getAccountByName(@PathVariable String name) {
		return accountService.findByName(name);
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path = "/current", method = RequestMethod.GET)
	public Account getCurrentAccount(Principal principal) {
		return accountService.findByName(principal.getName());
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path = "/current", method = RequestMethod.PUT)
	public void saveCurrentAccount(Principal principal, @Valid @RequestBody Account account) {
		accountService.saveChanges(principal.getName(), account);
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Account createNewAccount(@Valid @RequestBody User user) {
		return accountService.create(user);
	}
}
