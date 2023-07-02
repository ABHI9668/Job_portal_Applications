package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobService {

    private JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job save(Job job) {
        return jobRepository.save(job);
    }

    public Optional<Job> findById(Long id) {
        return jobRepository.findById(id);
    }

    public List<Job> findAll() {
        return (List<Job>) jobRepository.findAll();
    }

    public void deleteById(Long id) {
        jobRepository.deleteById(id);
    }


}
