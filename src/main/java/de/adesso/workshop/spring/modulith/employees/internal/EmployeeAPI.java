package de.adesso.workshop.spring.modulith.employees.internal;

import de.adesso.workshop.spring.modulith.employees.CompleteEmployeeDTO;

import java.time.LocalDate;
import java.util.UUID;

public interface EmployeeAPI {

    CompleteEmployeeDTO createEmployee(String firstName, String lastName, LocalDate dateOfBirth, UUID companyId);

    CompleteEmployeeDTO getEmployee(UUID id);

    CompleteEmployeeDTO changeEmployer(UUID employeeId, UUID companyId);

    CompleteEmployeeDTO changeName(UUID employeeId, String firstName, String lastName);

    void deleteEmployee(UUID employeeId);
}
