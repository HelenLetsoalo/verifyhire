package za.co.verifyhire.service;

import java.util.ArrayList;
import java.util.List;

import za.co.verifyhire.model.Job;

public class JobService{

    private List<Job> jobs;

    public JobService(){
        this.jobs = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public Job findJobById(String jobId) {
        for(Job job: jobs){
            if(job.getJobId().equals(jobId)){
                return job;
            }
        }
        return null;
    }

    public List<Job> findOpenJobs() {
        List<Job> openJobs = new ArrayList<>();
        for(Job job: jobs){
            if(job.getStatus() == Job.JobStatus.OPEN){
                openJobs.add(job);
            }
        }
        return openJobs;
    }
}
