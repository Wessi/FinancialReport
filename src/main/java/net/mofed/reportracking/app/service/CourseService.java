package net.mofed.reportracking.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mofed.reportracking.app.model.Course;
import net.mofed.reportracking.app.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourse(){
		return courseRepository.findAll();
		}
	
	public void save(Course course) {
		courseRepository.save(course);
	}
	
	public Optional<Course>findById(Integer id){
		return courseRepository.findById(id);
	}
	
	
	public void delete(Integer id) {
		courseRepository.deleteById(id);
	}

}
