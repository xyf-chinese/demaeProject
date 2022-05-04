package com.itheima.ruiji.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.ruiji.common.R;
import com.itheima.ruiji.entity.Employee;
import com.itheima.ruiji.mapper.EmployerMapper;
import com.itheima.ruiji.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployerMapper, Employee> implements EmployeeService {


}
