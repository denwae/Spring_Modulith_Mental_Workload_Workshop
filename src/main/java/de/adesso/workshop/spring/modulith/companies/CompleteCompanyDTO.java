package de.adesso.workshop.spring.modulith.companies;

import java.util.UUID;

public record CompleteCompanyDTO(
    UUID id,
    String name,
    String address,
    AdministratorDTO administrator
) {

    public record AdministratorDTO(
        UUID id,
        String firstName,
        String lastName,
        String email
    ){ }
}
