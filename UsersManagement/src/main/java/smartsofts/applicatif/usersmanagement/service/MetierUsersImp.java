package smartsofts.applicatif.usersmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
import smartsofts.applicatif.usersmanagement.dao.User;
import smartsofts.applicatif.usersmanagement.dao.UserRepository;

@Service
@Slf4j
public class MetierUsersImp implements IMetierUsers {
	@Autowired
	private UserRepository userRepository;
	
	//method listUsers
	@Override
    @Transactional(readOnly = true)
	public List<User> listUsers() {
		
		return userRepository.findAll();
	}

}
