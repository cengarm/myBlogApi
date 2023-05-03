package com.example.MyBlogApi.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class UserGetMyBlogsResponse {

        private String title;

        private String body;

        private int commentCount;

        private Date createdAt;

    }

