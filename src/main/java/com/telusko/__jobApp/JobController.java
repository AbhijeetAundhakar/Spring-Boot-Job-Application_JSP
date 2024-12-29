package com.telusko.__jobApp;

import com.telusko.__jobApp.model.JobPost;
import com.telusko.__jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

//    This is for calling the home page.
    @GetMapping({"/", "home"})      //  This method will be called for both the request. / and home
    public String home(){
        return "home";
    }




//    This is for calling the addJob page.
    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }



//    This below is for handling the post request present in the addjob form.
    @PostMapping("handleForm")       //  In html <form action = "handleForm" this name you have to mention.
    public String handleForm(JobPost jobPost){      //  This jobPost object is for accepting the data from the user in the form.
        service.addJob(jobPost);
        return "success";
    }


//    This given below is for viewAllJobs page.
    @GetMapping("viewalljobs")
    public String viewAllJobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

}
