package io.github.tak30.companies.service.api;

import io.github.tak30.companies.model.BeneficialOwner;
import io.github.tak30.companies.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompaniesService {

    void add(Company company) throws Exception;

    List<Company> getAll();

    Optional<Company> getCompany(Long id);

    void update(Company company) throws Exception;

    void addBeneficialOwners(Long companyId, List<BeneficialOwner> beneficialOwnerList) throws Exception;
}
