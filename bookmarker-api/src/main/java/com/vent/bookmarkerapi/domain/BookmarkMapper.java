package com.vent.bookmarkerapi.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {
    public BookmarkDto toDto(Bookmark bookmark) {
        BookmarkDto bookmarkDto = new BookmarkDto();

        bookmarkDto.setId(bookmark.getId());
        bookmarkDto.setUrl(bookmark.getUrl());
        bookmarkDto.setTitle(bookmark.getTitle());
        bookmarkDto.setCreatedAt(bookmark.getCreatedAt());

        return bookmarkDto;
    }
}
