package edu.hm.cs.iua.controllers;

import edu.hm.cs.iua.exceptions.login.UserNotFoundException;
import edu.hm.cs.iua.models.User;
import edu.hm.cs.iua.models.VisibleUserData;
import edu.hm.cs.iua.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public VisibleUserData find(@PathVariable Long id) throws UserNotFoundException {
        final User user = userRepository.findOne(id);
        if (user == null || !user.isValidated())
            throw new UserNotFoundException("User not found.");
        return VisibleUserData.getUserData(user);
    }

}
