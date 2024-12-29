package com.telusko.__jobApp.repo;

import com.telusko.__jobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class JobRepo {
//  ALL THE DATA IS PRESENT IN THIS CLASS.

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")),

            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    Arrays.asList("HTML", "CSS", "JavaScript", "React"))
    ));

// arrayList to store store JobPost objects
//    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//            new JobPost(1,"Java", "Hello world", 4, "null");
//));



//    public JobRepo() {
//
//        // Java Developer Job Post
//        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//        // Frontend Developer Job Post
//        jobs.add(
//                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                        3, List.of("HTML", "CSS", "JavaScript", "React")));
//    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }




//    public jobRepo(){
//        // Java Developer Job Post
//        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//    }




}
