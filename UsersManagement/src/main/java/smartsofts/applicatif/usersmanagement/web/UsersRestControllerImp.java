package smartsofts.applicatif.usersmanagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import smartsofts.applicatif.usersmanagement.dao.User;
import smartsofts.applicatif.usersmanagement.service.IMetierUsers;

@RestController
@CrossOrigin("*")
public class UsersRestControllerImp implements IUsersRestController {
	@Autowired
	IMetierUsers iMetierUsers;
    
	//EndPoint listUsers
	@Override
	public ResponseEntity<List<User>> listUsers() {
		
		return new ResponseEntity<List<User>>(iMetierUsers.listUsers(), HttpStatus.FOUND);
	}
	
	
}
