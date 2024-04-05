package com.mahesh.springboot.service;

import com.mahesh.springboot.entity.Department;
import com.mahesh.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department depDb = departmentRepository.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())) {
//        if(department.getDepartmentname() != null) {
            depDb.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDb.setDepartmentCode(department.getDepartmentCode());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDb.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depDb);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }

    @Override
    public void updateDep(List<Department> departmentList) {
//        return departmentRepository.updateAll;
//        StringBuilder sb=new StringBuilder();
//
        for(Department department1: departmentList){
//            Optional<Department>optionalDepartment=departmentRepository.findById(department);
            saveDepartment(department1);

        }
    }

//    @Override
//    public void updateDep(Long departmentId, Department departmentList) {
//        for (int i = 0; i < departmentList.size(); i++) {
//            if (departmentList.get(i).getDepartmentId() == departmentId) {
//                Department dep = departmentRepository.findById(departmentId).get();
//            }
//        }
//    }

//    @Override
//    public Department updateDepartmentByBodies(Long departmentId,List<Department> departmentList) {
//        for(int i=0;i<departmentList.length;i++) {
//            if (departmentList.get(i).getDepartmentId() == departmentId) {
//                Department dep = departmentRepository.findById(departmentId).get();
//
//            }
//        }
//            if (Objects.nonNull(dep.getDepartmentName()) &&
//                    !"".equalsIgnoreCase(dep.getDepartmentName())) {
//                dep.setDepartmentName(dep.getDepartmentName());
//            }
//            if (Objects.nonNull(dep.getDepartmentCode()) &&
//                    !"".equalsIgnoreCase(dep.getDepartmentCode())) {
//                dep.setDepartmentCode(dep.getDepartmentCode());
//            }
//            if (Objects.nonNull(dep.getDepartmentAddress()) &&
//                    !"".equalsIgnoreCase(dep.getDepartmentAddress())) {
//                dep.setDepartmentAddress(dep.getDepartmentAddress());
//            }
//            return departmentRepository.save(dep);
//
//    }


}
