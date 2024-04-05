package com.mahesh.springboot.service;

import com.mahesh.springboot.entity.Department;

import java.util.List;


public interface DepartmentService  {
   public  Department fetchDepartmentById(Long departmentId);

    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public  void deleteDepartmentById(Long departmentId);

   public Department updateDepartmentById(Long departmentId, Department department);




   public Department fetchDepartmentByName(String departmentName);

 public  void updateDep(List<Department> departmentList);

//  public void updateDep(Long departmentId, Department departmentList);


//    Department updateDepartmentByBodies(Long departmentId, List<Department> departmentList);
}
