package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")

public class AlbumController {
    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("Abbey Road", "The Beatles", 1969, 17));
        add(new Album("American Idiot", "Green Day", 2004, 9));
        add(new Album("Catch a Fire", "Bob Marley and the Wailer", 1973, 9));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumJson() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """ +
                albumList +
                """
                        </ul>
                    </body>
                """;
    }
}