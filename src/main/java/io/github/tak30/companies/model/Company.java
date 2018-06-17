package io.github.tak30.companies.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Company extends Entity<Long> {
    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private String address;
    @JsonProperty(required = true)
    private String city;
    @JsonProperty(required = true)
    private String country;
    private String email;
    private String phoneNumber;
    @JsonProperty(required = true)
    private List<BeneficialOwner> beneficialOwners;

}
