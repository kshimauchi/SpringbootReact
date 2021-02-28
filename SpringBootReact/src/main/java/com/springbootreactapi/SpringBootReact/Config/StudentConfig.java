package com.springbootreactapi.SpringBootReact.Config;

import com.springbootreactapi.SpringBootReact.Repository.StudentRepository;
import com.springbootreactapi.SpringBootReact.Student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mark = new Student(
                    1L,
                    "Mark",

                    LocalDate.of(2000, Month.JANUARY, 5),
                    "google@gmail.com"
            );
            Student alex = new Student(
                    "Alex",
                     LocalDate.of(1996, Month.FEBRUARY, 3),
                    "alex@jfdklas.net"
            );
            //TODO: this is just concept right now
            repository.saveAll( List.of(mark, alex) );
        };
    }
}

