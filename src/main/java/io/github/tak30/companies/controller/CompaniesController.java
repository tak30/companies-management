package io.github.tak30.companies.controller;

import io.github.tak30.companies.model.Company;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompaniesController {


    @RequestMapping(value = "/companies", produces = "application/json; charset=UTF-8")
    public @ResponseBody
    List<Company> getAllCompanies() {
        return null;
    }

}