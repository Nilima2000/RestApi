package com.Services121.RestApi1.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Services121.RestApi1.Entitys.Course;
import com.Services121.RestApi1.dao.Coursedao;


@Service
public class CourseServiceimpl implements CourseService {

	@Autowired
	private Coursedao coursedao;
	//List<Course> list;
	
	public CourseServiceimpl()
	{
		
		
		
		//list=new ArrayList<>();
		//list.add(new Course(145,"Java Core Courses","This is a java "));
		//list.add(new Course(146,"Spring boot","Creating rest api using spring boot"));
		
		
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		return coursedao.findAll();
	}




	@Override
	public Course getCourse(long couseId) {
	
	//	Course c=null;
		//for(Course course:list) {
			//if(course.getId()==couseId)
		//	{
			//	c=course;
			//	break;
			//}
		//}
		return coursedao.getOne(couseId);
	}

	@Override
	public Course addCourse(Course course) {
		
		//list.add(course);
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		
//		list.forEach(e->{
//			if(e.getId()==course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
	//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=coursedao.getOne(parseLong);
		coursedao.delete(entity);
		}

}
