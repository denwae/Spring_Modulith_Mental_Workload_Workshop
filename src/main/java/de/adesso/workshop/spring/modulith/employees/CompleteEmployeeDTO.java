package de.adesso.workshop.spring.modulith.employees;

import java.time.LocalDate;
import java.util.UUID;

public record CompleteEmployeeDTO(
    UUID id,
    String firstName,
    String lastName,
    String email,
    LocalDate dateOfBirth,
    EmployerDto employer
) {

    public record EmployerDto(
        UUID id,
        String name,
        String address
    ) { }
}
