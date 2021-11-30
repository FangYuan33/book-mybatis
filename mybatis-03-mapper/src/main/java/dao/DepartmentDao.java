package dao;

import entity.Department;

import java.util.List;

public interface DepartmentDao {
    List<Department> findAll();

    Department findById(String id);

    void insert(Department department);

    void update(Department department);

    void deleteById(String id);
}