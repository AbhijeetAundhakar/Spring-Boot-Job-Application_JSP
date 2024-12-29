package com.telusko.__jobApp.service;

import com.telusko.__jobApp.model.JobPost;
import com.telusko.__jobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
//      THIS METHOD IS FOR ADDING AND VIEW THE DATA.

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
