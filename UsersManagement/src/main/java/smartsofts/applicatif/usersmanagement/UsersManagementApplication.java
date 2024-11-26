package smartsofts.applicatif.usersmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersManagementApplication.class, args);
	}
    
	/*
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		
		
		return args -> {
			userRepository.save(new User(null, "Elkanoun", "Elkanoun@gmail.com"));
			userRepository.save(new User(null, "Ghyami", "Ghyami@gmail.com"));
			userRepository.save(new User(null, "Aboudi", "Aboudi@gmail.com"));
		
					
			        
		};
		
	}
	*/
	
	
	
	
	

}
