package com.mahesh.springboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.springboot.entity.Department;
import com.mahesh.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
//    @Autowired
//    List<Department> departmentList;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
   @GetMapping
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }
@GetMapping("/{id}")
public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
   return  departmentService.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Sucessfully";

    }
@PutMapping("/{id}")
public Department updateDepartmentById(@PathVariable("id")Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartmentById(departmentId,department);

    }
  @GetMapping("/name/{name}")
  public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
//   @PostMapping("/{id}")
//    public Department updateDepartmentByBodies(@PathVariable("id")Long departmentId, @RequestBody List<Department> departmentList )
//    {
//      return departmentService.updateDepartmentById(departmentId, (Department) departmentList);
//    }
   @PutMapping("/update")
    public String updateDep(@RequestBody List<Department> departmentList ){
        departmentService.updateDep(departmentList);



   return "successfully updated";
    }



}


