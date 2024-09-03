package de.ricardo;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @With private int id;
    @With private String name;
    @With private Teacher teacher;
    @With private List<Student> students;

}
