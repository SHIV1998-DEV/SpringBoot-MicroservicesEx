package com.app.shiv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
	@Autowired
	private Teacher Lesson;

	public Student() {

		super();
	}

	@Lookup 
	public Teacher Teacherobj() { 

		return null;
	}

	public Teacher getLesson() {
		Lesson=Teacherobj();
		return Lesson;
	}

	@Override
	public String toString() {
		return "Student [Lesson=" + Lesson + "]";
	}

}
