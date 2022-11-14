package com.Services121.RestApi1.Services;

import java.util.List;

import com.Services121.RestApi1.Entitys.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long couseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);
}
