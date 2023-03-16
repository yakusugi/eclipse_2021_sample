package com.dreams.budget_trakcer_project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dreams.budget_trakcer_project.entity.User;
import com.dreams.budget_trakcer_project.repository.UserRepository;
/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    UserRepository userRepository;
	public List<User> searchAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
