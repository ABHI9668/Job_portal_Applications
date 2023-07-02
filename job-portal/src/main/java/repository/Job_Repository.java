package repository;
import org.springframework.data.repository.CrudRepository;

public interface Job_Repository extends CrudRepository<Job, Long>{

    List<Job> findByTitle(String title);

    List<Job> findByDescriptionContaining(String keyword);

    List<Job> findByLocationAndJobType(String location, JobType jobType);

    List<Job> findByAppliedDateAfter(LocalDate date);

    // Custom query example

    @Query("SELECT j FROM Job j WHERE j.salary > :minSalary")
    List<Job> findByMinSalary(@Param("minSalary") Double minSalary);
}
