package com.ead.course.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.ead.course.models.CourseModel;
import com.ead.course.specifications.SpecificationTemplate.CourseSpec;

public interface CourseService {

	CourseModel save(CourseModel courseModel);

	Optional<CourseModel> findById(UUID courseId);

	void delete(CourseModel courseModel);

	Page<CourseModel> findAll(Specification<CourseModel> spec, Pageable pegeable);

}
