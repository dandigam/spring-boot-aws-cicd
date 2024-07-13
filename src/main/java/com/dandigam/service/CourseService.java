package com.dandigam.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dandigam.model.Course;

@Service
public class CourseService {

	private List<Course> courses = new ArrayList<>();

	public Course addCourse(Course course) {
		courses.add(course);
		return course;
	}

	public List<Course> getCouseList() {
		return courses;
	}

	public String deleteCouse(Long id) {
		Iterator<Course> itr = courses.iterator();
		while (itr.hasNext()) {
			Course course = itr.next();
			if (course.getId().equals(id)) {
				itr.remove();
			}
			itr.remove();
		}
		return "Deleted";
	}

}
