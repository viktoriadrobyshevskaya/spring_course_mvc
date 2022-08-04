package com.zaurtregulov.spring.mvc;

import com.zaurtregulov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field!")
    private String surname;
    @Min(value = 500, message = "must be greater than 500")
    @Max(value = 1000, message = "must be less than 1000")
    private int salary;
    private String department;
    private Map<String, String> departmentList;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> langList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please, use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "email must end with abc.com")
    private String email;

    public Employee() {
        departmentList = new HashMap<>();
        departmentList.put("Sales", "Sales");
        departmentList.put("Information Technology", "IT");
        departmentList.put("Human Resources", "HR");

        carBrands = new HashMap<>();
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Reno Laguna", "Reno");
        carBrands.put("Volkswagen", "VW");

        langList = new HashMap<>();
        langList.put("English", "EN");
        langList.put("French", "FR");
        langList.put("Deutsch", "DE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(Map<String, String> departmentList) {
        this.departmentList = departmentList;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
