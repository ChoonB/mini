package com.sparta.mini.post.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestDto {

    private String title;;
    private String content;
    private String classNumber;
    private String specialty;
}
