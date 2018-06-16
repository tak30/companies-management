package io.github.tak30.companies.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@ToString
public class Company extends Entity<Long> {
    private final String name;
    private final String address;
    private final String city;
    private final String country;
    private final String email;
    private final String phoneNumber;
    private final List<BeneficialOwner> beneficialOwners;
}
