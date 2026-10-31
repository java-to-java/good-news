package com.goodnews.model;

import java.time.LocalDateTime;

public record NewsStory(
        String title,
        String link,
        String summary,
        String category,
        String source,
        String color,
        LocalDateTime publishedAt
) {
}
