package com.umapathy.demo.useradmin;

import java.util.List;

public interface UserService {
	
	public User insertUser(User user);
	public  User updateuser(User user);
	public void delete(int id);
	public List<User> viewUser();

}
