package io.github.tak30.companies.controller;

import io.github.tak30.companies.model.Company;
import io.github.tak30.companies.service.api.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompaniesController {


    @Autowired
    private CompaniesService companiesService;

    @RequestMapping(value = "/companies", produces = "application/json; charset=UTF-8")
    public @ResponseBody
    List<Company> getAllCompanies() {
        return companiesService.getAll();
    }

    @RequestMapping(value = "/companies", method = RequestMethod.POST)
    public @ResponseBody
    void addCompany(Company company) throws Exception {
        companiesService.add(company);
    }



}