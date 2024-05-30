package com.ifeanyi.netflixmovies;

import com.ifeanyi.netflixmovies.exception.NotFoundException;
import com.ifeanyi.netflixmovies.user.entity.User;
import com.ifeanyi.netflixmovies.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthorizationCodeAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HomeController {


    private final UserService userService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public  User home(OAuth2AuthenticationToken  auth2AuthenticationToken) {

       Map<String,Object> map = auth2AuthenticationToken.getPrincipal().getAttributes();

        User user = new User();
        user.setEmail((String) map.get("email"));
        user.setUsername((String) map.get("name"));
        user.setProfileImageUrl((String) map.get("avatar_url"));

        User savedUser;

        try {
            savedUser =  userService.getByEmail(user.getEmail());
        } catch (NotFoundException e) {
            savedUser=   userService.create(user);
        }

        return savedUser;
    }



}
