package com.yowshu.securitydemo.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //TODO 根据用户名查找对应密码与权限
        //TODO 封装用户信息并返回，参数：用户名，密码，权限
        User user = new User(username, "123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }
}
