package com.bechir.users.service;

import com.bechir.users.entities.Role;
import com.bechir.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
