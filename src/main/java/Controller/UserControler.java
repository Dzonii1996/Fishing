package Controller;

import Data.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControler {
    private UserRepository userRepository;
    @Autowired

    public UserControler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers(){

        return  userRepository.findAll();

    }
    @RequestMapping(method = RequestMethod.POST)
    public  void  addUser(@RequestBody AddUserRequest addUserRequest){
        User user= new User();
        user.setFirstName(addUserRequest.getName());
        user.setLastName(addUserRequest.getSurname());
        userRepository.save(user);
    }
}
