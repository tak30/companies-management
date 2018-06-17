package io.github.tak30.companies.controller;

import io.github.tak30.companies.model.BeneficialOwner;
import io.github.tak30.companies.model.Company;
import io.github.tak30.companies.service.api.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompaniesController {


    @Autowired
    private CompaniesService companiesService;

    @RequestMapping(value = "/companies/{id}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public @ResponseBody
    Company getCompany(@PathVariable Long id) throws Exception {
        return companiesService.getCompany(id).orElseThrow(() -> new Exception("Not existent company"));
    }

    @RequestMapping(value = "/companies", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public @ResponseBody
    List<Company> getAllCompanies() {
        return companiesService.getAll();
    }

    @RequestMapping(value = "/companies", method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
    public void addCompany(@RequestBody Company company) throws Exception {
        companiesService.add(company);
    }

    @RequestMapping(value = "/companies/{id}", method = RequestMethod.PUT, consumes = "application/json; charset=UTF-8")
    public void updateCompany(@PathVariable Long id, @RequestBody Company company) throws Exception {
        company.setId(id);
        companiesService.update(company);
    }

    @RequestMapping(value = "/companies/{id}/beneficialOwners", method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
    public void addBeneficialOwners(@PathVariable Long id, @RequestBody List<BeneficialOwner> beneficialOwners) throws Exception {
        companiesService.addBeneficialOwners(id, beneficialOwners);
    }



}