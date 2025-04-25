package com.student.studentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
	@GetMapping("/students")
    public List<String> getStudents() {
        return List.of("Aman", "Suman", "Ravi");
    }

}
