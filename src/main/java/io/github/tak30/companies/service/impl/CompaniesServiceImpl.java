package io.github.tak30.companies.service.impl;

import io.github.tak30.companies.model.BeneficialOwner;
import io.github.tak30.companies.model.Company;
import io.github.tak30.companies.service.api.CompaniesService;
import io.github.tak30.companies.service.impl.repository.CompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class CompaniesServiceImpl implements CompaniesService {

    @Autowired
    private CompaniesRepository companiesRepository;

    @Override
    public void add(Company company) throws Exception {
        if (company.getBeneficialOwners() == null) {
            company.setBeneficialOwners(new CopyOnWriteArrayList<>());
        }
        companiesRepository.add(company);
    }

    @Override
    public List<Company> getAll() {
        return companiesRepository.getAll();
    }

    @Override
    public Optional<Company> getCompany(Long id) {
        return companiesRepository.get(id);
    }

    @Override
    public void update(Company company) throws Exception {
        companiesRepository.update(company);
    }

    @Override
    public void addBeneficialOwners(Long companyId, List<BeneficialOwner> beneficialOwners) throws Exception {
        Optional<Company> company = companiesRepository.get(companyId);
        if (company.isPresent()) {
            List<BeneficialOwner> existingBeneficialOwners = company.get().getBeneficialOwners();
            for (BeneficialOwner beneficialOwner : beneficialOwners) {
                if (!existingBeneficialOwners.contains(beneficialOwner)) {
                    existingBeneficialOwners.add(beneficialOwner);
                }
            }
        } else {
            throw new Exception("Company doesn't exists");
        }
    }
}
