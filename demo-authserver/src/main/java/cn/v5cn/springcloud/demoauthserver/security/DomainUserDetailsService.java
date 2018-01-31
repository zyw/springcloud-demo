package cn.v5cn.springcloud.demoauthserver.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by wangyunfei on 2017/6/9.
 */
//@Service("userDetailsService")
public class DomainUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

//    @Autowired
//    private  SysUserRepository sysUserRepository;

   /* @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String lowcaseUsername = username.toLowerCase();
        Optional<SysUser> realUser = sysUserRepository.findOneWithRolesByUsername(lowcaseUsername);



        return realUser.map(user -> {
            Set<GrantedAuthority> grantedAuthorities = user.getAuthorities();
            return new User(user.getUsername(),user.getPassword(),grantedAuthorities);
        }).orElseThrow(() -> new UsernameNotFoundException("用户" + lowcaseUsername + "不存在!"));
    }*/
}
