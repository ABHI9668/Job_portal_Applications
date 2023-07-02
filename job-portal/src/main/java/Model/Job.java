package Model;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private String location;

    @NotNull
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;

    @NotNull
    @Email
    private String companyEmail;

    private String companyName;
    private String employerName;

    @NotNull
    @Enumerated
    private JobType jobType;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appliedDate;
}
