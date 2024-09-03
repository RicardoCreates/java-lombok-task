package de.ricardo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

}
