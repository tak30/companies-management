package io.github.tak30.companies.service.impl.repository;

import io.github.tak30.companies.model.Company;
import io.github.tak30.companies.service.impl.CollectionsBasedRepository;
import org.springframework.stereotype.Service;

@Service
public class CompaniesRepository extends CollectionsBasedRepository<Company, Long> {

}
