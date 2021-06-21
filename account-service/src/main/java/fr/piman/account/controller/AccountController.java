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

	//@PreAuthorize("#oauth2.hasScope('server') or #name.equals('demo')")
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Account getAccountByName(@PathVariable String name) {
		return accountService.findByName(name);
	}

	@RequestMapping(path = "/current", method = RequestMethod.GET)
	public Account getCurrentAccount(Principal principal) {
		return accountService.findByName(principal.getName());
	}

	@RequestMapping(path = "/current", method = RequestMethod.PUT)
	public void saveCurrentAccount(Principal principal, @Valid @RequestBody Account account) {
		accountService.saveChanges(principal.getName(), account);
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Account createNewAccount(@Valid @RequestBody User user) {
		return accountService.create(user);
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.DELETE)
	public void deleteAccountByName(@PathVariable String name){ accountService.deleteAccountByName(name);
	}

}
