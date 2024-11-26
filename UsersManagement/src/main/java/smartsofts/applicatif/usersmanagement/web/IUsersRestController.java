package smartsofts.applicatif.usersmanagement.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import smartsofts.applicatif.usersmanagement.dao.User;

public interface IUsersRestController {
	
	@GetMapping("/users")
	ResponseEntity<List<User>> listUsers();

}
