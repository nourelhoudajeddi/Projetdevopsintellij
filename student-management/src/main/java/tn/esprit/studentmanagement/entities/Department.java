package tn.esprit.studentmanagement.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.time.LocalDate; // import inutile, pas utilisé


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartment;
    private String name;
    private String location;
    private String phone;
    private String head; // chef de département

    @OneToMany(mappedBy = "department")
    private List<Student> students;
}
