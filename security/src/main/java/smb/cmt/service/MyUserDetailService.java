package smb.cmt.service;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import smb.cmt.ebc.UserEbc;
import smb.cmt.entity.UserDetail;

@Component
public class MyUserDetailService implements UserDetailsService {

	@Resource
	UserEbc userEbc;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetail myUserDetail =  (UserDetail) userEbc.findByUserName(username);
		if (myUserDetail == null) {
			throw new UsernameNotFoundException("User name does not exist : " + username);
		}
		return null;
	}

}
