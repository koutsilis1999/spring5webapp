package com.example.spring5webapp.reposotories;

import com.example.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author,Long>{

}
