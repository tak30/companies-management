package io.github.tak30.companies.service.impl.repository;

import io.github.tak30.companies.model.Company;
import io.github.tak30.companies.service.impl.CollectionsBasedRepository;
import org.springframework.stereotype.Service;

@Service
public class CompaniesRepository extends CollectionsBasedRepository<Company, Long> {

    public CompaniesRepository() {
        Company company = Company.builder().id(1).name("companyName").address("add").city("city").country("country").phoneNumber("636").build();
        try {
            this.add(company);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
