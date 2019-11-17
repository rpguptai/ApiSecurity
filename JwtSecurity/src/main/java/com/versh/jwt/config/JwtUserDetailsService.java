package com.versh.jwt.config;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("testUser".equals(username)) {
			return new User("testUser", "$2a$10$IYdbuLP.K7pg4Loh/V/8quhdggS0qJcteZAVmypEe/iEJhiDQMBWO",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("No username with username: " + username);
		}
	}
}