package com.dandigam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dandigam.model.Course;
import com.dandigam.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping
	public Course saveCourse(@RequestBody Course couse) {
		return courseService.addCourse(couse);
	}

	@GetMapping
	public List<Course> getCourseList() {
		return courseService.getCouseList();
	}

	@DeleteMapping
	public String deleteCourse(Long id) {
		return courseService.deleteCouse(id);
	}

}
