package com.telusko.__jobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data       //  Because of this you don't need to create getter and setter, toString method and hashcode method etc. This is speciality of lombok dependency.
@NoArgsConstructor      //  This annotation is for default constructor.
@AllArgsConstructor     //  This is for all annotation
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
