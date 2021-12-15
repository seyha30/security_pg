package smb.cmn.service;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import smb.cmn.ebc.UserEbc;
import smb.cmn.entity.UserDetail;

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
		
		return myUserDetail;
	}

}
