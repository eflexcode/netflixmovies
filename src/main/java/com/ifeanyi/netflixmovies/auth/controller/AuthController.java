package com.ifeanyi.netflixmovies.auth.controller;

import com.ifeanyi.netflixmovies.movie.entity.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/authSuccess")
    @ResponseStatus(HttpStatus.OK)
    public String create() {
        return "pppppppppppppppppppppppppp";
    }

}
