package com.sonata.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sonata.demo.entities.UserInfo;

@Service
public class Userserviceimpl implements UserService {

	List<UserInfo> list;
	
	public Userserviceimpl() {
		list = new ArrayList<>();
		list.add(new UserInfo(1,"Nagesh Pawar", "Complete UEP"));
		list.add(new UserInfo(2,"Ram Sharma", "Complete AWS"));
		list.add(new UserInfo(3,"Renuka Nele", "Complete Java Assessment"));
	}
	
	
	@Override
	public List<UserInfo> getData() {
		
		return list;
	}

}
