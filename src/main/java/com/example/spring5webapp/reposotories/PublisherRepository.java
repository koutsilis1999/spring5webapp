package com.example.spring5webapp.reposotories;

import com.example.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
