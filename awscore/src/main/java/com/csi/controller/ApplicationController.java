package com.csi.controller;

import com.csi.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello !!!!!";
    }
    @GetMapping("/address")
    public String sayAddress(){
        return "Pune, Maharastra , India";
    }
    @GetMapping("/services")
    public String sayServices(){
        return "E commerece ...";
    }
    @GetMapping("/employeelist")
    public List<Employee> employeeList(){
        return Stream.of(new Employee(1,"AK" , 766554),new Employee(2,"RK" , 866554)).collect(Collectors.toList());
    }

}
