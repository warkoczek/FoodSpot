package pl.warkoczewski.foodspot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{

    private final UserDetailsService userDetailsService;

    public WebSecurityConfiguration(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                    .antMatchers("/home/homePage", "/sign_in").permitAll()
                    .antMatchers("/searchPlaces/byCoordinates").authenticated()
                    .antMatchers("/admin/administrator").hasAnyRole("ADMIN", "USER")
                    .and()
                .formLogin()
                    .loginPage("/sign_in")
                    .usernameParameter("username")
                    .passwordParameter("password")
                    .permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/admin/accessDenied")
        ;
    }

}
