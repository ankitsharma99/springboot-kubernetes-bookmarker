package com.vent.bookmarkerapi;

import com.vent.bookmarkerapi.domain.Bookmark;
import com.vent.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component          // marks it as a spring bean
@RequiredArgsConstructor        // for auto injecting bookmark repository
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "Ankit Sharma Linkedin", "https://linkedin.com/in/ankit-sharma99", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Ankit Sharma LeetCode", "https://leetcode.com/ankitsharma99", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Ankit Sharma GitHub", "https://github.com/ankitsharma99", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Ankit Sharma Instagram", "https://instagram.com/ankit_irl", Instant.now()));
    }
}
