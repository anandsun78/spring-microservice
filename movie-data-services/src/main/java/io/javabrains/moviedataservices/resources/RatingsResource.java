package io.javabrains.moviedataservices.resources;

import io.javabrains.moviedataservices.model.Rating;
import io.javabrains.moviedataservices.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRatings(@PathVariable("userId") String userId)
    {
        UserRating userRating = new UserRating();
         List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678",3)
        );

        userRating.setUserRating(ratings);
        return userRating;

    }
}