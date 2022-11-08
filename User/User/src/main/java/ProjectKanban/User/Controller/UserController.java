package ProjectKanban.User.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ProjectKanban.User.model.User;
import ProjectKanban.User.service.Userservice;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController
{
	
	@Autowired
	Userservice service;
	
	@GetMapping("/single/{dasId}")
    public User users(@PathVariable int dasId)
    {
        return service.users(dasId);
    }
	
	@GetMapping("/Registration")
	public List<User> getUsers()
	{
		return service.getUsers();
	}
	
	@PostMapping("/register")
	public User userDetails(@RequestBody User user)
	{
	    System.out.println(user);
		return service.saveUser(user);
	}
	
	@PutMapping("/update/{id}")
	public User updateSingleUser(@PathVariable int id)
	{
	    return service.updateSingleUser(id);
	}
	
	@PutMapping("/update")
	public User update(@RequestBody User user)
	{
	    return service.updateUser(user);
	}
	
	@DeleteMapping("/delete/{dasId}")
	public void delete(@PathVariable int dasId)
	{
	    service.delete(dasId);
	}

	@GetMapping("/search")
    public List<String> globalSearch(@RequestParam("query") String candidateName)
	{
        return service.search(candidateName);
    }
	
//	@PostMapping("/status")
//	public String status(@RequestBody String user)
//	{
//	    return service.status(user);
//	}
	
	@GetMapping("/card/{id}")
	public User cardStatus(@RequestParam("movingStatus") String cardStatus,@RequestParam("dasId") int dasId)
	{
	    return service.cardStatus(cardStatus,dasId);
	}
	

	
//	@GetMapping("/getBackLog")
//	public List<User> getBackLog()
//	{
//	    return service.getBackLog();
//	}
	
}

	
		
	
	

	


