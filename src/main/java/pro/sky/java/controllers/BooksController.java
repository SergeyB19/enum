package pro.sky.java.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.java.model.Genre;

@Controller
public class BooksController {

    @GetMapping
    public ResponseEntity<Object> findBooks(@Parameter(description = "Название книги целиком", example = "Война и мир")
                                            @RequestParam(required = false) String name,
                                            @RequestParam(required = false, name="Фамилия автора") String author,
                                            @RequestParam(required = false) String genre) {
       Genre genre1 =Genre.valueOf(genre.toUpperCase());

    }



                                            )
}
