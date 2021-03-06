package com.ttms.service;

import com.ttms.vo.Employee;
import com.ttms.vo.PageBean;
import com.ttms.vo.User;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 */
public interface EmpService {

    PageBean<Employee> findByPage(int pageSize, Integer currPage) throws Exception;

    Employee getEmpById(String emp_id) throws Exception;

    void update(Employee emp) throws Exception;

    void delEmp(String emp_id) throws Exception;

    PageBean<Employee> getEmps(String condition, int pageSize, Integer currPage) throws Exception;

    void addEmp(Employee emp) throws Exception;

    boolean checkNo(String emp_no) throws Exception;

    PageBean<User> findUserByPage(int pageSize, Integer currPage) throws Exception;

    void delUser(String emp_no) throws Exception;

    User getUser(String emp_no) throws Exception;

    void updateuser(User user) throws Exception;

    PageBean<Employee> findByPage(int pageSize, Integer currPage, String str) throws Exception;

    void addUser(String emp_no) throws Exception;
}
